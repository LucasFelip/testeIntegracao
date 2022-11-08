package org.integracao.teste.service;

import org.integracao.teste.model.Imovel;
import org.integracao.teste.repository.ImovelRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.integracao.teste.utils.exception.ResourceNotFoundException;

@AllArgsConstructor
public class ImovelService {
    private final ImovelRepository repository;

    public Imovel cadastrarImovel(Imovel imovel) {
        return repository.save(imovel);
    }

    public Imovel buscarImovel(Integer imovelID) {
        var imovelSalvo = repository.findById(imovelID);

        if(imovelSalvo.isEmpty())
            throw new ResourceNotFoundException(String.format("imovel com ID %s nao encontrado", imovelID));

        return imovelSalvo.get();
    }

    public Imovel atualizarDetalhesImovel(Integer imovelID, Imovel imovel) {
        var imovelSalvo = buscarImovel(imovelID);
        imovel.setId(imovelSalvo.getId());
        imovel.setLocacoes(imovelSalvo.getLocacoes());

        repository.save(imovel);

        return imovel;
    }

    public Optional<Imovel> removerImovel(Integer imovelID) {
        return repository.delete(imovelID);
    }

    public List<Imovel> buscarImovelDisponiveisPorTipoAndBairro(String tipoImovel, String bairro) {
        return repository.buscarImoveisPor(tipoImovel, bairro, true);
    }

    public List<Imovel> buscarImovelDisponiveisPorValorMaximo(Double valorAluguel) {
        return repository.buscarImoveisPor(valorAluguel, true);
    }

    public List<Imovel> buscarTodosImoveis() {
        return repository.findAll();
    }
}
