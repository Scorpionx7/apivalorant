package com.esther.valorant.repository;

import com.esther.valorant.entities.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgenteRepository extends JpaRepository {

    List<Agente> findByFuncao(String funcao);




}
