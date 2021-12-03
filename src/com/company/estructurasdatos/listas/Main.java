package com.company.estructurasdatos.listas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Nombre1");
        nombres.add("Nombre2");
        nombres.add("Nombre3");
        nombres.add("Nombre4");
        nombres.add("Nombre5");
        System.out.println(nombres);

        System.out.println("***************************************************************************");

        List<Double> numeros = new ArrayList<>();
        numeros.add(13.50);
        numeros.add(74.75);
        numeros.add(63.50);
        numeros.add(93.25);
        System.out.println(numeros);
        Double acumulador = 0D;
        for(Double numero : numeros){
            acumulador += numero;
        }
        System.out.println("La suma de todos los números es igual a " + acumulador);
    }
}
