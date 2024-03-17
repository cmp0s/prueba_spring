package com.example.coches.controller;

import com.example.coches.models.Coche;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CochesController {

    @GetMapping("/details")
    public String details(Model model) {

        Coche coche = new Coche("Mercedes", 50000);

        model.addAttribute("tittle", "Hola Mundo");
        model.addAttribute("coche", coche);

        return "details";
    }
}
