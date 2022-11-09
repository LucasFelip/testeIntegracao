package repository;

import org.integracao.teste.model.Cliente;
import org.integracao.teste.repository.ClienteRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClienteRepositoryTest {
    private EntityManager manager;
    private ClienteRepository repository;

    @BeforeEach
    void setup() {
        var factory = Persistence.createEntityManagerFactory("bank_test");
        manager = factory.createEntityManager();
        repository = new ClienteRepository(manager);
    }

    @AfterEach
    void restore() {
        manager.close();
    }

    @Test
    void deveCriarClienteNovo() {
        var clienteNovo = new Cliente();

        clienteNovo.setCpf(957);
        clienteNovo.setEmail("astrogildo@email.com");
        clienteNovo.setDataNascimento(LocalDate.now());
        clienteNovo.setTelefone1(9899999-9999);
        clienteNovo.setTelefone1(99999-9998);

        var clienteSalvo = repository.save(clienteNovo);
        var expectedId = 1;

        assertEquals(expectedId, clienteSalvo.getId());
    }

    @Test
    void deveAtualizarCliente() {
        var clienteNovo = new Cliente();

        clienteNovo.setCpf(957);
        clienteNovo.setEmail("jc@email.com");
        clienteNovo.setDataNascimento(LocalDate.now());
        clienteNovo.setTelefone1(9899999-9999);
        clienteNovo.setTelefone1(99999-9998);

        var clienteSalvo = repository.save(clienteNovo);
        var atualicaoCliente = new Cliente();

        atualicaoCliente.setId(clienteSalvo.getId());
        clienteNovo.setCpf(3070);
        clienteNovo.setEmail("jcp@email.com");
        clienteNovo.setDataNascimento(LocalDate.now());
        clienteNovo.setTelefone1(9899999-9999);
        clienteNovo.setTelefone1(99999-9998);

        var clienteAtualizado = repository.save(atualicaoCliente);
        assertEquals(clienteSalvo.getId(), clienteAtualizado.getId());
        assertEquals(atualicaoCliente, clienteAtualizado);
    }

    @Test
    void deveRemoverUmCliente(){
        var clienteNovo = new Cliente();
        clienteNovo.setCpf(3070);
        clienteNovo.setEmail("jcp@email.com");
        clienteNovo.setDataNascimento(LocalDate.now());
        clienteNovo.setTelefone1(9899999-9999);
        clienteNovo.setTelefone1(99999-9998);

        var clienteSalvo = repository.save(clienteNovo);
        var clienteEncontrado = repository.findById(clienteSalvo.getId());

        assertTrue(clienteEncontrado.isPresent());
        assertEquals(clienteSalvo, clienteEncontrado.get());

        var clienteRemovido = repository.delete(clienteSalvo.getId());
        assertTrue(clienteRemovido.isPresent());
    }
}
