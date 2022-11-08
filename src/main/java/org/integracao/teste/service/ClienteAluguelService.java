package org.integracao.teste.service;

import lombok.AllArgsConstructor;
import org.integracao.teste.model.Aluguel;
import org.integracao.teste.model.Locacao;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ClienteAluguelService {
    private final ClienteService service;

    public List<Aluguel> buscarTodosAlugueisPagosPorCliente(Integer clienteID) {
        var cliente = service.buscarCliente(clienteID);
        if(Objects.isNull(cliente.getLocacoes()))
            return List.of();

        return cliente.getLocacoes().parallelStream().map(Locacao::getAlugueis).flatMap(List::stream).collect(Collectors.toList());
    }

    public List<Aluguel> buscarTodosAlugueisPagosPorClienteComAtraso(Integer clienteID) {
        var alugueis = buscarTodosAlugueisPagosPorCliente(clienteID);

        return alugueis.stream().filter(aluguel ->aluguel.getDataPagamento().compareTo(aluguel.getDataVencimento()) > 0).collect(Collectors.toList());
    }


}
