package com.sofka.tallerJava;

import javax.swing.*;

public class Ejercicio10 {
    // TODO: 12/02/2022 Realizar una aplicación de consola, que al ingresar una frase por teclado
    //  elimine los espacios que esta contenga.
    public static void main(String[] args) {
        String leerFrase;
        String fraseSinEspacios;

        leerFrase = JOptionPane.showInputDialog("Ingrese la frase: ");
        fraseSinEspacios = leerFrase.replaceAll(" ", "");

        JOptionPane.showMessageDialog(null,"La frase sin espacios es: " + fraseSinEspacios);

    }
}

























