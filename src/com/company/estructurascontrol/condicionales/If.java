package com.company.estructurascontrol.condicionales;

public class If {

    public static void main(String[] args) {

        boolean verdadero = true;
        boolean falso = false;
        if(verdadero){
            System.out.println("Imprime true porque la condición es verdadero.");
        }
        if(!falso){
            System.out.println("Imprime false con la exclamación porque la condición es falso.");
        }

        boolean resultado1 = 50 > 10;
        boolean resultado2 = 3 == 3;
        boolean resultado3 = 3 > 30;
        if(resultado1){
            System.out.println("Este código se ejecuta porque la condición es verdadera.");
        }
        if(resultado2){
            System.out.println("Este código se ejecuta porque la condición es verdadera.");
        }
        if(!resultado3){
            System.out.println("Este código no se ejecuta sin la exclamación porque la condición es falsa.");
        }

    }
}
