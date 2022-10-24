package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Integer> {
    Imovel FindImovelByAtivo(boolean disponvel);

    int FindImovelByAluguelSugerido(int valorSugeridoBuscado);
}
