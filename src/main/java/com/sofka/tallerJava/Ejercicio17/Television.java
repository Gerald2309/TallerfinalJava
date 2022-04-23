package com.sofka.tallerJava.Ejercicio17;

public class Television extends Electrodomestico {
        private Integer resolucion;
        private Boolean sintonizadorTDT;

        private final static Integer RESOLUCION_POR_DEFECTO = 20;

        public Television() {
                this(PRECIO_BASE_POR_DEFECTO, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, PESO_POR_DEFECTO, RESOLUCION_POR_DEFECTO, false);
        }

        public Television(Double precioBase, Double peso) {
                this(precioBase, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, peso, RESOLUCION_POR_DEFECTO, false);
        }

        public Television(Double precioBase, Electrodomestico.Colores color, Character consumoEnergetico, Double peso, Integer resolucion,
                          Boolean sintonizadorTDT) {
                super(precioBase, color, consumoEnergetico, peso);
                this.resolucion = resolucion;
                this.sintonizadorTDT = sintonizadorTDT;
        }

        public Integer getResolucion() {
                return resolucion;
        }

        public Boolean getSintonizadorTDT() {
                return sintonizadorTDT;
        }

        public Double precioFinal(){
                double aumentar = super.precioFinal();
                if (resolucion > 40) {

                        aumentar += precioBase * 0.3;
                }
                if (sintonizadorTDT){
                        aumentar += 50;
                }
                return aumentar;
        }
}
