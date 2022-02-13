package com.sofka.tallerJava;

public class Ejercicio9 {
    // TODO: 12/02/2022 Del texto, La sonrisa sera la mejor arma contra la tristeza Reemplaza
    //  todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional
    //  que ustedes quieran incluir por consola y las muestre luego unidas.
    public static void main(String[] args) {

        String textoInicial = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println(textoInicial);
        String reemplazo = textoInicial.replaceAll("a", "e");
        System.out.println(reemplazo);
        String concat =  reemplazo + ". Por eso, sonrie.";
        System.out.println(concat);
        
    }
}
