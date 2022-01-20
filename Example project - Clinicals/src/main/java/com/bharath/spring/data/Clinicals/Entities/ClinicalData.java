package com.bharath.spring.data.Clinicals.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="clinicaldata")
public class ClinicalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String componentName;
    private String componentValue;
    private Timestamp measuredDateTime;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name="patient_id", nullable = false)
    @JsonIgnore
    private Patient patient;

    public ClinicalData(){

    }

    public ClinicalData(String componentName, String componentValue) {
        this.componentName = componentName;
        this.componentValue = componentValue;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentValue() {
        return componentValue;
    }

    public void setComponentValue(String componentValue) {
        this.componentValue = componentValue;
    }

    public Timestamp getMeasuredDateTime() {
        return measuredDateTime;
    }

    public void setMeasuredDateTime(Timestamp measuredDateTime) {
        this.measuredDateTime = measuredDateTime;
    }
}
