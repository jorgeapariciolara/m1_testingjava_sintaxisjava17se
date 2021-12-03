package com.company.estructurasdatos.arrays;

public class SumarArrays {

    public static void main(String[] args) {

        double[] gastos1 = new double[4];
        gastos1[0] = 13.50;
        gastos1[1] = 74.75;
        gastos1[2] = 63.50;
        gastos1[3] = 93.25;

        double total = 0;
        for (int i = 0; i < gastos1.length; i++) {
            total += gastos1[i];
            System.out.println(total);
        }
        System.out.println("La suma de todos los gastos nº1 es: " + total);

        System.out.println("***************************************************************************");

        // Iteramos sobre el array utilizando un bucle for
        double[] gastos2 = {13.50, 74.75, 63.50, 93.25};
        double total2 = 0;
        for (int i = 0; i < gastos2.length; i++) {
            total2 += gastos2[i];
        }
        System.out.println("La suma de todos los gastos nº2  es: " + total2);

        System.out.println("***************************************************************************");

        // Iteramos sobre el array utilizando un bucle while
        double[] gastos3 = {13.50, 74.75, 63.50, 93.25};
        int contador = 0;
        double sumatorio = 0;
        while (contador < gastos3.length) {
            sumatorio += gastos3[contador];
            contador++;
        }
        System.out.println("La suma de todos los gastos nº3 es: " + sumatorio);

        System.out.println("***************************************************************************");

        // Creamos un bucle infinito y salimos con un break cuando el contador alcanza la longitud del array
        double[] gastos4 = {13.50, 74.75, 63.50, 93.25};
        int contador2 = 0;
        double sumatorio2 = 0;
        while (true) {
            if (contador2 == gastos4.length) {
                break;
            }
            sumatorio2 += gastos4[contador2];
            contador2++;
        }
        System.out.println("La suma de todos los gastos nº4 es: " + sumatorio2);
    }
}
