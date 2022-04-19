package com.sofka.tallerJava.Ejercicio16;
import java.util.Scanner;

public class Main {
    private static String nombre;
    private static int edad;
    private static String sexo;
    private static double peso;
    private static double altura;

    public static void pedirDatosPersona(){
        Scanner leer = new Scanner(System.in);
        Scanner leerEdad = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        nombre = leer.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = leerEdad.nextInt();

        System.out.print("Ingrese el sexo: ");
        sexo = leer.nextLine();

        System.out.print("Ingrese el peso: ");
        peso = leer.nextDouble();

        System.out.print("Ingrese la altura de la persona: ");
        altura = leer.nextDouble();
    }

    public static void main(String[] args) {

        //CREACIÓN DE PRIMERA PERSONA
        System.out.println("Ingrese datos de la primera persona");
        pedirDatosPersona();
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        //CREACIÓN DE SEGUNDA PERSONA
        System.out.println("");
        System.out.println("Ingrese datos de la segunda persona");
        pedirDatosPersona();
        Persona persona2 = new Persona(nombre, edad, sexo);

        //CREACIÓN DE TERCERA PERSONA
        Persona persona3 = new Persona();

        //MOSTRAR PERSONA UNO
        System.out.println("");
        System.out.println(persona1.toString());
        persona1.mostrarIMC();

        //MOSTRAR PERSONA DOS
        persona2.setAltura(1.82);
        persona2.setPeso(80);
        System.out.println("");
        System.out.println("");
        System.out.println(persona2.toString());
        persona2.mostrarIMC();

        //AGREGAR VALORES A PERSONA TRES
        persona3.setNombre("Juan");
        persona3.setAltura(1.55);
        persona3.setEdad(14);
        persona3.setPeso(70);
        persona3.setSexoRecibido("Masculino");

        //MOSTRAR PERSONA TRES
        System.out.println("");
        System.out.println("");
        System.out.println(persona3);
        persona3.mostrarIMC();
    }
}
