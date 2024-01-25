package com.example.testbackennd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testapi {
    @GetMapping("/test")
    public String fn(){
        return "pehli java api test success";
    }

}
