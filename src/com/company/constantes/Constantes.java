package com.company.constantes;

public class Constantes {

    public static final double IVA = 0.21;
    public static final int ENERO = 1;
    public static final String DAY = "Monday";

    public static void main(String[] args) {

        int currentMonth = 1;
        if(currentMonth == ENERO) {
            System.out.println("Estamos en enero");
        }

        if(DAY == "Monday") {
            System.out.println("Hoy es lunes");
        }

        double precioMesa = 99.99;
        double precioMesaIva = precioMesa + precioMesa * 0.21;
        System.out.println(precioMesaIva);

        double precioBotella = 5.99;
        double precioBotellaIva = precioBotella + calcularIvaProducto(5.99);
        System.out.println(precioBotellaIva);
    }

    static double calcularIvaProducto(double precio){
        double resultado = precio * IVA;
        return resultado;
    }

}
