package com.bharath.spring.data.Clinicals.Repos;

import com.bharath.spring.data.Clinicals.Entities.ClinicalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicalDataRepository extends JpaRepository <ClinicalData, Integer> {
}
