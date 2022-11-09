package builder;

import org.integracao.teste.model.Cliente;
import org.integracao.teste.model.Locacao;
import org.integracao.teste.service.ClienteService;

import java.util.List;

public class ClienteBuilder {
    private Cliente clientes;
    private ClienteService service;

    private ClienteBuilder() {}

    public static ClienteBuilder umCliente() {
        var builder = new ClienteBuilder();
        builder.clientes = new Cliente();
        builder.clientes.setCpf(1);
        builder.clientes.setLocacoes((List<Locacao>) LocacaoBuilder.umaLocacao().constroi());
        return builder;
    }

    public Cliente contruir() {
        return clientes;
    }
}