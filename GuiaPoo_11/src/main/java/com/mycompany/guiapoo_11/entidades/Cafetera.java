/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_11.entidades;

/**
 *
 * @author HP-G42
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
y cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente,
al menos, los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• Métodos getters y setters.
• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
• Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
//Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
//actual en cero (cafetera vacía).
    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
        
    }
//Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
//café igual a la capacidad máxima.
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima=capacidadMaxima;
    }
// Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
//mayor que la capacidad máxima de la cafetera, la ajustará al máximo.

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        if (cantidadActual > capacidadMaxima) {
            this.capacidadMaxima = cantidadActual;
            this.cantidadActual = cantidadActual;
        } else {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = cantidadActual;
        }  
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        if (cantidadActual>capacidadMaxima) {
            capacidadMaxima=cantidadActual;
            this.cantidadActual = cantidadActual;
        }else
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
//    Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
    public void llenarCafetera() {
        cantidadActual=capacidadMaxima;
    }
//    Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
//    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    public  void servirTaza(int taza) {
        if (cantidadActual<=taza) {
            cantidadActual=0;
        }else
        cantidadActual-=taza;
    }
//    Método vaciarCafetera(): pone la cantidad de café actual en cero.
public void vaciarCafetera() {
        cantidadActual=0;
    }
//Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
public  void agregarCafe(int cant) {
        if (cantidadActual+cant<=capacidadMaxima) {
        cantidadActual+=cant;
    }else
            cantidadActual=capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}

