package com.example.fakeairbnb.api.dto;

import com.example.fakeairbnb.domain.model.entity.Lugar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReservaDTO {


    private Date inicio;
    private Date fim;
    private Lugar lugar;
    private String observacao;

}
