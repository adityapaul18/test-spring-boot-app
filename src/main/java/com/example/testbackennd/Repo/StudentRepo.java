package com.example.testbackennd.Repo;

import com.example.testbackennd.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,String> {

}
