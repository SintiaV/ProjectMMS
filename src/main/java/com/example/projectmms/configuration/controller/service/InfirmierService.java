package com.example.projectmms.configuration.controller.service;

import com.example.projectmms.configuration.controller.DAO.InfirmierDAO;
import com.example.projectmms.configuration.controller.DAO.PatientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projectmms.configuration.controller.repository.InfirmierRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InfirmierService {
    private InfirmierRepository repo;
    @Autowired
    InfirmierService (InfirmierRepository repo) {
        this.repo=repo;
    }
    public List<InfirmierDAO> getAll(){
        return this.repo.findAll();
    }
    public Optional<InfirmierDAO> getById (String id) {
        return this.repo.findById(id);
    }
    public InfirmierDAO createInfirmier (InfirmierDAO item) {
        return this.repo.save(item);
    }

    public InfirmierDAO addPatient (String id, PatientDAO patient) {
        InfirmierDAO doc = this.repo.findById(id).get();
        doc.addPatient(patient);
        return this.repo.save(doc);
        }

}


