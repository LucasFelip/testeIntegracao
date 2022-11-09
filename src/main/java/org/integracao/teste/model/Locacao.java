package org.integracao.teste.model;

import lombok.*;
import org.integracao.teste.utils.definiEntidade;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Locacao implements definiEntidade<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_locacao")
    private Integer id;

    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.REFRESH, targetEntity = Imovel.class)
    private Imovel imovel;

    @Column(name = "alugueis")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "id_locacao"), inverseJoinColumns = @JoinColumn(name = "id_aluguel"))
    private List<Aluguel> alugueis;

    @Column(name = "valor_aluguel")
    @Size(min = 4, max = 10)
    private float valorAluguel;

    @Column(name = "percentual_multa")
    @Size(min = 2, max = 5)
    private float percentualMulta;

    @Column(name = "dt_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "dt_inicio")
    private LocalDate dataInicio;

    @Column(name = "dt_fim")
    private LocalDate dataFim;

    @Column(name = "ativo")
    private Boolean ativo;

    @Column(name = "obs")
    private String obs;
}