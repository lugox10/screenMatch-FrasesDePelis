package com.lugo.screenmatchfreases.repositoioFrases;

import com.lugo.screenmatchfreases.modelos.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RepositorioFrases extends JpaRepository<Frase, Long> {


    @Query(value = "SELECT * FROM frases ORDER BY RAND() LIMIT 1", nativeQuery = true)
    public Frase getFraseAleatoria () ;

}
