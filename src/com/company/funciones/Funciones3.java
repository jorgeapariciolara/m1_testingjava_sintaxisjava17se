package com.company.funciones;

public class Funciones3 {

    public static void main(String[] args) {
        bienvenida("Daniel");
        bienvenida("Laura");
        bienvenida("Luis");
        bienvenida("Sara");
    }

    public static String bienvenida (String name) {
        String texto = "Bienvenid@ a nuestra aplicación, " + name;
        System.out.println(texto);
        return texto;
    }
}
