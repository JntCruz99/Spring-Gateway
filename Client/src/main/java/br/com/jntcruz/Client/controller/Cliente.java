package br.com.jntcruz.Client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class Cliente {

    @GetMapping
    public String getCliente(){
        return "Hello Client";
    }
}
