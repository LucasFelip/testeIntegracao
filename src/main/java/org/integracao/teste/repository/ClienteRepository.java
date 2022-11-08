package org.integracao.teste.repository;

import org.integracao.teste.model.Cliente;
import org.integracao.teste.utils.DAO;

import javax.persistence.EntityManager;

public class ClienteRepository extends DAO<Cliente, Integer> {
    public ClienteRepository(EntityManager manager) {
        super(manager, Cliente.class);
    }
}
