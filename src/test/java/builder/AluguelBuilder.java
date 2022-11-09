package builder;

import lombok.Builder;
import lombok.Data;
import org.integracao.teste.model.Locacao;

import java.time.LocalDate;

@Data
@Builder
public class AluguelBuilder {
    private LocalDate dataVencimento;
    private Locacao locacao;
    private float valorPago;
    private LocalDate dataPagamento;
}
