package org.integracao.teste.service;

import org.integracao.teste.model.Aluguel;
import org.integracao.teste.repository.LocacaoRepository;
import lombok.AllArgsConstructor;
import org.integracao.teste.utils.exception.ResourceNotFoundException;

@AllArgsConstructor
public class LocacaoService {
    private final LocacaoRepository repository;
    private final ClienteService service;

    public void adicionarNovoAluguelAluguel(Integer clienteID, Integer locacaoID, Aluguel aluguel) {
        var cliente = service.buscarCliente(clienteID);

        var locacaoOptional = repository.findById(locacaoID);

        if(locacaoOptional.isEmpty())
            throw new ResourceNotFoundException("Locação não encontrada");

        var locacao = locacaoOptional.get();

        if(locacao.getValorAluguel() ==  aluguel.getValorPago())
            throw new ResourceNotFoundException("Valor do aluguel a pagar diferente do contrato");

        locacao.getAlugueis().add(aluguel);
        repository.save(locacao);
    }

}
