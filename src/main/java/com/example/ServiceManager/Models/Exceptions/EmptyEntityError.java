package com.example.ServiceManager.Models.Exceptions;

import java.util.Optional;

public class EmptyEntityError extends RuntimeException{

    public EmptyEntityError(String message){

        super(message);
    }
}
