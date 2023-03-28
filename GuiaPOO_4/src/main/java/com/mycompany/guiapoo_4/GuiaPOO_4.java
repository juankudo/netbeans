/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_4;

import com.mycompany.guiapoo_4.entidades.Punto;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Definir una clase llamada Punto con un constructor que
 * inicialice las coordenadas x e y. Generar dos instancias, es decir, crear dos
 * objetos llamados punto1 y punto2 y comprobar la distancia que existe entre
 * ambos. Para conocer como calcular la distancia entre dos puntos consulte el
 * siguiente link: http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
 */
public class GuiaPOO_4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto  (X,Y):");
        Punto punto1 = new Punto(read.nextInt(), read.nextInt());
        System.out.println("Ingrese las coordenadas del segundo punto (X,Y):");
        Punto punto2 = new Punto(read.nextInt(), read.nextInt());
        System.out.println("La distancia entre los puntos es: " + punto1.distancia(punto2));
    }
}
