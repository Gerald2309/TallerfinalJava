package com.sofka.tallerJava;

public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO: 11/02/2022  Declara 2 variables numéricas (con el valor que desees), e indica cual es
        //  mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar
        //  que funciona.
        int var1 = 5;
        int var2 = 0;

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
