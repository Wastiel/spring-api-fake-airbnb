package com.example.fakeairbnb.api.Form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoForm {

    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    private int numero;
    private String complemento;
}
