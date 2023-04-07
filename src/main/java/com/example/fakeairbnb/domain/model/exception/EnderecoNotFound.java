package com.example.fakeairbnb.domain.model.exception;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EnderecoNotFound extends RuntimeException{

    public EnderecoNotFound(String message) {super(message);}

}
