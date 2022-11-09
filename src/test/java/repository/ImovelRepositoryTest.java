package repository;

import org.integracao.teste.model.Imovel;
import org.integracao.teste.repository.ImovelRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImovelRepositoryTest {
    private EntityManager manager;
    private ImovelRepository repository;

    @BeforeEach
    void setup() {
        var factory = Persistence.createEntityManagerFactory("bank_prod");
        manager = factory.createEntityManager();
        repository = new ImovelRepository(manager);
    }

    @AfterEach
    void restore() {
        manager.close();
    }

    @Test
    void deveSalvar() {
        var imovelNovo = new Imovel();
        imovelNovo.setBairro("Cohatrac 2");
        imovelNovo.setCep(0);
        imovelNovo.setEndereco("Travessa da Pedreira");
        imovelNovo.setDormitorio(10);

        var expectedID = 3;
        var imovelSalvo = repository .save(imovelNovo);
        assertEquals(expectedID, imovelSalvo.getId());
    }

    @Test
    void deveBuscarImovel(){
        var imovelNovo = new Imovel();
        imovelNovo.setBairro("Cohatrac 2");
        imovelNovo.setCep(0);
        imovelNovo.setEndereco("Travessa da Pedreira");
        imovelNovo.setDormitorio(10);

        var imovelSalvo = repository.save(imovelNovo);
        var imovelEncontradoOptional = repository.findById(imovelSalvo.getId());

        assertTrue(imovelEncontradoOptional.isPresent());
        var imovelEncontrado = imovelEncontradoOptional.get();
        assertEquals(imovelSalvo, imovelEncontrado);
    }

    @Test
    void deveRemoverUmImovel(){
        var imovelNovo = new Imovel();
        imovelNovo.setBairro("Cohatrac 2");
        imovelNovo.setCep(0);
        imovelNovo.setEndereco("Travessa da Pedreira");
        imovelNovo.setDormitorio(10);

        var imovelSalvo = repository.save(imovelNovo);
        var imovelRemovido = repository.delete(imovelSalvo.getId());

        assertTrue(imovelRemovido.isPresent());
        assertEquals(imovelSalvo, imovelRemovido.get());
    }
}
