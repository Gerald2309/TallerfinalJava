package com.sofka.tallerJava;
import javax.swing.*;
import java.util.function.ToDoubleBiFunction;

//SIN TERMINAR
public class Ejercicio12 {
    // TODO: 12/02/2022  Pedir dos palabras por teclado, indicar si son iguales, si no son iguales mostrar sus diferencias.
    public static void main(String[] args) {
        String palabra1;
        String palabra2;

        palabra1 = JOptionPane.showInputDialog("Ingrese la primera palabra: ");
        palabra2 = JOptionPane.showInputDialog("Ingrese la segunda palabra: ");

        char[] diferencias = new char[10];


        if (palabra1.equals(palabra2))
        {
            JOptionPane.showMessageDialog(null,"Las palabras ingresadas son iguales");
        }
        else
        {
            for (int i =0; i <= palabra1.length() ;i++){
                for (int a = 0; i >= palabra2.length() ;i++ )
                {
                    if(palabra1.charAt(i) == palabra2.charAt(a)){
                        diferencias[i] = palabra1.charAt(a);
                    }
                }

            }
            for (int j =0; j < diferencias.length ;j++){
                System.out.println(diferencias[j]);
            }

        }


    }
}
