package com.sofka.tallerJava.Ejercicio16;
import java.util.Scanner;

import static com.sofka.tallerJava.Ejercicio16.Persona.IMC;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese su nombre: ");
        String nombreIngresado = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edadIngresada = entrada.nextInt();

        System.out.print("Ingrese su sexo: ");
        char sexoIngresado = (char )entrada.nextInt();

        System.out.print("Ingrese su peso: ");
        float pesoIngresado = entrada.nextFloat();

        System.out.print("Ingrese su altura en metros: ");
        double alturaIngresada = entrada.nextDouble();

        Persona persona1 = new Persona(nombreIngresado, edadIngresada, sexoIngresado, pesoIngresado, alturaIngresada);
        Persona persona2 = new Persona(nombreIngresado, edadIngresada, sexoIngresado);
        Persona persona3 = new Persona();

    }
}
