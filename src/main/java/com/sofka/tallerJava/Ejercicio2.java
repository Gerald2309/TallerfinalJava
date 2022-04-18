package com.sofka.tallerJava;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO: 12/02/2022 Al ejercicio anterior agregar entrada por consola de dos valores e indicar}
        //  si son mayores, menores o iguales.

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primera variable");
        int var1 = leer.nextInt();
        System.out.println("Ingrese la segunda variable variable");
        int var2 = leer.nextInt();

        if (var1 > var2) {
            System.out.println("El número mayor es: " + var1);

        }
        else if(var2 > var1){
            System.out.println("El número mayor es: " + var2);

        }
        else{
            System.out.println("Las variables uno y dos son iguales");
        }

    }
}
