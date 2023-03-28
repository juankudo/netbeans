/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_4.entidades;

/**
 *
 * @author HP-G42
 * Definir una clase llamada Punto con un constructor que
 * inicialice las coordenadas x e y. Generar dos instancias, es decir, crear dos
 * objetos llamados punto1 y punto2 y comprobar la distancia que existe entre
 * ambos. Para conocer como calcular la distancia entre dos puntos consulte el
 * siguiente link: http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
 */
public class Punto {
    private int coorX;
    private int coorY;

    public Punto() {
    }

    public Punto(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }
    public Double distancia(Punto p2) {
       return Math.hypot(p2.coorX-coorX, p2.coorY-coorY);
        
    }

    public int getCoorX() {
        return coorX;
    }

    public int getCoorY() {
        return coorY;
    }
    
}
