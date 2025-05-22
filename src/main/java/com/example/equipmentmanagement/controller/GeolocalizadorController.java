package com.example.equipmentmanagement.controller;

import com.example.equipmentmanagement.service.Geolocalizador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/geo")
public class GeolocalizadorController {

    @Autowired
    private Geolocalizador geolocalizador;

    @GetMapping("/ubicacion")
    public String obtenerUbicacion(@RequestParam String apiKey) {
        try {
            return geolocalizador.obtenerUbicacion(apiKey);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}