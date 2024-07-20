package com.mycompany.formas;

public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    public double obtenerAngulo() {
        return angulo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }

    public double calcularArea() {
        double base = 10;
        double altura = Math.sin(Math.toRadians(angulo)) * base;
        return (base * altura) / 2;
    }
}