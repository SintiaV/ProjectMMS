package com.example.projectmms.configuration.controller.service;

import com.example.projectmms.configuration.controller.DAO.PatientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projectmms.configuration.controller.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    private PatientRepository repository;

    @Autowired
    PatientService(PatientRepository repo) {
        this.repository =repo;
    }

    public List<PatientDAO> getAll() {
        return this.repository.findAll();
    }

    public Optional<PatientDAO> getById(String id) {

        return this.repository.findById(id);
    }

    public PatientDAO addPatient (PatientDAO patient) {

        return this.repository.insert(patient);
    }
}
