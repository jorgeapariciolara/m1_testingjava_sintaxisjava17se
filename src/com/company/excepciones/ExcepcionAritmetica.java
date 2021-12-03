package com.company.excepciones;

/**
 *  MECANISMO DE GESTIÓN DE EXCEPCIONES
 *          try{
 *              código potenciaclmente problemático: consulta a base de datos
 *          } catch (Exception e) {
 *              e.printStackTrace();   // Para que nos saque el error que se ha producido por consola
 *          }
 */
public class ExcepcionAritmetica {

    public static void main(String[] args) {

        try {
            int operacion1 = 2 * 2;
            System.out.println("Bienvenid@");
            int operacion2 = 10 / 2;
            System.out.println("¿Qué tal estás?");
            int operacion3 = 10 / 0;
            System.out.println("¿Qué quieres hacer hoy?");  // No llega aquí porque salta la excepción y sale
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Fin del programa.");
    }
}
