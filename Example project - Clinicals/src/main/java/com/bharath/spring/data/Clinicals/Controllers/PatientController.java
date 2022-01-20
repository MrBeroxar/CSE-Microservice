package com.bharath.spring.data.Clinicals.Controllers;

import com.bharath.spring.data.Clinicals.Entities.ClinicalData;
import com.bharath.spring.data.Clinicals.Entities.Patient;
import com.bharath.spring.data.Clinicals.Repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PatientController {

    private PatientRepository patientRepository;

    private Map<String, String> filters = new HashMap<>();

    @Autowired
    public PatientController(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    @RequestMapping (value="/patients", method = RequestMethod.GET)
    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }

    @RequestMapping(value="/patients/{id}")
    public Patient getPatient(@PathVariable("id") int id) {
        return patientRepository.findById(id).orElse(null);
    }

    @RequestMapping (value="/patients", method = RequestMethod.POST)
    public Patient savePatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @RequestMapping(value="/patient/analyze/{id}", method = RequestMethod.GET)
    public Patient analyze(@PathVariable("id") int id){
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient != null) {

            List<ClinicalData> clinicalData = patient.getClinicalData();
            List<ClinicalData> data = new ArrayList<>(clinicalData);

            for (ClinicalData cd : data){

               if (filters.containsKey(cd.getComponentName())){
                   clinicalData.remove(cd);
                   continue;
               } else {
                   filters.put(cd.getComponentName(),null);
               }
                    if(cd.getComponentName().equals("hw")){
                    String[] heightAndWeight = cd.getComponentValue().split("/");
                    if (heightAndWeight.length > 1){
                        float heightInMetres = Float.parseFloat(heightAndWeight[0]) * 0.4536F;
                        float bmi = Float.parseFloat(heightAndWeight[1]) / (heightInMetres * heightInMetres);
                        ClinicalData bmiObject = new ClinicalData("bmi", String.valueOf(bmi));
                        clinicalData.add(bmiObject);

                }}
            }
            filters = new HashMap<>();
            return patient;
        }
        else return null;
    }
}
