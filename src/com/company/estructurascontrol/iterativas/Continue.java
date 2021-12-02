package com.company.estructurascontrol.iterativas;

/**
 *      Palabra reservada para continuar/pasar a la interacción de un bucle:
 *              for         while
 */

public class Continue {

    public static void main(String[] args) {

        System.out.println(1 % 2 == 0);
        System.out.println(2 % 2 == 0);

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {   // Impares
                continue;
            }
            System.out.println("Número " + i);
        }
    }
}
