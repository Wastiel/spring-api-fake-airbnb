package com.example.fakeairbnb.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "reserva")
public class Reserva {

    /*ID da Reserva
    Data inicio
    Data fim
    Id do lugar*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    @ManyToOne
    @JoinColumn(referencedColumnName = "ID")
    private Lugar lugar;
    private String observacao;

}
