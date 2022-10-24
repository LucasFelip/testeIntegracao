package com.integration.teste.testeIntegracao.repository;


import com.integration.teste.testeIntegracao.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

}
