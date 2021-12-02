package com.company.estructurascontrol.iterativas;

public class For {

    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            System.out.println("Iteración: " + i);
        }

        System.out.println("************************************************************************");

        for (int i=0; i<10; i=i+1) {
            System.out.println("Iteración: " + i);
        }

        System.out.println("************************************************************************");

        for (int i=0; i<10; i+=1) {
            System.out.println("Iteración: " + i);
        }

        System.out.println("************************************************************************");

        for (int i=0; i<10; i+=2) {
            System.out.println("Iteración: " + i);
        }

        System.out.println("************************************************************************");

        for (int i=0; i<10; ++i) {
            System.out.println("Iteración: " + i);
        }

        System.out.println("************************************************************************");

        /*
        for (int i=0; i<10; i--) {
            System.out.println("Iteración: " + i);
        }
        */
    }
}
