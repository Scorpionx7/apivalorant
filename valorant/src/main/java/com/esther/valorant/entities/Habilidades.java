package com.esther.valorant.entities;

import com.esther.valorant.entities.enums.Tecla;
import jakarta.persistence.*;

@Entity
public class Habilidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Tecla tecla;


    @ManyToOne
    @JoinColumn(name = "agente_id")
    private Agente agente;

    public Habilidades() {
    }

    public Habilidades( String nome, String descricao, Tecla tecla, Agente agente) {
        this.nome = nome;
        this.descricao = descricao;
        this.tecla = tecla;
        this.agente = agente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Tecla getTecla() {
        return tecla;
    }

    public void setTecla(Tecla tecla) {
        this.tecla = tecla;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
