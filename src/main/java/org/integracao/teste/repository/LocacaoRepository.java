package org.integracao.teste.repository;

import org.integracao.teste.model.Locacao;
import org.integracao.teste.utils.DAO;
import javax.persistence.EntityManager;
import java.util.Optional;

public class LocacaoRepository extends DAO<Locacao, Integer> {
    public LocacaoRepository(EntityManager manager) {
        super(manager, Locacao.class);
    }

    public Optional<Locacao> buscarLocacaoPorClienteId(Integer clienteID) {
        var consult = "SELECT l FROM Locacao l WHERE l.cliente.id = :clienteID";
        var query = manager.createQuery(consult, clazz);
        query.setParameter("clienteID", clienteID);
        var result = query.getResultList();
        if(result.size() == 0)
            return Optional.empty();

        return Optional.ofNullable(result.get(0));
    }
}
