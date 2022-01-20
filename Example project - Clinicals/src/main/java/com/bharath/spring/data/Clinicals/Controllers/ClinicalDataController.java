package com.bharath.spring.data.Clinicals.Controllers;

import com.bharath.spring.data.Clinicals.Entities.ClinicalData;
import com.bharath.spring.data.Clinicals.Entities.ClinicalDataDTO;
import com.bharath.spring.data.Clinicals.Entities.Patient;
import com.bharath.spring.data.Clinicals.Repos.ClinicalDataRepository;
import com.bharath.spring.data.Clinicals.Repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ClinicalDataController {

    private ClinicalDataRepository clinicalDataRepository;
    private PatientRepository patientRepository;

    @Autowired
    public ClinicalDataController(ClinicalDataRepository clinicalDataRepository, PatientRepository patientRepository){
        this.patientRepository = patientRepository;
        this.clinicalDataRepository = clinicalDataRepository;
    }

    @RequestMapping(value="/clinicals", method = RequestMethod.POST)
    public ClinicalData saveClinicalData(@RequestBody ClinicalDataDTO data) {
        Patient patient = patientRepository.findById(data.getId()).orElse(null);
        if (patient != null) {
            ClinicalData clinicalData = new ClinicalData(data.getComponentName(), data.getComponentValue());
            clinicalData.setPatient(patient);
            return clinicalDataRepository.save(clinicalData);
        }
        return null;
    }
}
