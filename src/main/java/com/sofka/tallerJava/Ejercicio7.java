package com.sofka.tallerJava;

import javax.swing.*;

public class Ejercicio7 {
    // TODO: 12/02/2022 Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    //  si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
    public static void main(String[] args) {

        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));

        } while (num < 0);

        JOptionPane.showMessageDialog(null,"El numero ingresado fue: " + num);


    }
}
