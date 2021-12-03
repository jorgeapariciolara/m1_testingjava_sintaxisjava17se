package com.company.estructurascontrol.iterativas;

/**
 *  Programa lista de invitados a una boda.
 *  Solo pueden entrar aquellas personas que estén en la lista
 *
 *  Blacklist: personas que no pueden entrar
 */
public class ForIfArray {

    public static void main(String[] args) {

        // Array[] unidimensional
        String[] invitados = new String[4];
        invitados[0] = "Pablo Fresnedilla";
        invitados[1] = "Lorena Helguera";
        invitados[2] = "Ramiro Vélez";
        invitados[3] = "Rosa Lorenzo";

        // String persona = "Ramiro Vélez"; // Persona que acaba de llegar y está invitada
        String persona = "Ramón Vélez"; // Persona que acaba de llegar y NO está invitada
        boolean esInvitado = false;
        for(int i=0;i<invitados.length;i++){
            esInvitado = persona.equals(invitados[i]);
            if(esInvitado){
                System.out.println("¡Bienvenido al evento, " + persona + "!");
                break;
            }
        }
        // fuera del bucle for
        if (esInvitado == false) {
            System.out.println("Lo sentimos, " + persona + ", pero no está invitado al evento.");
        }
    }
}
