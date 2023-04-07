package com.example.fakeairbnb.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "lugar", uniqueConstraints = @UniqueConstraint(columnNames = "endereco_id"))
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @OneToOne
    @JoinColumn(referencedColumnName = "ID")
    private Endereco endereco;
    private String descricao;
    private double valor;

}
