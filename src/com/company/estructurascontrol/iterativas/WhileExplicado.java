package com.company.estructurascontrol.iterativas;

public class WhileExplicado {

    public static void main(String[] args) {

        /**
         *  1. Crear la variable boolean para la condición de ejecucion del bucle while.
         *  2. Crear la variable contador que srá modificada dentro del bucle whilw
         *  3. Crear el bucle while
         *  4. Incremento en el contador par que avance y así el bucle while pueda terminar en posteriores iteraciones
         *  5. Comprobar el contador. En este caso, si el contador llega a 10, cambiamos la condición del bucle while.
         */

        boolean comprobacion = true;
        System.out.println(comprobacion);   // true
        System.out.println(!comprobacion);  // false
        int contador = 0;
        while (comprobacion) {
            contador++;
            if (contador == 10) {
                comprobacion = false;
            }
            System.out.println("Valor del contador = " + contador);
        }

        System.out.println("*******************************************************************");

        boolean comprobacion2 = true;
        int contador2 = 0;
        while (comprobacion2) {
            contador2 += 2;
            if (contador2 == 10) {
                comprobacion2 = false;
            }
            System.out.println("Valor del contador 2 = " + contador2);
        }

        System.out.println("*******************************************************************");

        boolean comprobacion3 = true;
        int contador3 = 0;
        while (comprobacion3) {
            contador3 += 10;
            if (contador3 == 100) {
                comprobacion3 = false;
            }
            System.out.println("Valor del contador 3 = " + contador3);
        }

        System.out.println("*******************************************************************");

        System.out.println("Fin del programa.");
    }
}
