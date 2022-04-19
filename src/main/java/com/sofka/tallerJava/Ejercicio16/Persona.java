package com.sofka.tallerJava.Ejercicio16;

import java.util.Objects;
import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo = 'H';
    private double peso;
    private double altura;
    private boolean esMayordeEdad;

    ///CONSTRUCTORES -----------------------------------------------------------------------------------
    public Persona() {
        this.nombre = "";
        this.edad = 12;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;

    }

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int DNI, char sexo, double peso, double altura, boolean esMayordeEdad) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.esMayordeEdad = esMayordeEdad;
    }


    //MÉTODOS ---------------------------------------------------------------------------------


    public double calcularIMC(double peso1, double altura1){
        double imc = peso1/(altura1*altura1);

      return imc;

    }

    public double valorFinalIMC(double imc) {
        final int riesgoIMC;

        if(imc < 20){
            riesgoIMC = -1;
        }
        else if(imc >=20 && imc <= 25 ){
            riesgoIMC = 0;
        }
        else {
            riesgoIMC = 1;
        }
        return riesgoIMC;
    }

    boolean esMayorDeEdad(int edad1){
        this.esMayordeEdad = edad1 >= 18;
        return esMayordeEdad;

    }

    public char ComprobarSexo(String Sexo1) {

        if(Objects.equals(Sexo1, "Hombre")){
            this.sexo = 'H';
        }
        if(Objects.equals(Sexo1, "Mujer")){
            this.sexo = 'M';
        }
        return this.sexo;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", esMayordeEdad=" + esMayordeEdad +
                '}';
    }


    public int generaDNI()
    {
        int dni = (int) Math.floor(Math.random()*(99999999-50+1)+50);
        return dni;
    }

    private void generarDni() {
        Random r = new Random();
        int cantidad = 0;
        for (int i = 0; i <= 23; i++) {
            cantidad = r.nextInt(90000000) + 10000;

            System.out.println(cantidad);
        }
        int res = cantidad - (cantidad / 23*23);
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
        //Pasamos el DNI a String
       // DNI = Integer.toString(cantidad) + letraDNI;

    }
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[res];
    }
}