package com.sofka.tallerJava.Ejercicio16;

import java.util.Objects;
import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo = 'H';
    private String sexoRecibido;
    private double peso;
    private double altura;
    private boolean esMayordeEdad;

    //IMC
    private final int IMC_BAJO_PESO = -1;
    private final int IMC_PESO_IDEAL = 0;
    private final int IMC_SOBRE_PESO = 1;

    ///CONSTRUCTORES -----------------------------------------------------------------------------------
    public Persona() {
        this.nombre = "";
        this.edad = 12;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        DNI = generarDni();
        this.sexo = comprobarSexo(sexoRecibido);
    }

    public Persona(String nombre, int edad, String sexoRecibido) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexoRecibido = sexoRecibido;
        DNI = generarDni();
        this.sexo = comprobarSexo(sexoRecibido);
        this.esMayordeEdad = esMayorDeEdad(edad);
    }

    public Persona(String nombre, int edad, String sexoRecibido, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexoRecibido = sexoRecibido;
        this.peso = peso;
        this.altura = altura;
        this.DNI = generarDni();
        this.sexo = comprobarSexo(sexoRecibido);
        this.esMayordeEdad = esMayorDeEdad(edad);
    }

    //SETTERS ---------------------------------------------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexoRecibido(String sexoRecibido) {
        this.sexoRecibido = sexoRecibido;
    }

    //MÉTODOS ---------------------------------------------------------------------------------
    public Integer calcularIMC(double peso, double altura){
        double imc = peso/(Math.pow(altura,altura));
        int intImc = (int) Math.round(imc);

        if(intImc < 20){
            return IMC_BAJO_PESO;
        }
        else if(intImc >=20 && intImc <= 25 ){
            return IMC_PESO_IDEAL;
        }
        return IMC_SOBRE_PESO;
    }

    public void mostrarIMC(){
       int IMC = calcularIMC(peso, altura);

        switch (IMC){
            case IMC_BAJO_PESO:
                System.out.print("  La persona está por debajo de su peso ideal");
               break;
            case IMC_PESO_IDEAL:
                System.out.print("  La persona está en su peso ideal");
                break;
            case IMC_SOBRE_PESO:
                System.out.print("  La persona tiene obesidad");
                break;
            default:
                System.out.println("  IMC fuera de rango");
        }
    }



    public boolean esMayorDeEdad(int edad1){
        this.esMayordeEdad = edad1 >= 18;
        return esMayordeEdad;
    }

    public char comprobarSexo(String sexoRecibido) {

        if(Objects.equals(sexoRecibido, "Masculino")){
            this.sexo = 'H';
        }
        else if(Objects.equals(sexoRecibido, "Femenino")){
            this.sexo = 'M';
        }
        return this.sexo;
    }

    @Override
    public String toString() {
        return "Información de la persona " + nombre + "\n" +
                "  Nombre: " + nombre + "\n" +
                "  Edad: " + edad + "\n" +
                "  DNI: " + DNI + "\n" +
                "  Sexo: " + sexo + "\n" +
                "  Peso: " + peso + "\n" +
                "  Altura: " + altura + "\n" +
                "  Es mayor de edad: " + esMayordeEdad
                ;
    }

    private String generarDni() {
        Random r = new Random();
        int numRandom = r.nextInt(90000000) + 10000;
        int res = numRandom - (numRandom / 23*23);
        char letraDNI = generaLetraDNI(res);
        return  DNI = Integer.toString(numRandom) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[res];
    }
}