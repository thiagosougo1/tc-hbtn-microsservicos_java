package com.example.user.exception;

public class CPFException extends RuntimeException{
    private String cpf;

    public CPFException(){}
    public CPFException(String cpf){

    }
}