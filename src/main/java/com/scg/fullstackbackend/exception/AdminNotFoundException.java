package com.scg.fullstackbackend.exception;

public class AdminNotFoundException extends RuntimeException{
    public AdminNotFoundException(Long id){
        super("Could not found admin with id "+ id);
    }
}
