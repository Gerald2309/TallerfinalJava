package com.sofka.tallerJava.Ejercicio17;

public class Lavadora extends Electrodomestico{
    private Integer carga;
    private final static Integer CARGA_POR_DEFECTO = 5;

    public Lavadora() {
        this(PRECIO_BASE_POR_DEFECTO, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, PESO_POR_DEFECTO, CARGA_POR_DEFECTO);
    }

    public Lavadora(Double precioBase, Double peso) {

        this(precioBase, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, peso, CARGA_POR_DEFECTO);
    }

    public Lavadora(Double precioBase, Colores color, Character consumoEnergetico, Double peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public Double precioFinal(){
        double aumentar = super.precioFinal();
        if (carga > 30) {
            aumentar += 50;
        }

        return aumentar;
    }
}
