package org.integracao.teste.repository;

import org.integracao.teste.model.Aluguel;
import org.integracao.teste.utils.DAO;
import javax.persistence.EntityManager;

public class AluguelRepository extends DAO<Aluguel, Integer> {
    public AluguelRepository(EntityManager manager) {
        super(manager, Aluguel.class);
    }
}
