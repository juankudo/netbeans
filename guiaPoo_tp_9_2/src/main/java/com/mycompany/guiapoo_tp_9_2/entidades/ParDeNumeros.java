/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_tp_9_2.entidades;

/**
 *
 * @author HP-G42
 */
public class ParDeNumeros {
    private double num1;
    private double num2;

    public ParDeNumeros() {
        num1=Math.random()*10;
        num2=Math.random()*10;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}
