package com.company.funciones;

public class FuncionesTipos {


    public static void main(String[] args) {

        imprimirholamundo();

        System.out.println(obtenerbienvenida());

        String name1 = "Benito";
        String name2 = "Vanesa";
        String name3 = "Aurora";
        String name4 = "Pedro";
        System.out.println(obtenerSaludo(name1));
        System.out.println(obtenerSaludo(name2));
        System.out.println(obtenerSaludo(name3));
        System.out.println(obtenerSaludo(name4));

        int numero1 = 98;
        int numero2 = 12;
        System.out.println(suma(numero1,numero2));
    }



    // OPCION 1: Función no recibe nada (sin parámetros) y que no devuelva nada (void)
    // public static de momento lo ignoramos
    // void significa que este método no devuelve nada
    // holaMundo es el nombre del método (elegido por el programador)
    public static void imprimirholamundo(){
        System.out.println("¡Hola a tod@s!");
    }

    // OPCION 2: Función no recibe nada (sin parámetros) y devuelve datos (TIENE UN RETURN)
    public static String obtenerbienvenida () {
        String holamundo = "¡Bienvenid@s!";
        return holamundo;
    }

    // OPCION 3: Función Sí recibe algo (un parámetro) y que sí devuelve algo (tipo de dato)
    public static String obtenerSaludo(String name){
        return "Hola querido amigo/a " + name;
    }

    // OPCION 4: Función Sí recibe algo (dos parámetros) y que sí devuelve algo (tipo de dato)
    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }


}
