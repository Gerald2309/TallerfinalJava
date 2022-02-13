package com.sofka.tallerJava;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {
    // TODO: 12/02/2022  Pedir dos palabras por teclado, indicar si son iguales, si no son iguales mostrar sus
    //  diferencias.
    public static void main(String[] args) {
        String palabra1;
        String palabra2;

        palabra1 = JOptionPane.showInputDialog("Ingrese la primera palabra: ");
        palabra2 = JOptionPane.showInputDialog("Ingrese la segunda palabra: ");

        List<Character> chars = new ArrayList<>() ;

        if (palabra1.equals(palabra2))
        {
            JOptionPane.showMessageDialog(null,"Las palabras ingresadas son iguales");
        }
        else
        {
            System.out.println("Las palabras son diferentes ");

            if (palabra1.length() < palabra2.length())
            {
                for (int i = 0; i < palabra1.length(); i++) {
                    if (palabra2.charAt(i) != palabra1.charAt(i)) {
                        chars.add(palabra1.charAt(i));
                    }
                }
            }
            else if(palabra1.length() > palabra2.length()){
                for (int i = 0; i < palabra2.length(); i++) {
                    if (palabra1.charAt(i) != palabra2.charAt(i)) {
                        chars.add(palabra2.charAt(i));
                    }
                }
            }
            else if(palabra1.length() == palabra2.length()){
                for (int i = 0; i < palabra2.length(); i++) {
                    if (palabra1.charAt(i) != palabra2.charAt(i)) {
                        chars.add(palabra2.charAt(i));
                    }
                }
            }
            System.out.println("Las palabras son diferentes en los caracteres: "+chars);

        }

    }
}
