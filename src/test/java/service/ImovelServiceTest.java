package service;

import org.integracao.teste.model.Imovel;
import org.integracao.teste.repository.ImovelRepository;
import org.integracao.teste.service.ImovelService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImovelServiceTest {
    private EntityManager manager;
    private ImovelService service;

    @BeforeEach
    void setup() {
        var factory = Persistence.createEntityManagerFactory("bank_test");
        manager = factory.createEntityManager();
        var repository = new ImovelRepository(manager);
        service = new ImovelService(repository);
    }

    @AfterEach
    void restore() {
        manager.close();
    }

    @Test
    void deveSalvarUmNovoImovel() {
        var imovelNovo = new Imovel();
        imovelNovo.setBairro("Cohatrac 2");
        imovelNovo.setCep(0);
        imovelNovo.setEndereco("Travessa da Pedreira");
        imovelNovo.setDormitorio(10);
        var expectedID = 1;
        var imovelSalvo = service.cadastrarImovel(imovelNovo);
        assertEquals(expectedID, imovelSalvo.getId());
    }
}
