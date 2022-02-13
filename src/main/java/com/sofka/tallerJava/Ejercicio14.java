package com.sofka.tallerJava;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        // TODO: 12/02/2022 Crear un programa que pida un numero por teclado y que imprima por pantalla
        //  los números desde el numero introducido hasta 1000 con saldos de 2 en 2.

        String leerNum = JOptionPane.showInputDialog("Ingrese un numero");
        int valorInicial = Integer.parseInt(leerNum);

        for (int i = valorInicial; i <= 1000 ; i++)
        {
            i++;
            System.out.println(i);

        }


    }
}
