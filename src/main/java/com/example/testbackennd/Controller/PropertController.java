package com.example.testbackennd.Controller;

import com.example.testbackennd.Entity.Property;
import com.example.testbackennd.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/vi/property")

public class PropertController {
    @Autowired
    private PropertyService PropertyService;

    @PostMapping("save")
    private String SaveProperty(@RequestBody Property property){
        PropertyService.saveOrUpdate(property);
        return property.get_id();
    }

    @GetMapping("getall")
    public Iterable<Property> getallProperties(){
        return PropertyService.getall();
    }

    @GetMapping("getbyowner/{id}")
    public List<Property> getbyowner(@PathVariable(name="id")String _id){
        return PropertyService.getByOwner(_id);
    }
}
