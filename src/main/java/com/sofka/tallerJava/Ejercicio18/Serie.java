package com.sofka.tallerJava.Ejercicio18;

public class Serie implements Entregable {
    private String titulo;
    private String genero;
    private String creador;
    private Integer numeroDeTemporadas;
    private Boolean entregado;

    private static final Integer NUMERO_TEMPORADAS_DEFECTO = 3;

    protected static Integer temporadaMenor = -1;
    protected static Integer temporadaMayor = 1;
    protected static Integer temporadaIgual = 0;

    //CONSTRUCTORES
    public Serie() {
        this("", "", "", NUMERO_TEMPORADAS_DEFECTO);
    }

    public Serie(String titulo, String creador) {
        this( "", creador, "", NUMERO_TEMPORADAS_DEFECTO);
    }

    public Serie(String titulo, String genero, String creador, Integer numeroDeTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.entregado = false;
    }

    //SETTERS Y GETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Integer getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    //MÉTODOS ToString
    @Override
    public String toString() {
        return "Serie: " +
                "título = " + titulo + ", " +
                "género = " + genero + ", " +
                "creador = " + creador + ", " +
                "numeroDeTemporadas = " + numeroDeTemporadas + ", " +
                "entregado = " + entregado;
    }

    public boolean equals(Serie a) {
            if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())) {
                return true;
            }
            return false;
        }

    //MÉTODOS DE ENTREGABLE
    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        if (entregado){
            return true;
        }
        return false;
    }

    @Override
    public Integer compareTo(Object a) {
        Integer estadoComparacion = temporadaMenor;

        Serie ref = (Serie) a;
        if (numeroDeTemporadas > ref.getNumeroDeTemporadas()) {
            estadoComparacion = temporadaMayor;
        } else if (numeroDeTemporadas == ref.getNumeroDeTemporadas()) {
            estadoComparacion = temporadaIgual;
        }
        return estadoComparacion;
    }
}