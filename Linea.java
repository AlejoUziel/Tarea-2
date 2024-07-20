package com.mycompany.formas;

public class Linea extends Formas {
    private final double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    public double obtenerLargo() {
        return largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea");
    }
}
