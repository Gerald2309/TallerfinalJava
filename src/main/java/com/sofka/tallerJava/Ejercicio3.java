package com.sofka.tallerJava;
import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        // TODO: 12/02/2022 Haz una aplicación que calcule el área de un círculo(pi*R2).
        // El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
        // Usa la constante PI y el método pow de Math.
        String leerRadio;
        double radio;
        double area;

        leerRadio = JOptionPane.showInputDialog("Ingrese el radio del circulo");
        radio = Double.parseDouble(leerRadio);

        area = Math.PI*Math.pow(radio,2);

        JOptionPane.showMessageDialog(null,"El area del circulo es: "+area);

    }
}
