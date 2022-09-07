package com.example.projectmms.configuration.controller.repository;

import com.example.projectmms.configuration.controller.DAO.PatientDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<PatientDAO, String> {
}
