package com.company.estructurascontrol.iterativas;

public class While {

    public static void main(String[] args) {

        int numero = 10;

        while (numero < 100) {
            System.out.println("Valor de número: " + numero);
            numero++;
        }

        System.out.println("****************************************************************");

        int numero2 = 10;

        while (numero2 >= 10 && numero2 < 50) {
            System.out.println("Valor de número 2: " + numero2);
            numero2 +=2;
        }

        System.out.println("****************************************************************");

        System.out.println("Valor de número: " + numero);

        System.out.println("Valor de número 2: " + numero2);

        System.out.println("Fin del programa.");
    }
}
