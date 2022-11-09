package builder;

import org.integracao.teste.model.Cliente;
import org.integracao.teste.model.Locacao;

import java.time.LocalDate;

public class LocacaoBuilder {
    private Locacao locacao;

    private LocacaoBuilder() { }

    public static LocacaoBuilder umaLocacao() {
        var builder = new LocacaoBuilder();
        builder.locacao = new Locacao();

        builder.locacao.setAtivo(true);
        builder.locacao.setDataFim(LocalDate.now());
        builder.locacao.setDataInicio(LocalDate.now());
        builder.locacao.setDataVencimento(LocalDate.now());
        builder.locacao.setValorAluguel(14);
        builder.locacao.setPercentualMulta(2);
        builder.locacao.setObs("Teste");
        builder.locacao.setCliente(ClienteBuilder.umCliente().contruir());

        return builder;
    }

    public LocacaoBuilder insereUsuario(Cliente cliente){
        locacao.setCliente(cliente);
        return this;
    }

    public Locacao constroi() {
        return locacao;
    }
}
