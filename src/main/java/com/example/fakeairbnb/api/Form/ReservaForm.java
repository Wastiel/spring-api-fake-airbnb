package com.example.fakeairbnb.api.Form;

import com.example.fakeairbnb.domain.model.entity.Lugar;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class ReservaForm {


    @FutureOrPresent(message = "A data deve ser hoje ou no futuro")
    private LocalDate dataInicio;
    @FutureOrPresent(message = "A data deve ser hoje ou no futuro")
    private LocalDate dataFim;
    private Lugar lugar;
    private String observacao;
}
