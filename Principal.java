
package com.mycompany.formas;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Linea linea = new Linea(10.0);
        Triangulo triangulo = new Triangulo(60.0);
        Cuadrado cuadrado = new Cuadrado(4.0);

        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();
        
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}
