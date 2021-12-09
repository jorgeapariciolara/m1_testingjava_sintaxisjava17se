package com.company.excepciones;

public class TryCatchAnidados {

    public static void main(String[] args) {

        // No se recomienda anidar estructuras try catch porque dificulta su lectura y mantenimiento
        try {
            System.out.println("hola desde principio try 1");

            try {
                System.out.println("hola desde principio try 2");

            } catch (Exception e) {
                System.out.println("hola desde excepcion 1");

            }
            System.out.println("hola desde fin try 1");

        } catch (Exception e) {
            System.out.println("hola desde excepcion 2");
        }
    }
}
