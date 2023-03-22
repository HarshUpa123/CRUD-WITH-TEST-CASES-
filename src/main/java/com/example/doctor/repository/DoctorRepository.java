package com.example.doctor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctor.entity.DoctorEntity;
@Repository
public interface DoctorRepository extends JpaRepository <DoctorEntity, Integer> {
	DoctorEntity findById(int i);
}
