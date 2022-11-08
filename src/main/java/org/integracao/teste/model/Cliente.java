package org.integracao.teste.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente implements definiEntidade<Integer> {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente")
    private Integer id;

    @Size(max = 45)
    @Column(name = "nome_cliente")
    private String nome;

    @Size(max = 15)
    @Column(name = "cpf")
    private int cpf;

    @Size(max = 15)
    @Column(name = "telefone1")
    private int telefone1;

    @Size(max = 15)
    @Column(name = "telefone2")
    private int telefone2;

    @Column(name = "email")
    private String email;

    @Column(name = "dt_nascimento")
    private LocalDate dataNascimento;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable (joinColumns = @JoinColumn ( name =" id_cliente"), inverseJoinColumns = @JoinColumn ( name =" id_locacao "))
    private List<Locacao> locacoes;
}