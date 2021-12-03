package com.company.excepciones;

public class Finally {

    public static void main(String[] args) {

        // Connection conexion = null;
        try {
            // abrir conexión a base de datos
            // recuperar datos
            // SELECT * FROM customers;
            int result = 5 / 0;
            // conexion.close;

        } catch (NullPointerException e) {
            System.out.println("Se ha producido un error.");
            // conexion.close();

        } finally {
            // cerrar conexión a base de datos
            // si conexión abierta, entonces conexion.close();
            System.out.println("Cerrando conexión desde finally.");
        }

        System.out.println("Fin del programa.");
    }
}
