package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    @Size(max = 45)
    private String nome;
    @Size(max = 15)
    private int cpf;
    @Size(max = 15)
    private int telefone_1;
    @Size(max = 15)
    private int telefone_2;
    private String email;
    private Date dt_nascimento;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone_1() {
        return telefone_1;
    }

    public void setTelefone_1(int telefone_1) {
        this.telefone_1 = telefone_1;
    }

    public int getTelefone_2() {
        return telefone_2;
    }

    public void setTelefone_2(int telefone_2) {
        this.telefone_2 = telefone_2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }
}