package com.sofka.tallerJava;
import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        // TODO: 12/02/2022 Lee un número por teclado que pida el precio de un producto
        //  (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que
        //  sera del 21%.

        String leerPrecio;
        double precio;

        leerPrecio = JOptionPane.showInputDialog("Ingrese el precio del producto: ");
        precio = Double.parseDouble(leerPrecio);

        final double IVA = 0.21;
        double resultadoIVA = precio * IVA;
        double precioFinal = precio + resultadoIVA;

        JOptionPane.showMessageDialog(null,"El precio final del producto con IVA incluido es: "+precioFinal);




    }
}

