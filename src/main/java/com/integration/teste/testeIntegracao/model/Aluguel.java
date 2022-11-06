package com.integration.teste.testeIntegracao.model;

import javax.persistence.*;
import java.time.LocalDate;
import javax.validation.constraints.Size;

@Entity
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LocalDate dt_vencimento;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Locacao locacao;
    @Size(min = 10, max = 2)
    private float valor_pago;
    private LocalDate dt_pagamento;
    private String obs;

    public LocalDate getDt_vencimento() {
        return dt_vencimento;
    }

    public void setDt_vencimento(LocalDate dt_vencimento) {
        this.dt_vencimento = dt_vencimento;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public float getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(float valor_pago) {
        this.valor_pago = valor_pago;
    }

    public LocalDate getDt_pagamento() {
        return dt_pagamento;
    }

    public void setDt_pagamento(LocalDate dt_pagamento) {
        this.dt_pagamento = dt_pagamento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
