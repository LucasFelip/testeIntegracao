package builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImovelBuilder {
    private String endereco;
    private String bairro;
    private int cep;
    private int metragem;
    private int dormitorio;
    private int banheiro;
    private int suites;
    private String tipo;
    private int vagasGaragem;
    private int valorSugerido;
}