package com.esther.valorant.controller;


import com.esther.valorant.entities.Agente;
import com.esther.valorant.entities.Habilidades;
import com.esther.valorant.repository.AgenteRepository;
import com.esther.valorant.service.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/agentes")
public class AgenteController {

    @Autowired
    private AgenteService agenteService;

    @GetMapping
    public ResponseEntity<List<Agente>> listarTodos() {
        return ResponseEntity.ok(agenteService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(agenteService.buscarPorId(id));
    }

    @GetMapping("/{id}/habilidades")
    public ResponseEntity<List<Habilidades>> listarHabilidades(@PathVariable Long id) {
        return ResponseEntity.ok(agenteService.listarHabilidades(id));
    }


}
