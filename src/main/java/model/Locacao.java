package model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_locacao;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Cliente inquilino;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Imovel imovel;
    @Size(min = 4, max = 10)
    private float valor_aluguel;
    @Size(min = 2, max = 5)
    private float percentual_multa;
    private Date dt_vencimento;
    private Date dt_inicio;
    private Date dt_fim;
    private Boolean ativo;
    private String obs;

    public Integer getId_locacao() {
        return id_locacao;
    }

    public void setId_locacao(Integer id_locacao) {
        this.id_locacao = id_locacao;
    }

    public Cliente getInquilino() {
        return inquilino;
    }

    public void setInquilino(Cliente inquilino) {
        this.inquilino = inquilino;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public float getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(float valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public float getPercentual_multa() {
        return percentual_multa;
    }

    public void setPercentual_multa(float percentual_multa) {
        this.percentual_multa = percentual_multa;
    }

    public Date getDt_vencimento() {
        return dt_vencimento;
    }

    public void setDt_vencimento(Date dt_vencimento) {
        this.dt_vencimento = dt_vencimento;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Date getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(Date dt_fim) {
        this.dt_fim = dt_fim;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
