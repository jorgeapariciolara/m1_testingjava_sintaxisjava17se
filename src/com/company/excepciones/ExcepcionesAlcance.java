package com.company.excepciones;

/**
 *  Se ejecuta el código del try hasta que hay un error.
 *  Entonces el try lo captura y salta al catch.
 *  Se ejecuta el código del catch.
 * ¡¡¡SI NO HAY ERRORES EN EL TRY NO SE EJECUTA EL CATCH!!!
 */
public class ExcepcionesAlcance {

    public static void main(String[] args) {

       /*
            No podemos declarar la variable solo en el alcance/scope del try
            porque no sería accesible desdde el catch

        try {
            String  nombre = "Fernando";
        } catch (Exception e) {
            System.out.println(nombre + " no es un registro válido".);
        }
        */

        String nombre = "Fernando";
        String apellido1 = "Gutiérrez";
        String apellido2 = "Helguera";

        try {
            int operacion = 2*1;
            System.out.println(nombre + " es un registro válido.");
            int operacion2 = 1/2;
            System.out.println(apellido1 + " es un registro válido.");
            int operacion3 = 1/0;   // CAPTURA ESTA EXCEPCIÓN ARITMÉTICA Y SALTA AL CATCH
            System.out.println(apellido2 + " es un registro válido.");

        } catch (Exception e) {
            System.out.println(apellido2 + " no es un registro válido.");
        }
    }
}
