package com.sofka.tallerJava;

public class Ejercicio5 {
    // TODO: 12/02/2022 Muestra los números impares y pares del 1 al 100 (ambos incluidos).
    //  Usa un bucle while
    public static void main(String[] args) {

        int i = 1;
        while (i <= 100)
        {
            if (i % 2 == 0) System.out.println("El número "+ i +" es par");
            else System.out.println("El número "+ i +" es impar");
            i ++;
        }
    }
}
