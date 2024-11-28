package com.lugo.screenmatchfreases.servicios;

import com.lugo.screenmatchfreases.frasesDTO.FraseDTO;
import com.lugo.screenmatchfreases.modelos.Frase;
import com.lugo.screenmatchfreases.repositoioFrases.RepositorioFrases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioFrases {

@Autowired
private RepositorioFrases repositori;

    public FraseDTO getFraseAleatoria () {
        Frase frase = repositori.getFraseAleatoria ();
        return new FraseDTO (frase.getId (), frase.getTitulo (), frase.getFrase (), frase.getPersonaje (), frase.getPoster ());

    }
}
