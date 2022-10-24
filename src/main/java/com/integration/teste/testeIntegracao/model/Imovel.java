package com.integration.teste.testeIntegracao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_imovel;
    private String endereco;
    @Size(max = 45)
    private String bairro;
    @Size(max = 8)
    private int cep;
    private int metragem;
    private int dormitorio;
    private int banheiro;
    private int suites;
    private int vagas_garagem;
    @Size(min = 2, max = 10)
    private int valor_sugerido;
    private String obs;

    public Integer getId_imovel() {
        return id_imovel;
    }

    public void setId_imovel(Integer id_imovel) {
        this.id_imovel = id_imovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public int getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(int dormitorio) {
        this.dormitorio = dormitorio;
    }

    public int getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(int banheiro) {
        this.banheiro = banheiro;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getVagas_garagem() {
        return vagas_garagem;
    }

    public void setVagas_garagem(int vagas_garagem) {
        this.vagas_garagem = vagas_garagem;
    }

    public int getValor_sugerido() {
        return valor_sugerido;
    }

    public void setValor_sugerido(int valor_sugerido) {
        this.valor_sugerido = valor_sugerido;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
