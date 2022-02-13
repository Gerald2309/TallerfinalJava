package com.sofka.tallerJava.Ejercicio16;

public class Persona {
    protected static String nombre = "";
    static int edad = 0;
    int DNI;
    static char sexo = 'H';
    float peso = 0;
    double altura = 0;
    boolean esMayordeEdad = false;

    public void setPeso(float peso1) {
        this.peso = peso1;
    }

    public void setAltura(double altura1) {
        this.altura = altura1;
    }


    public Persona(String nombre1, int edad1, char sexo1, float peso1, double altura1) {
        this.nombre = nombre1;
    }
    public Persona(String nombre1, int edad1, char sexo1) {

    }

    public Persona() {

    }

    boolean esMayorDeEdad(int edad1){
        if (edad1 >= 18) this.esMayordeEdad = true;
        else this.esMayordeEdad = false;
        return esMayordeEdad;

    }

    public static double IMC(double peso1, double altura1) {
        double imc= peso1/(altura1*altura1);
        return imc ;
    }

    public static String ComprobarS(String Sexo1) {

        if(Sexo1.equals("Hombre")){
            Sexo1 = "H";
        }
        if(Sexo1.equals("Mujer")){
            Sexo1 = "M";
        }
        else{Sexo1 = "H";}
        return Sexo1;

    }
    public int generaDNI()
    {
        int dni = (int) Math.floor(Math.random()*(99999999-50+1)+50);
        return dni;
    }

}