package cl.g5.ej3Mod6.controller;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/capacitacion")
public class CrearCapacitacion {

    @GetMapping
    public String formCapacitacion(){
        return "crearCapacitacion";
    }

    @GetMapping("/lista")
    public String listaCapacitaciones(Model model){
        List<CapacitacionDTO> caps = new ArrayList<>();
        caps.add(new CapacitacionDTO("capacitacion1", "lista capacitacion uno"));
        caps.add(new CapacitacionDTO("capacitacion2", "lista capacitacion dos"));
        caps.add(new CapacitacionDTO("capacitacion3", "lista capacitacion tres"));
        caps.add(new CapacitacionDTO("capacitacion4", "lista capacitacion cuatro"));
        model.addAttribute("listaCaps",caps);
        return "capacitaciones";
    }
}

