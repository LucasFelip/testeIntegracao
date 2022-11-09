package org.integracao.teste.model;

import lombok.*;
import org.integracao.teste.utils.definiEntidade;

import javax.persistence.*;
import java.time.LocalDate;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Aluguel implements definiEntidade<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_aluguel")
    private Integer id;

    @Column(name = "dt_vencimento")
    private LocalDate dataVencimento;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_locacao", nullable = false)
    private Locacao locacao;

    @Size(min = 10, max = 2)
    @Column(name = "valor_pago")
    private float valorPago;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    private String obs;
}