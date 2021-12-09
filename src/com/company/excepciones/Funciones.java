package com.company.excepciones;

public class Funciones {

    public static void main(String[] args) {

        try {
            holamundo();
        } catch (Exception e) {
            e.printStackTrace();
            holamundo("Hermenegildo");
        }
    }

    public static void holamundo(){
        System.out.println("¡Hola a tod@s!");
    }

    public static void holamundo (String nombre) {
        System.out.println("¡Hola, " + nombre + " bienvenido!");
    }
}
