package com.example.fakeairbnb.api.dto;


import com.example.fakeairbnb.domain.model.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LugarDTO {

    long id;
    private String nome;
    private Endereco endereco;
    private String descricao;
    private double valor;

}
