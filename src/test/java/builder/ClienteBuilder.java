package builder;

import org.integracao.teste.model.Cliente;

import java.util.List;

public class ClienteBuilder {
    private List<Cliente> clientes;

    private ClienteBuilder(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
