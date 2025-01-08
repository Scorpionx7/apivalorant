package com.esther.valorant.controller;

import com.esther.valorant.entities.Mapa;
import com.esther.valorant.repository.MapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/mapas")
public class MapaController {

    @Autowired
    private MapaRepository mapaRepository;

    @GetMapping
    public List<Mapa> listarTodos() {
        return mapaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mapa buscarPorId(@PathVariable Long id) {
        return mapaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mapa não encontrado"));
    }


}
