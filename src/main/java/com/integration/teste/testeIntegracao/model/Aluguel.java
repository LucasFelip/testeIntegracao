package com.integration.teste.testeIntegracao.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_aluguel")
    private Integer id;

    @Column(name = "dt_vencimento")
    private LocalDate dataVencimento;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @Column(name = "valor_pago")
    private Locacao locacao;

    @Size(min = 10, max = 2)
    @Column(name = "valor_pago")
    private float valorPago;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    private String obs;

}
