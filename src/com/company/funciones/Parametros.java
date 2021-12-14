package com.company.funciones;

public class Parametros {

    public static void main(String[] args) {
        // Caso 1
        String nombre = "Francisco";
        imprimirNombre(nombre);

        // Caso 2
        imprimirNombre("Paquito");

        // Caso 3
        String nombreIngles = "Frank";
        imprimirNombre(nombreIngles);

        // Caso 4
        String nombre1 = "Manuel";
        String apellido1 = "Ramos";
        String apellido2 = "Martín";
        imprimirNombreCompleto(nombre1, apellido1, apellido2);

        // Caso 5
        imprimirNombreCompleto("Lola","García","Díaz");
    }

    public static void imprimirNombre (String nombre) {
        System.out.println("Bienvenid@ a nuestra aplicación, " + nombre);
    }

    public static void imprimirNombreCompleto (String nombre, String apellido1, String apellido2) {
        System.out.println("Bienvenid@ a nuestra aplicación, " + nombre + " " + apellido1 + " " + apellido2);
    }
}
