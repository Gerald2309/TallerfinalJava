package com.sofka.tallerJava;

public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO: 11/02/2022  Declara 2 variables numéricas (con el valor que desees), e indica cual es
        //  mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar
        //  que funciona.
        int var1 = 0;
        int var2 = 0;
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
            System.out.println("Las variables uno y dos son iguales");
        }

    }
}
