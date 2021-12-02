package com.company.estructurascontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        int day = 9;

        if(day == 1){
            System.out.println("Que tengas un buen LUNES");
        } else if (day == 2) {
            System.out.println("Que tengas un buen MARTES");
        } else if (day == 3) {
            System.out.println("Que tengas un buen MIÉRCOLES");
        } else if (day == 4) {
            System.out.println("Que tengas un buen JUEVES");
        } else if (day == 5) {
            System.out.println("Que tengas un buen VIERNES");
        } else if (day == 6) {
            System.out.println("Que tengas un buen SÁBADO");
        } else if (day == 7) {
            System.out.println("Que tengas un buen DOMINGO");
        } else {
            System.out.println("El número no se corresponde con ningún día de la semana.");
        }

        System.out.println("Fin del programa.");
    }
}
