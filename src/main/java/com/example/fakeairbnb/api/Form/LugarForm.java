package com.example.fakeairbnb.api.Form;


import com.example.fakeairbnb.domain.model.entity.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LugarForm {
    @NotBlank
    private String nome;

    private Endereco endereco;
    @NotBlank
    private String descricao;
    @NotNull
    private double valor;
}
