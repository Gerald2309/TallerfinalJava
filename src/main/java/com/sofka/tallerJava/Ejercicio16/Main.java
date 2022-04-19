package com.sofka.tallerJava.Ejercicio16;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Random r = new Random();
       // int cantidad = r.nextInt(90000) + 10000;



        for (int i = 0; i <= 23; i++){
            int cantidad = r.nextInt(90000000) + 10000;

            System.out.println(cantidad);
        }
    }


}
