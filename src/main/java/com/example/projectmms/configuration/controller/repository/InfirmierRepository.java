package com.example.projectmms.configuration.controller.repository;

import com.example.projectmms.configuration.controller.DAO.InfirmierDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfirmierRepository extends MongoRepository <InfirmierDAO, String>{
}
