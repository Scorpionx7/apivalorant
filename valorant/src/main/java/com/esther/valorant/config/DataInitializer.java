package com.esther.valorant.config;

import com.esther.valorant.entities.Agente;
import com.esther.valorant.entities.Habilidades;
import com.esther.valorant.entities.enums.Tecla;
import com.esther.valorant.repository.AgenteRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataInitializer {

    @Autowired
    private AgenteRepository agenteRepository;

    @PostConstruct
    public void inicializarDados(){
        if(agenteRepository.count() ==0){
            Agente jett = new Agente();
            jett.setName("Jett");
            jett.setFuncao("Duelista");
            jett.setNacionalidade("Jett é ágil e mortal...");

            Habilidades x = new Habilidades("Tormenta de Aço", "Arremessa várias facas letais.", Tecla.X, jett);
            Habilidades c = new Habilidades("Brisa de Impulso", "Dá um dash em uma direção escolhida.", Tecla.C, jett);
            Habilidades e = new Habilidades("Corrente Ascendente", "Salta alto em direção vertical.", Tecla.E, jett);
            Habilidades q = new Habilidades("Fumaça Explosiva", "Lança uma fumaça que obscurece a visão.", Tecla.Q, jett);

            jett.setHabilidades(List.of(x, c, e, q));

            agenteRepository.save(jett);

        }
    }
}
