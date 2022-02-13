package com.sofka.tallerJava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    // TODO: 12/02/2022 Realizar un algoritmo que permita consulta la fecha y hora actual en el formato
    //  (AAAA/MM/DD) (HH:MM:SS)
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("AAAA/MM/DD HH:MM:SS-> "+dtf.format(LocalDateTime.now()));
    }
}
