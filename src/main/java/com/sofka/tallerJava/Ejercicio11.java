package com.sofka.tallerJava;
import javax.swing.*;

public class Ejercicio11 {
    // TODO: 12/02/2022 Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada
    //  por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de
    //
    public static void main(String[] args) {
        char[] vocales = {'a','e','i','o','u'};
        int contador = 0;
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese una frase (sin tildes).");

        for(int i = 0; i < frase.length(); i++)
        {
            for(int a = 0; a < vocales.length; a++ )
            {
                if(frase.charAt(i) == vocales[a]){
                    contador ++;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Su frase fue '" +frase +"'. Tiene "
                + contador + " vocales" + " y su longitud total es " + frase.length());

    }
}
