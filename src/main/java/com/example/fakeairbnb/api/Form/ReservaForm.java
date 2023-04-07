package com.example.fakeairbnb.api.Form;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservaForm {

    private Date inicio;
    private Date fim;
    private int lugar;
    private String observacao;
}
