package com.sofka.tallerJava;

import javax.swing.*;

public class Ejercicio8 {
    // TODO: 12/02/2022 Crea una aplicación por consola que nos pida un día de la semana y que nos diga
    //  si es un día laboral o no. Usa un switch para ello.
    public static void main(String[] args) {
        String dia;
        dia = JOptionPane.showInputDialog("Ingrese un dia de la semana (sin tildes).");

        switch (dia)
        {

            case "Domingo":
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" no es laboral");

                break;

            default:
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" es laboral");

        }


    }
}
