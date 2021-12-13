package com.company.funciones;

public class Funciones2 {

    public static void main(String[] args) {
        double precio = 50.00;
        calcular21Iva(precio);
        precioFinal(precio);
    }

    public static void calcular21Iva (Double precio) {
        double resultado = precio * 0.21;
        System.out.println("El 21% de IVA de " + precio + " es igual a " + resultado);
    }

    public static void precioFinal (Double precio) {
        // double resultado = precio + precio * 0.21;
        double resultado = precio * 1.21;
        System.out.println("El precio final del producto es " + resultado);
    }
}
