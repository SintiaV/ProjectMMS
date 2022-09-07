package com.example.projectmms.configuration.controller;

import com.example.projectmms.configuration.controller.DAO.PatientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.projectmms.configuration.controller.service.PatientService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
public class PatientController {
    private PatientService service;

    @Autowired
    PatientController(PatientService service) {

        this.service = service;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<PatientDAO> getAll () {

        return this.service.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<PatientDAO> getById(@PathVariable String id) {

        return this.service.getById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public PatientDAO create(@RequestBody PatientDAO patient) {

        return this.service.addPatient(patient);
    }

}
