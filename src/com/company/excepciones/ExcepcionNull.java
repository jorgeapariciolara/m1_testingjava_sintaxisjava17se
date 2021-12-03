package com.company.excepciones;

public class ExcepcionNull {

    public static void main(String[] args) {

        String nombre = null;

        try {
            boolean check = nombre.equalsIgnoreCase("Paco");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
