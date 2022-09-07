package com.example.projectmms.configuration.controller;

import com.example.projectmms.configuration.controller.DAO.InfirmierDAO;
import com.example.projectmms.configuration.controller.DAO.PatientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.projectmms.configuration.controller.service.InfirmierService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/infirmier")
public class InfirmierController {
    private InfirmierService service;

    @Autowired
    InfirmierController(InfirmierService service) {

        this.service = service;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<InfirmierDAO> getAll() {

        return this.service.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<InfirmierDAO> getById(@PathVariable String id) {

        return this.service.getById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public InfirmierDAO createInfirmier(@RequestBody InfirmierDAO infirmier) {

        return this.service.createInfirmier(infirmier);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public InfirmierDAO updatePatients(@RequestBody PatientDAO patient, @PathVariable String id) {
        return this.service.addPatient(id, patient);
    }

}
