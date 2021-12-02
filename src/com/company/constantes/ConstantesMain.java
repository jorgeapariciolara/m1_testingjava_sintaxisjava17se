package com.company.constantes;

/**
 *  Desde una clase puedo utilizar constantes que están en otra clase
 */

public class ConstantesMain {

    public static void main(String[] args) {

        double precio = 29.99;
        double precioFinal = precio + precio * Constantes.IVA;

        System.out.println(precioFinal);
    }
}
