package com.bharath.spring.data.Clinicals.Repos;

import com.bharath.spring.data.Clinicals.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, Integer> {
}
