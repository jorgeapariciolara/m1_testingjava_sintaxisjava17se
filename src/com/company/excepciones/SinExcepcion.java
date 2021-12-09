package com.company.excepciones;

import java.util.NoSuchElementException;

public class SinExcepcion {

    public static void main(String[] args) {

        try{
            System.out.println("Codigo correcto");
        }catch(Exception e){
            System.out.println("Hay un error");
        }

        System.out.println("fin del programa");
    }
}
