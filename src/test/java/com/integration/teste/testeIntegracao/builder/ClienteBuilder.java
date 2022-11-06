package com.integration.teste.testeIntegracao.builder;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.integration.teste.testeIntegracao.model.Cliente;

public class ClienteBuilder {
    private Cliente cliente;

    private static int contadorID = 1;

    private ClienteBuilder() {}

    public static ClienteBuilder umCliente() {
        ClienteBuilder builder = new ClienteBuilder();
        builder.cliente = new Cliente();
        builder.cliente.setId_cliente(contadorID++);
        builder.cliente.setCpf(0);
        builder.cliente.setNome("João Carlos");
        builder.cliente.setTelefone_1(1);
        builder.cliente.setTelefone_2(2);
        builder.cliente.setDt_nascimento(LocalDate.now());
        builder.cliente.setEmail(builder.cliente.getNome() + "@gmail.com");
        return builder;
    }

    public ClienteBuilder comNome(String nome) {
        cliente.setNome(nome);
        cliente.setEmail(cliente.getNome() + "@gmail.com");
        return this;
    }

    public Cliente builder() {
        return cliente;
    }
}
