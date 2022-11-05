package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface ImovelRepository extends JpaRepository<Imovel, Integer> {
    @Query("SELECT i " +
            "FROM Imovel as i " +
            "WHERE i.valor_sugerido = ?1")
    Imovel FindImovelByAluguelSugerido(int valorSugeridoBuscado);
}
