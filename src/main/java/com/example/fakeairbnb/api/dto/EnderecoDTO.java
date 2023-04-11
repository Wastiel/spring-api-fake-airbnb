package com.example.fakeairbnb.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EnderecoDTO {


    long id;
    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    private int numero;
    private String complemento;
}
