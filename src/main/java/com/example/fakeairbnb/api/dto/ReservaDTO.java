package com.example.fakeairbnb.api.dto;

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
    private int lugar;
    private String observacao;

}
