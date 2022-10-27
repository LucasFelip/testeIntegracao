package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {
    List<Aluguel> findByValorPago(float valorPago);

    List<Aluguel> findByDataVencimento(Date vencimento);
}
