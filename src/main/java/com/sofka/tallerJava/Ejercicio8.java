package com.sofka.tallerJava;

import javax.swing.*;
import java.util.Locale;

public class Ejercicio8 {
    // TODO: 12/02/2022 Crea una aplicación por consola que nos pida un día de la semana y que nos diga
    //  si es un día laboral o no. Usa un switch para ello.
    public static void main(String[] args) {
        String dia;
        dia = JOptionPane.showInputDialog("Ingrese un dia de la semana (sin tildes).");

        switch (dia.toLowerCase())
        {

            case "domingo":
                JOptionPane.showMessageDialog(null, "El dia " + dia + " no es laboral");

                break;

            case "lunes":
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" es laboral");

                break;

            case "martes":
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" es laboral");

                break;

            case "miercoles":
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" es laboral");

                break;

            case "jueves":
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" es laboral");

                break;

            case "viernes":
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" es laboral");

                break;

            case "sabado":
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" es laboral");

                break;
            default:
                JOptionPane.showMessageDialog(null,"El dia "+ dia +" no existe");

        }


    }
}
