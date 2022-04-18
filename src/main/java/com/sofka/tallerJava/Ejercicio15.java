package com.sofka.tallerJava;
import javax.swing.*;

public class Ejercicio15 {
    // TODO: 12/02/2022 EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA
    //  DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA
    //  EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
    public static void main(String[] args) {
        int op;
        op = 0;

        do {

            JOptionPane.showMessageDialog(null,"****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n" +
                    "\n");
            op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion."));

            if (op > 8 || op < 1){
                JOptionPane.showMessageDialog(null,"OPCION INCORRECTA");
            }

        }while (op != 8); //MENÚ
    }
}
