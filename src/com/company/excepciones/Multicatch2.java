package com.company.excepciones;

import java.util.NoSuchElementException;

public class Multicatch2 {

    public static void main(String[] args) {
        String[] nombres = {"Miguel", "Regina", "Karim", "ejemplo"}; // length es 4
        String nombre = null; // no podemos realizar operaciones sobre null

        try{

            // error 1
            // int operacion = 10 / 0; // ArithmeticException

            // error 2
//            for (int i = 0; i <= nombres.length; i++) {
//                System.out.println(nombres[i]); // error ArrayIndexOutOfBoundsException
//            }

            // error 3
            boolean check = nombre.equals("canarias"); // NullPointerException


            // cada catch es completamente independiente
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException exception) {
            System.out.println("Errores de operaciones con arrays");
        }catch (NoSuchElementException | IllegalArgumentException exception) {
            System.out.println("Errores de envío de parámetros");
        }
        catch (Exception e){
            System.out.println("Error genérico!");
        }
    }
}
