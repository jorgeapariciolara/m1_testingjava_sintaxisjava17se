package com.company.poo.interfaces;

import java.util.List;
import java.util.Scanner;

public class CRMApplicationV2 {

    public static void main(String[] args) {


        OperacionesCRM crm = new OperacionesExcel();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1 - Ver todos los clientes");
            System.out.println("2 - Ver un empleado (por DNI)");
            System.out.println("3 - Salir");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // Obtener clientes
                List<Customer> clientes = crm.findAll();
                break;
                // Imprimir clientes
                //System.out.println(clientes);
            }
        }
    }
}
