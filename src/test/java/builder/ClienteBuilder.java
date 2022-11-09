package builder;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClienteBuilder {
    private String nome;
    private int cpf;
    private int telefone1;
    private int telefone2;
    private String email;
    private LocalDate dataNascimento;
}