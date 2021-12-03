package com.company.estructurasdatos.arrays;

public class MainEjemplos {

    public static void main(String[] args) {

        // 1. Variables
        double numero1 = 3.87;
        int numero2 = 127;
        long numero3 = 123123123L;
        String nombre = "Nombre-de-prueba";
        char charA = 'A';
        boolean comprobacion = true;

        // 2. Estructuras de datos: Arrays[]
        double[] gastos1 = new double[4];
        gastos1[0] = 13.50;
        gastos1[1] = 74.75;
        gastos1[2] = 63.50;
        gastos1[3] = 93.25;

        double[] gastos2 = {13.50, 74.75, 63.50, 93.25};

        int[] numeros1 = new int[3];
        numeros1[0] = 57;
        numeros1[1] = 157;
        numeros1[2] = 92;

        int[] numeros2 = {57, 157, 92};

        String[] nombres1 = new String[5];
        nombres1[0] = "Álvaro";
        nombres1[1] = "Alicia";
        nombres1[2] = "Alberto";
        nombres1[3] = "Alejandra";
        nombres1[4] = "Mª del Carmen";

        String[] nombres2 = {"Álvaro", "Alicia", "Alberto", "Alejandra", "Mª del Carmen"};

        char[] grupos1 = new char[3];
        grupos1[0] = 'A';
        grupos1[1] = 'B';
        grupos1[2] = 'C';

        char[] grupos2 = {'A', 'B', 'B'};

        boolean[] clientesAsociados1 = new boolean[5];
        clientesAsociados1[0] = true;
        clientesAsociados1[1] = false;
        clientesAsociados1[2] = false;
        clientesAsociados1[3] = true;
        clientesAsociados1[4] = true;

        boolean[] clientesAsociados2 = {true, false, false, true, true};

    }
}
