package com.example.coches.controller;

import com.example.coches.models.Coche;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CochesRestController {

    @GetMapping("/details")
    public String details() {
        Coche coche = new Coche("Seat", 200);
        Map<String, Object> body = new HashMap<>();

        body.put("tittle", "Hola Mundo");
        body.put("coche",coche.toString());

        return body.toString();
    }
}
