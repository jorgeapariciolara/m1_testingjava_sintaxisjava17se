package com.company.funciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FuncionesArrays {

    public static void main(String[] args) {
        String[] nombres1 = crearArrayString1("Santiago", "Mª del Carmen", "Santiago",
                "Virginia", "Jorge", "Silvia", "David", "Mª del Carmen", "Tirso", "Sara", "Cintia",
                "Jorge", "Noelia", "Vicente", "Jaime");

        String[] nombres2 = crearArrayString2("Santiago", "Mª del Carmen", "Santiago",
                "Virginia", "Jorge", "Silvia", "David", "Mª del Carmen", "Tirso", "Sara", "Cintia",
                "Jorge", "Noelia", "Vicente", "Jaime");

        List<String>  nombres3 = crearArrayList1(nombres1);

        List<String>  nombres4 = crearArrayList2(nombres2);

        imprimirArray(nombres1);
        System.out.println("****************************************************************");
        imprimirArray(nombres2);
        System.out.println("****************************************************************");
        imprimirArrayList(nombres3);
        System.out.println("****************************************************************");
        imprimirArrayList(nombres4);
    }

    public static String[] crearArrayString1(String nombre1, String nombre2, String nombre3, String nombre4,
                                            String nombre5, String nombre6, String nombre7, String nombre8,
                                            String nombre9, String nombre10, String nombre11, String nombre12,
                                            String nombre13, String nombre14, String nombre15) {

        String[] array = new String[16];
        array[0] = nombre1;
        array[1] = nombre2;
        array[2] = nombre3;
        array[3] = nombre4;
        array[4] = nombre5;
        array[5] = nombre6;
        array[6] = nombre7;
        array[7] = nombre8;
        array[8] = nombre9;
        array[9] = nombre10;
        array[10] = nombre11;
        array[11] = nombre12;
        array[12] = nombre13;
        array[13] = nombre14;
        array[14] = nombre15;

        return array;
    }

    public static String[] crearArrayString2(String nombre1, String nombre2, String nombre3, String nombre4,
                                             String nombre5, String nombre6, String nombre7, String nombre8,
                                             String nombre9, String nombre10, String nombre11, String nombre12,
                                             String nombre13, String nombre14, String nombre15) {

        String[] array = {nombre1, nombre2, nombre3, nombre4, nombre5, nombre6, nombre7, nombre8, nombre9,
                nombre10, nombre11, nombre12, nombre13, nombre14, nombre15};

        return array;
    }

    public static List<String> crearArrayList1 (String[] array) {
        List<String> arraylist = new ArrayList<>();

        for(String nombre : array){
            arraylist.add(nombre);
        }

        return arraylist;
    }

    public static List<String> crearArrayList2 (String[] array) {
        List<String> arraylist = new ArrayList<>();

        Collections.addAll(arraylist, array);

        return arraylist;
    }

    public static void imprimirArray(String[] nombres){
        System.out.println(nombres);
    }

    public static void imprimirArrayList(List<String> nombres){
        System.out.println(nombres);
    }

}
