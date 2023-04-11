package com.example.fakeairbnb.api.dto;

import com.example.fakeairbnb.domain.model.entity.Lugar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReservaDTO {


    long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Lugar lugar;
    private String observacao;

}
