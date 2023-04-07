package com.example.fakeairbnb.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "endereco")
public class Endereco {

    /*Coloquei os dados do endereço como string, mas a ideia seria ter uma juntaçõ de 3 tabelas, separadas, pais estado e cidade.
    A rua eu fiquei com duvida de como construir*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    private int numero;
    private String complemento;
}
