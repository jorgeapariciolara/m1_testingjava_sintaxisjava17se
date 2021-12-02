package com.company.estructurascontrol.condicionales;

public class IfAnidados {

    public static void main(String[] args) {

        // Cuando tenemos un if dentro de otro if

        int numero1 = 5;

        if (numero1 > 0) { // Cumple esta condición
            System.out.println("El número es mayor que 0.");

            if(numero1 > 10) {  // No cumple esta condición y no sigue
                System.out.println("El número es mayor que 10.");

                if(numero1 > 3) {
                    System.out.println("El número es mayor que 3.");
                }
            }
        }

        System.out.println("************************************************************");

        if (numero1 > 0) { // Cumple esta condición
            System.out.println("El número es mayor que 0.");

            if(numero1 < 10) {  // No cumple esta condición y no sigue
                System.out.println("El número es menor que 10.");

                if(numero1 > 3) {
                    System.out.println("El número es mayor que 3.");

                    if(numero1 < 7) {
                        System.out.println("El número es menor que 7.");

                        if(numero1 == 5) {
                            System.out.println("El número es el 5.");
                        }
                    }
                }
            }
        }


    }
}
