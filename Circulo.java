package com.mycompany.formas;

public class Circulo extends Formas {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularRadio() {
        return radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}
