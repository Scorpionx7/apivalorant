package com.esther.valorant.service;


import com.esther.valorant.entities.Agente;
import com.esther.valorant.entities.Habilidades;
import com.esther.valorant.repository.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteService {

    @Autowired
    private AgenteRepository agenteRepository;


    public List<Agente> listarTodos() {
        return agenteRepository.findAll();
    }


    public Agente buscarPorId(Long id) {
        return agenteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agente não encontrado"));


    public List<Habilidades> listarHabilidades(Long agenteId) {
        Agente agente = buscarPorId(agenteId);
        return agente.getHabilidades();
    }

    public List<Agente> buscarPorFuncao(String funcao) {
        return agenteRepository.findByFuncao(funcao);
    }


}

