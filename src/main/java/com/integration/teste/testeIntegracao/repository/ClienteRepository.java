package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findFirstByName(String nome);


}
