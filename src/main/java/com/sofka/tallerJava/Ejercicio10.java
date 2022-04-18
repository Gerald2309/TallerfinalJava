package com.sofka.tallerJava;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio10 {
    // TODO: 12/02/2022 Realizar una aplicación de consola, que al ingresar una frase por teclado
    //  elimine los espacios que esta contenga.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String leerFrase;
        String fraseSinEspacios;

        System.out.print("Ingrese la frase: ");
        leerFrase = leer.nextLine();

        fraseSinEspacios = leerFrase.replaceAll(" ", "");
        System.out.println("La frase ingresada sin espacios es: " + fraseSinEspacios);

    }
}

























