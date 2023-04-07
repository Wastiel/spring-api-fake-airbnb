package com.example.fakeairbnb.api.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LugarDTO {

    private String nome;
    private int endereco;
    private String descricao;
    private double valor;

}
