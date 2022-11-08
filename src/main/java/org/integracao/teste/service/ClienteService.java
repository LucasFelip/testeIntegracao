package org.integracao.teste.service;

import lombok.AllArgsConstructor;
import org.integracao.teste.model.Cliente;
import org.integracao.teste.repository.ClienteRepository;
import org.integracao.teste.utils.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;

    public Cliente cadastrarCliente(Cliente cliente) {
        var clienteSalvo = repository.save(cliente);
        return clienteSalvo;
    }

    public Cliente buscarCliente(Integer clienteID) {
        var clienteSalvo = repository.findById(clienteID);
        if(clienteSalvo.isEmpty())
            throw new ResourceNotFoundException("Cliente não encontrado");

        return clienteSalvo.get();
    }

    public Cliente atualizarDetalhesCliente(Integer clienteID, Cliente cliente) {
        var clienteSalvo = buscarCliente(clienteID);
        cliente.setId(clienteSalvo.getId());
        cliente.setLocacoes(clienteSalvo.getLocacoes());
        repository.save(cliente);
        return cliente;
    }

    public Optional<Cliente> removerCliente(Integer clienteID) {
        return repository.delete(clienteID);
    }

    public List<Cliente> buscarTodosClientes() {
        return repository.findAll();
    }
}
