/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_2.entidades;

/**
 *
 * @author HP-G42
 */
public class Circunferencia {
    private int radio;

    public Circunferencia() {
    }
    public Circunferencia(int radio) {
        this.radio = radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public int getRadio() {
        return radio;
    }
    public  double perimetro() {
        return 2*radio*Math.PI;
    }
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
    
}
