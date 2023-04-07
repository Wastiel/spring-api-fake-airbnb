package com.example.fakeairbnb.domain.model.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ReservaNotFound extends RuntimeException{

    public ReservaNotFound(String message) {super(message);}


}
