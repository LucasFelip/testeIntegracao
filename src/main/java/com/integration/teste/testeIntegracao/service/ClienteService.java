package com.integration.teste.testeIntegracao.service;

import com.integration.teste.testeIntegracao.model.Aluguel;
import com.integration.teste.testeIntegracao.model.Cliente;
import com.integration.teste.testeIntegracao.model.Locacao;
import com.integration.teste.testeIntegracao.repository.ClienteRepository;
import com.integration.teste.testeIntegracao.repository.LocacaoRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;
    private final LocacaoRepository locacaoRepository;


}
