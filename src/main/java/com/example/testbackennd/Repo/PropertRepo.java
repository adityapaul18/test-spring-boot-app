package com.example.testbackennd.Repo;

import com.example.testbackennd.Entity.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PropertRepo extends MongoRepository<Property,String> {
    List<Property> findByOwnerId(String ownerId);
}
