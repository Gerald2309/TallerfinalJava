package com.sofka.tallerJava.Ejercicio18;

public class Videojuego implements Entregable{
    private String titulo;
    private String genero;
    private String compania;
    private Integer horasEstimadas;
    private Boolean entregado;

    protected static Integer tiempoMayor = 1;
    protected static Integer tiempoMenor = -1;
    protected static Integer tiempoIgual = 0;

    private static final Integer HORAS_DEFECTO = 10;

    //CONSTRUCTORES
    public Videojuego() {
        this("", "", "", HORAS_DEFECTO);
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, String genero, String compania, Integer horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
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

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    //MÉTODOS DE toString
    @Override
    public String toString() {
        return "Videojuego: " +
                "titulo = " + titulo + "" +
                ", genero = " + genero + "" +
                ", compañia = " + compania + "" +
                ", horasEstimadas = " + horasEstimadas +
                ", entregado = " + entregado;
    }

    public boolean equals(Videojuego a) {
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())) {
            return true;
          }
          return false;
        }

    //MÉTODOS DE ENTREGALE
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
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
        Integer estadoComparacion = tiempoMenor;

        //Hacemos un casting de objetos para usar el metodo get
        Videojuego ref = (Videojuego) a;
        if (horasEstimadas > ref.getHorasEstimadas()) {
            estadoComparacion = tiempoMayor;
        } else if (horasEstimadas == ref.getHorasEstimadas()) {
            estadoComparacion = tiempoIgual;
        }
        return estadoComparacion;
    }
}
