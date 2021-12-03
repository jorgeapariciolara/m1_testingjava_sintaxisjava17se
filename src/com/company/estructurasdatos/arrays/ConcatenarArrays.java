package com.company.estructurasdatos.arrays;

public class ConcatenarArrays {

    public static void main(String[] args) {

        // CONCATENAR nombres utilizando un bucle

        String[] datosPersonales = {"Nombre", "Apellido1", "Apellido2"};
        String nombreCompleto = "";
        for(int i=0; i<datosPersonales.length; i++) {
            if (i == 0) {
                nombreCompleto += datosPersonales[i];
            } else {
                nombreCompleto += " " + datosPersonales[i];
            }
        }
        System.out.println(nombreCompleto);

        System.out.println("***************************************************************************");

        String[] datosPersonales2 = {"Nombre'", "Apellido1'", "Apellido2'"};
        String nombreCompleto2 = "";
        for(int i=0; i<datosPersonales2.length; i++) {
            if (i == datosPersonales2.length-1) {
                nombreCompleto2 += datosPersonales2[i];
            } else {
                nombreCompleto2 += datosPersonales2[i] + " ";
            }
        }
        System.out.println(nombreCompleto2);

        System.out.println("***************************************************************************");

        String[] nombres = {"Francisco","Gloria","Rosa","Carlos"};
        String[] primerosApellidos = {"Huertas", "Sánchez", "Villar", "Martín"};
        String[] segundosApellidos = {"Gómez", "Hurtado", "García", "Martín"};

        String nombreCompleto3 = "";
        for (int i=0; i < nombres.length; i++) {
            nombreCompleto3 = nombres[i] + " " + primerosApellidos[i] + " " + segundosApellidos[i];
            System.out.println(nombreCompleto3);
        }


    }
}
