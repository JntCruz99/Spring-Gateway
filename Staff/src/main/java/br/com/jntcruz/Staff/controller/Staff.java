package br.com.jntcruz.Staff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/staff")
public class Staff {

    @GetMapping
    public String getStaff(){
        return "Hello Staff";
    }
}
