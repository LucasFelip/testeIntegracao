package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Cliente;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ClienteRepositoryTest {
    @Autowired
    private ClienteRepository repository;

    @Test
    public void deveBuscarPorNome() {
        Cliente cliente = repository.findFirstByNome("lucas");
        assertTrue(cliente.getNome().equals("lucas"));
    }
}
