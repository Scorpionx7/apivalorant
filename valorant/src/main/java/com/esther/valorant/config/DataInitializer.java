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

            // 1. Jett
            Agente jett = new Agente();
            jett.setName("Jett");
            jett.setFuncao("Duelista");
            jett.setNacionalidade("Sul-Coreana");

            Habilidades jettx = new Habilidades("Tormenta de Aço", "Arremessa várias facas letais.", Tecla.X, jett);
            Habilidades jettc = new Habilidades("Brisa de Impulso", "Dá um dash em uma direção escolhida.", Tecla.C, jett);
            Habilidades jette = new Habilidades("Corrente Ascendente", "Salta alto em direção vertical.", Tecla.E, jett);
            Habilidades jettq = new Habilidades("Fumaça Explosiva", "Lança uma fumaça que obscurece a visão.", Tecla.Q, jett);

            jett.setHabilidades(List.of(jettx, jettc, jette, jettq));
            agenteRepository.save(jett);

            //2. Phoenix
            Agente phoenix = new Agente();
            phoenix.setName("Phoenix");
            phoenix.setFuncao("Duelista");
            phoenix.setNacionalidade("Britânico");

            Habilidades phoenixX = new Habilidades("Renascimento","Revive após a morte durante sua ultimate.", Tecla.X, phoenix);
            Habilidades phoenixC = new Habilidades("Muralha de Chamas","Cria uma parede de fogo que cura.", Tecla.C, phoenix);
            Habilidades phoenixE = new Habilidades("Labareda","Arremessa uma bola de fogo que explode.", Tecla.E, phoenix);
            Habilidades phoenixQ = new Habilidades("Explosão Solar","Cega inimigos próximos.", Tecla.Q, phoenix);

            phoenix.setHabilidades(List.of(phoenixX, phoenixC, phoenixE, phoenixQ));
            agenteRepository.save(phoenix);

            //3. Sage

            Agente sage = new Agente();
            sage.setName("Sage");
            sage.setFuncao("Sentinela");
            sage.setNacionalidade("Chinesa");

            Habilidades sageX = new Habilidades("Ressurreição", "Revive um aliado caído.", Tecla.X, sage);
            Habilidades sageC = new Habilidades("Orbe de Barreira", "Cria uma barreira sólida.", Tecla.C, sage);
            Habilidades sageE = new Habilidades("Orbe Curativo", "Cura aliados ou a si mesma.", Tecla.E, sage);
            Habilidades sageQ = new Habilidades("Orbe Lentidão", "Cria uma área que desacelera inimigos.", Tecla.Q, sage);

            sage.setHabilidades(List.of(sageX, sageC, sageE, sageQ));
            agenteRepository.save(sage);

            //4. Sova
            Agente sova = new Agente();
            sova.setName("Sova");
            sova.setFuncao("Iniciador");
            sova.setNacionalidade("Russo");

            Habilidades sovaX = new Habilidades("Fúria do Caçador", "Lança raios penetrantes para eliminar inimigos.", Tecla.X, sova);
            Habilidades sovaC = new Habilidades("Drone Coruja", "Envia um drone para marcar inimigos.", Tecla.C, sova);
            Habilidades sovaE = new Habilidades("Flecha Rastreadora", "Dispara uma flecha que detecta inimigos próximos.", Tecla.E, sova);
            Habilidades sovaQ = new Habilidades("Flecha de Choque", "Dispara uma flecha explosiva que causa dano.", Tecla.Q, sova);

            sova.setHabilidades(List.of(sovaX, sovaC, sovaE, sovaQ));
            agenteRepository.save(sova);

            // 5. Reyna
            Agente reyna = new Agente();
            reyna.setName("Reyna");
            reyna.setFuncao("Duelista");
            reyna.setNacionalidade("Mexicana");

            Habilidades reynaX = new Habilidades("Imperatriz", "Entra em um estado de frenesi.", Tecla.X, reyna);
            Habilidades reynaC = new Habilidades("Olhar Voraz", "Cria um orbe que obscurece a visão dos inimigos.", Tecla.C, reyna);
            Habilidades reynaE = new Habilidades("Devorar", "Cura ao abater inimigos.", Tecla.E, reyna);
            Habilidades reynaQ = new Habilidades("Despedaçar", "Fica intangível após um abate.", Tecla.Q, reyna);

            reyna.setHabilidades(List.of(reynaX, reynaC, reynaE, reynaQ));
            agenteRepository.save(reyna);

            // 6. Brimstone
            Agente brimstone = new Agente();
            brimstone.setName("Brimstone");
            brimstone.setFuncao("Controlador");
            brimstone.setNacionalidade("Americano");

            Habilidades brimstoneX = new Habilidades("Ataque Orbital", "Lança um ataque orbital devastador.", Tecla.X, brimstone);
            Habilidades brimstoneC = new Habilidades("Incendiário", "Dispara um projétil incendiário.", Tecla.C, brimstone);
            Habilidades brimstoneE = new Habilidades("Fumaça Celestial", "Coloca fumaça em pontos estratégicos.", Tecla.E, brimstone);
            Habilidades brimstoneQ = new Habilidades("Sinalizador Estimulante", "Aumenta a cadência de tiro dos aliados.", Tecla.Q, brimstone);

            brimstone.setHabilidades(List.of(brimstoneX, brimstoneC, brimstoneE, brimstoneQ));
            agenteRepository.save(brimstone);

            // 7. Killjoy
            Agente killjoy = new Agente();
            killjoy.setName("Killjoy");
            killjoy.setFuncao("Sentinela");
            killjoy.setNacionalidade("Alemã");

            Habilidades killjoyX = new Habilidades("Bloqueio", "Atordoa inimigos em uma grande área.", Tecla.X, killjoy);
            Habilidades killjoyC = new Habilidades("Nanoswarm", "Armadilha de granada explosiva.", Tecla.C, killjoy);
            Habilidades killjoyE = new Habilidades("Torreta", "Instala uma torreta que dispara em inimigos.", Tecla.E, killjoy);
            Habilidades killjoyQ = new Habilidades("Alarme-bot", "Libera um bot que persegue inimigos.", Tecla.Q, killjoy);

            killjoy.setHabilidades(List.of(killjoyX, killjoyC, killjoyE, killjoyQ));
            agenteRepository.save(killjoy);

            





        }
    }
}
