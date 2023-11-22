package com.example.calculatorapp;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException (String err){
        super(err);
    }
}
