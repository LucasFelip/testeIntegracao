package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface AluguelPagamentoRepository extends JpaRepository<Aluguel,Integer> {
    @Query("SELECT a.valor_pago " +
            "FROM Aluguel as a " +
            "WHERE a.valor_pago = ?1")
    float pagamentoAluguel(float valorPagamento);
}