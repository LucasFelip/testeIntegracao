package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {
    List<Aluguel> findByValorPago(float valorPago);

    List<Aluguel> findByDataVencimento(Date vencimento);
}
