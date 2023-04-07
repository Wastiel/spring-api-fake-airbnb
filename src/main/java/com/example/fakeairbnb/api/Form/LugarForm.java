package com.example.fakeairbnb.api.Form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LugarForm {
    @NotEmpty
    private String nome;
    @NotNull
    private int endereco;
    @NotNull
    private String descricao;
    @NotNull
    private double valor;
}
