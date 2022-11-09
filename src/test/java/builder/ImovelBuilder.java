package builder;

import org.integracao.teste.model.Imovel;
import org.integracao.teste.service.ImovelService;

public class ImovelBuilder {
    private Imovel imovel;
    private ImovelService service;

    private ImovelBuilder(Integer id) {
        this.imovel = service.buscarImovel(id);
    }

    public Imovel construirImovel(){
        return imovel;
    }
}