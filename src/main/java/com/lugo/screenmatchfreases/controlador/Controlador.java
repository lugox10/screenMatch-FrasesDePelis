package com.lugo.screenmatchfreases.controlador;

import com.lugo.screenmatchfreases.frasesDTO.FraseDTO;
import com.lugo.screenmatchfreases.servicios.ServicioFrases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    ServicioFrases servicioFrases;


    @GetMapping ("/series/frases")
    public FraseDTO getFrase () {
        return servicioFrases.getFraseAleatoria ();
    }
}
