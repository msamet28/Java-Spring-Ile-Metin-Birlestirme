package com.msd.yazlab2.deneme.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.msd.yazlab2.deneme.model.database;
import com.msd.yazlab2.deneme.repository.databaseRepository;
import com.msd.yazlab2.deneme.resource.databaseRequest;

@RestController
public class databaseController {


    private final databaseRepository databaserepository;


    public databaseController(databaseRepository databaserepository) {
        this.databaserepository = databaserepository;
    }


    @GetMapping("/dbekrani")
    public ResponseEntity<List<database>> getAlldatabases(){

        return ResponseEntity.ok(this.databaserepository.findAll());  

    }


    @PostMapping("/dbekrani")
    public ResponseEntity<database> createdatabase(databaseRequest databaseRequest1){

        database database1=new database();
        database1.setSoncumle(databaseRequest1.getSoncumle());
        database1.setCumleler(databaseRequest1.getCumleler());
        database1.setZaman(databaseRequest1.getZaman());

        return ResponseEntity.status(201).body(this.databaserepository.save(database1));    
    }
    
}
