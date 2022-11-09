package org.integracao.teste.model;

import lombok.*;
import org.integracao.teste.utils.definiEntidade;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Imovel implements definiEntidade<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_imovel")
    private Integer id;

    private String endereco;

    @Size(max = 45)
    private String bairro;

    @Size(max = 8)
    private int cep;

    private int metragem;

    private int dormitorio;

    private int banheiro;

    private int suites;

    @Column(name = "tipo_imovel")
    private String tipo;

    @Column(name = "vagas_garagem")
    private int vagasGaragem;

    @Size(min = 2, max = 10)
    @Column(name = "valor_aluguel_sugerido")
    private int valorSugerido;

    private String obs;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable (joinColumns = @JoinColumn ( name =" id_imovel"), inverseJoinColumns = @JoinColumn ( name =" id_locacao "))
    private List<Locacao> locacoes;
}