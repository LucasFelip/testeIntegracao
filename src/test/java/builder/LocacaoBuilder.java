package builder;

import lombok.Builder;
import lombok.Data;
import org.integracao.teste.model.Cliente;
import org.integracao.teste.model.Imovel;

import java.time.LocalDate;

@Data
@Builder
public class LocacaoBuilder {
    private Cliente cliente;
    private Imovel imovel;
    private float valorAluguel;
    private float percentualMulta;
    private LocalDate dataVencimento;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Boolean ativo;
}
