package com.company.funciones;

public class Scope {

    public static void main(String[] args) {

        String nombre = "Fernando";
        String apellido1 = "Navas";
        String apellido2 = "Lora";

        if (2>1) {
            nombreComp (nombre, apellido1, apellido2);
        }

        if (2<3) {
            bienvenida("Sr./Sra. " + apellido1 + " " + apellido2);
        }

        System.out.println("Fin del programa");
    }

    public static String nombreComp (String nombre, String apellido1, String apellido2) {
        String name = nombre + " " + apellido1 + " " + apellido2;
        System.out.println(name);
        return name;
    }

    public static void bienvenida (String name) {
        System.out.println("Bienvenid@ a nuestera aplicación, " + name);
    }
}
