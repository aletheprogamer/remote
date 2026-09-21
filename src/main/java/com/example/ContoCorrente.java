package com.example;



public class ContoCorrente {
    
    private String titolare;
    private double saldo;


    public ContoCorrente(String t, double s) throws IllegalArgumentException {

        if(s < 0){

            throw new IllegalArgumentException("saldo negativo");

        }
        this.titolare=t;
        this.saldo=s;
    }

    public boolean deposito(double importo) throws IllegalArgumentException {

        if(importo < 0){
            throw new IllegalArgumentException("importo negativo");

        }
        else{
            this.saldo += importo;
            return true;
        }

    }








}
