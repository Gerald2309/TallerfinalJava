package com.sofka.tallerJava.Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Electrodomestico arrayElectrodomesticos[] = new Electrodomestico[10];

        arrayElectrodomesticos[0] = new Electrodomestico(5520.0, Electrodomestico.Colores.GRIS, 'C', 12.0);
        arrayElectrodomesticos[1] = new Electrodomestico(200.0, Electrodomestico.Colores.NEGRO, 'A', 14.0);
        arrayElectrodomesticos[2] = new Electrodomestico(200.0,12.0);
        arrayElectrodomesticos[3] = new Electrodomestico();
        arrayElectrodomesticos[4] = new Lavadora(154.23, Electrodomestico.Colores.AZUL, 'A',89.0, 52);
        arrayElectrodomesticos[5] = new Lavadora(150.0, 30.0);
        arrayElectrodomesticos[6] = new Lavadora();
        arrayElectrodomesticos[7] = new Television(23.54, Electrodomestico.Colores.ROJO,'G',  85.36, 68, true);
        arrayElectrodomesticos[8] = new Television(556.47, 80.21);
        arrayElectrodomesticos[9] = new Television();

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;

        for(int i = 0; i < arrayElectrodomesticos.length; i++){
            if(arrayElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos += arrayElectrodomesticos[i].precioFinal();
            }
            if(arrayElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras += arrayElectrodomesticos[i].precioFinal();
            }
            if(arrayElectrodomesticos[i] instanceof Television){
                sumaTelevisores += arrayElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("El precio final de los electrodomésticos es:  " + sumaElectrodomesticos);
        System.out.println("El precio final de los televisores es:  " + sumaTelevisores);
        System.out.println("El precio final de las lavadoras es:  " + sumaLavadoras);
    }
}