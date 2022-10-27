package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelPagamentoRepository extends JpaRepository<Aluguel,Integer> {
    float pagamentoAluguel(float valorPagamento);
}