package com.example.fakeairbnb.domain.model.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LugarNotFound extends RuntimeException {

    public LugarNotFound(String message) {
        super(message);
    }

}
