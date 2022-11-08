package com.integration.teste.testeIntegracao.repository;

import com.integration.teste.testeIntegracao.model.Cliente;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.*;

@DataJpaTest
public class ClienteRepositoryTest {
    @Autowired
    private ClienteRepository repository;
    private EntityManager manager;
    private static EntityManagerFactory emf;

    @BeforeAll
    public static void inicio() {
        emf = Persistence.createEntityManagerFactory("locadoraPU_test");
    }

    @Test
    public void deveBuscarPorNome() {
        Cliente cliente = repository.findFirstByNome("lucas");
        assertTrue(cliente.getNome().equals("lucas"));
    }
}
