package com.company.excepciones;

public class Multicatch {

    public static void main(String[] args) {
        String[] nombres = {"Miguel", "Regina", "Karim", "ejemplo"}; // length es 4
        String nombre = null; // no podemos realizar operaciones sobre null

        try{
            // error 1
            // int operacion = 10 / 0; // ArithmeticException

            // error 2
            for (int i = 0; i <= nombres.length; i++) {
                System.out.println(nombres[i]); // error ArrayIndexOutOfBoundsException
            }

            // error 3
            boolean check = nombre.equals("canarias"); // NullPointerException

            // cada catch es completamente independiente
            // tratamiento personalizado para cada error
        } catch (ArithmeticException e) {
            System.out.println("error ArithmeticException");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error ArrayIndexOutOfBoundsException");

        } catch (NullPointerException e) {
            System.out.println("error NullPointerException");

        } catch (Exception e) {
            System.out.println("error genérico!");
        }
    }
}
