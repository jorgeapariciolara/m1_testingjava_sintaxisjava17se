package com.company.estructurascontrol.condicionales;

public class IfElse {

    public static void main(String[] args) {

        boolean verdadero = true;
        boolean falso = false;
        // 1. IF sólo entra si cumple la condición establecida
        if (verdadero){
            System.out.println("Hola a tod@s");

        // 2. ELSE si no se cumple la condición del IF, entonces entra en ELSE
        } else {
            System.out.println("Hasta la próxima");
        }


        double numero = 4.8d;
        if (numero >= 5) {
            System.out.println("APTO");
        } else {
            System.out.println("NO APTO");
        }

        System.out.println("Fin del programa");
    }
}
