package com.sofka.tallerJava.Ejercicio17;

import org.jetbrains.annotations.NotNull;
import static com.sofka.tallerJava.Ejercicio17.Electrodomestico.Colores.BLANCO;

public class Electrodomestico {
    protected Double precioBase;
    protected Colores color;
    protected Character consumoEnergetico;
    protected Double peso;

    protected final static Double PRECIO_BASE_POR_DEFECTO = 100.0;
    protected final static Colores COLOR_POR_DEFECTO = BLANCO;
    protected final static Character CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
    protected final static Double PESO_POR_DEFECTO = 5.0;

    //CONSTRUCTORES
    public Electrodomestico() {
        this(PRECIO_BASE_POR_DEFECTO, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, PESO_POR_DEFECTO);
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this(precioBase, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, peso );
    }

    public Electrodomestico(Double precioBase, Colores color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    //COLORES -------------------------------------------------------------------------------
    enum Colores {
        BLANCO,
        NEGRO,
        ROJO,
        AZUL,
        GRIS
    }

    //GETTERS --------------------------------------------------------------------------------
    public Double getPrecioBase() {
        return precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    //MÉTODOS --------------------------------------------------------------------------------------
    public void comprobarConsumoEnergetico(Character consumoEnergetico) {
        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        }
    }

    public void comprobarColor(Colores color) {
        Colores[] colores = Colores.values();

        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {

            if (colores[i].equals(color)) {
                encontrado = true;
                break;
            }

        }

        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLOR_POR_DEFECTO;
        }

    }

    //CALCULAR PRECIO
    public Double precioFinal() {
        Double aumentar = 0.0;

        switch (consumoEnergetico) {
            case 'A':
                aumentar += 100;
            case 'B':
                aumentar += 80;
            case 'C':
                aumentar += 60;
            case 'D':
                aumentar += 50;
            case 'E':
                aumentar += 30;
            case 'F':
                aumentar += 10;
        }

        if (peso >= 0 && peso < 19) {
            aumentar += 10;
        } else if (peso >= 20 && peso < 49) {
            aumentar += 50;
        } else if (peso >= 50 && peso <= 79) {
            aumentar += 80;
        } else if (peso >= 80) {
            aumentar += 100;
        }

        return precioBase + aumentar;
    }
}
