package com.example.mongoApi.repository;

import com.example.mongoApi.model.Oder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OderRepository extends MongoRepository<Oder, String> {
}
