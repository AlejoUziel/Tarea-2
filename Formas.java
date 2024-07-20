package com.mycompany.formas;

public abstract class Formas {
    private String color;

    public void establecerColor(String color) {
        this.color = color;
    }

    public String obtenerColor() {
        return color;
    }

    public abstract void dibujar();
}
