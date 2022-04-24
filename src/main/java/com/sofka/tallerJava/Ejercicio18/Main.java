package com.sofka.tallerJava.Ejercicio18;

public class Main {
    public static void main(String[] args) {
             Integer entregados = 0;

            Serie arraySeries[] = new Serie[5];

            arraySeries[0] = new Serie();
            arraySeries[1] = new Serie("The Simpson", "Matt Groening");
            arraySeries[2] = new Serie("The Big Bang Theory", "Comedia", "Comedia", 12);
            arraySeries[3] = new Serie("BoJack Horseman", "Seth MacFarlane" ,"Comedia", 6);
            arraySeries[4] = new Serie("Breaking soul", "Vince Gilligan", "Thriller", 7);

            arraySeries[1].entregar();
            arraySeries[4].entregar();

            Videojuego arrayVideojuegos[] = new Videojuego[5];

            arrayVideojuegos[0] = new Videojuego();
            arrayVideojuegos[1] = new Videojuego("Mario Kart", "Conducción", "Nintendo", 45);
            arrayVideojuegos[2] = new Videojuego("Fifa 20", 20);
            arrayVideojuegos[3] = new Videojuego("League of Legends", "RPG", "Riot Games", 50);
            arrayVideojuegos[4] = new Videojuego("Call Of Dutty", "Acción", "Activision", 45);

            arrayVideojuegos[1].entregar();
            arrayVideojuegos[2].entregar();

            for(int i = 0; i < arraySeries.length; i++){
                if(arraySeries[i].isEntregado()){
                    entregados += 1;
                    arraySeries[i].devolver();
                }
                if(arrayVideojuegos[i].isEntregado()){
                    entregados += 1;
                    arrayVideojuegos[i].devolver();
                }
            }
            System.out.println("Se encuentran: " + entregados + " artículos en estado entregado");

            Serie serieMayor = arraySeries[0];
            Videojuego videojuegoMayor = arrayVideojuegos[0];

            for(int i = 1; i < arraySeries.length; i++){
                if(arraySeries[i].compareTo(serieMayor) == Serie.temporadaMayor){
                    serieMayor = arraySeries[i];
                }
                if(arrayVideojuegos[i].compareTo(videojuegoMayor) == Videojuego.tiempoMayor){
                    videojuegoMayor = arrayVideojuegos[i];
                }
            }
            System.out.println(videojuegoMayor);
            System.out.println(serieMayor);
        }
}
