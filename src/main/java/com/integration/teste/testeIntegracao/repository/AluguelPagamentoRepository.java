package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelPagamentoRepository extends JpaRepository<Aluguel,Integer> {
    float pagamentoAluguel(float valorPagamento);
}