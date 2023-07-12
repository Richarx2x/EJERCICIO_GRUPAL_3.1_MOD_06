package cl.g5.ej3Mod6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/capacitacion")
public class CrearCapacitacion {

    @GetMapping
    public String formCapacitacion(){
        return "crearCapacitacion";
    }

}
