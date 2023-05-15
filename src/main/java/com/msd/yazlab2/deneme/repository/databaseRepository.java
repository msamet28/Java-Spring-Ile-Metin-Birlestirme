package com.msd.yazlab2.deneme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.msd.yazlab2.deneme.model.database;

public interface databaseRepository extends MongoRepository<database,String>{
    

}
