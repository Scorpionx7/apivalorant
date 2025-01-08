package com.esther.valorant.entities;


import com.esther.valorant.entities.enums.Tecla;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Agente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nacionalidade;
    private String funcao;

    @OneToMany(mappedBy = "agente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Habilidades> habilidades = new ArrayList<>();

    public void inicializarHabilidades(){
        for(Tecla tecla : Tecla.values()){
            Habilidades habilidade = new Habilidades();
            habilidade.setTecla(tecla);
            habilidade.setAgente(this);
            habilidades.add(habilidade);
        }
    }

    public Agente() {
    }

    public Agente(String name, String nacionalidade, String funcao) {
        this.name = name;
        this.nacionalidade = nacionalidade;
        this.funcao = funcao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Habilidades> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidades> habilidades) {
        this.habilidades = habilidades;
    }
}
