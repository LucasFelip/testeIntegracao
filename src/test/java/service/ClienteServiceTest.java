package service;

import org.integracao.teste.model.Cliente;
import org.integracao.teste.repository.ClienteRepository;
import org.integracao.teste.repository.ImovelRepository;
import org.integracao.teste.repository.LocacaoRepository;
import org.integracao.teste.service.ClienteService;
import org.integracao.teste.service.ImovelService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteServiceTest {
    private EntityManager manager;
    private ClienteService clienteService;
    private ImovelService imovelService;

    @BeforeEach
    void setup() {
        var factory = Persistence.createEntityManagerFactory("bank_test");

        manager = factory.createEntityManager();
        var clienteRepository = new ClienteRepository(manager);
        var imovelRepository = new ImovelRepository(manager);

        clienteService = new ClienteService(clienteRepository);
        imovelService = new ImovelService(imovelRepository);
    }

    @AfterEach
    void restore() {
        manager.close();
    }

    @Test
    void deveSalvarUmNovoCliente() {
        var clienteNovo = new Cliente();
        clienteNovo.setCpf(3070);
        clienteNovo.setEmail("jcp@email.com");
        clienteNovo.setDataNascimento(LocalDate.now());
        clienteNovo.setTelefone1(9899999-9999);
        clienteNovo.setTelefone1(99999-9998);

        var clienteSalvo = clienteService.cadastrarCliente(clienteNovo);
        var expectedId = 1;
        assertEquals(expectedId, clienteSalvo.getId());
    }
}
