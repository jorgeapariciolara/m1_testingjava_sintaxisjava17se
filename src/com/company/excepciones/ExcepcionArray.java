package com.company.excepciones;

/**
 *      java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 * 	    at com.company.excepciones.ExcepcionArray.main(ExcepcionArray.java:11)
 * 	    El error está causado porque en el bucle for el <= hace que se itere más allá de la longitud del array
 */
public class ExcepcionArray {

    public static void main(String[] args) {

        String[] nombres = {"Paco", "Pepa", "Patricia", "Pedro", "Paloma"};

        try {
            for (int i=0; i<= nombres.length; i++){
                System.out.println(nombres[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
