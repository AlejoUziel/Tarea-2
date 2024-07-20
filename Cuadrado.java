package com.mycompany.formas;

public class Cuadrado extends Formas {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double obtenerLado() {
        return lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

    public double calcularArea() {
        return lado * lado;
    }
}
