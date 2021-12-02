package com.company.estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String day = "viernes";

        switch (day) {
            case "lunes":
                System.out.println("¡Que tengas un buen lunes!");
                break;
            case "martes":
                System.out.println("¡Que tengas un buen martes!");
                break;
            case "miércoles":
                System.out.println("¡Que tengas un buen miércoles!");
                break;
            case "jueves":
                System.out.println("¡Que tengas un buen jueves!");
                break;
            case "viernes":
                System.out.println("¡Que tengas un buen viernes!");
                break;
            case "sábado":
                System.out.println("¡Que tengas un buen sábado!");
                break;
            case "domingo":
                System.out.println("¡Que tengas un buen domingo!");
                break;
            default:
                System.out.println("No existe ese día de la semana");
        }

        System.out.println("Fin del programa.");
    }
}
