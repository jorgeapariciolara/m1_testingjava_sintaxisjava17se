package com.company.estructurascontrol.condicionales;

public class Switch2 {

    public static void main(String[] args) {

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("¡Que tengas un buen lunes!");
                break;
            case 2:
                System.out.println("¡Que tengas un buen martes!");
                break;
            case 3:
                System.out.println("¡Que tengas un buen miércoles!");
                break;
            case 4:
                System.out.println("¡Que tengas un buen jueves!");
                break;
            case 5:
                System.out.println("¡Que tengas un buen viernes!");
                break;
            case 6:
                System.out.println("¡Que tengas un buen sábado!");
                break;
            case 7:
                System.out.println("¡Que tengas un buen domingo!");
                break;
            default:
                System.out.println("No existe ese día de la semana");
        }

        System.out.println("Fin del programa.");
    }
}
