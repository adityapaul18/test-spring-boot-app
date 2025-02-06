package com.example.testbackennd.Service;

import com.example.testbackennd.Entity.Property;
import com.example.testbackennd.Repo.PropertRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertRepo repo;

    public void saveOrUpdate(Property property){
        repo.save(property);
    }

    public Iterable<Property> getall(){
        return this.repo.findAll();
    }

    public void deleteProperty(String id) {
        repo.deleteById(id);
    }

    public Property getPropertyById(String propertyid) {
        return repo.findById(propertyid).get();
    }

    public List<Property> getByOwner(String _id){
        return this.repo.findByOwnerId(_id);
    }
}
