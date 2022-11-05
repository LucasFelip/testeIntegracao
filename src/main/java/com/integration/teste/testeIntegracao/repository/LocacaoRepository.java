package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Locacao;
import org.springframework.data.jpa.repository.Query;

public interface LocacaoRepository {
    @Query("SELECT l " +
            "FROM Locacao as l " +
            "WHERE l.ativo = ?1")
    Locacao FindLocacaoByAtivo(boolean disponvel);
}
