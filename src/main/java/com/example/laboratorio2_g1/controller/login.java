package com.example.laboratorio2_g1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventario")

public class login {
    @GetMapping("/login")
    public String listaTipos (){
        return "incio2";
    }
}
