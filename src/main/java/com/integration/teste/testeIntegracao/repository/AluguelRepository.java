package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Aluguel;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {
    @Query("SELECT a.valor_pago " +
            "FROM Aluguel as a " +
            "WHERE a.valor_pago = ?1")
    float pagamentoAluguel(float valorPagamento);

    @Query("SELECT a " +
            "FROM Aluguel as a " +
            "WHERE a.valor_pago = ?1")
    List<Aluguel> findByValorPago(float valorPago);

    @Query("SELECT a " +
            "FROM Aluguel as a " +
            "WHERE a.dt_vencimento = ?1")
    List<Aluguel> findAluguelByDatavencimento(Date vencimento);
}
