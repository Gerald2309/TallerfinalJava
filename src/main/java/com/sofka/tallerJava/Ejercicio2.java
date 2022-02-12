package com.sofka.tallerJava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primera variable");
        int var1 = leer.nextInt();
        System.out.println("Ingrese la segunda variable variable");
        int var2 = leer.nextInt();

        int mayor = 0;
        if (var1 > var2) {
            mayor = var1;
            System.out.println("El número mayor es: " + mayor);

        }
        else if(var2 > var1){
            mayor = var2;
            System.out.println("El número mayor es: " + mayor);

        }
        else{
            String numCadena= String.valueOf(mayor);
            System.out.println("Las variables uno y dos son iguales");
        }

    }
}
