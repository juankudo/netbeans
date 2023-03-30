/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo3.entidades;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * 3.	Crear una clase llamada Operacion que tenga 
 * como atributos privados numero1 y numero2. 
 * A continuación, se deben crear los siguientes métodos:
 */
public class Operacion {
    private int num1;
    private int num2;
    

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public  void crearOperacion() {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1=read.nextInt();
         System.out.println("Ingrese el segundo número:");
        num2=read.nextInt();
    }
    public int sumar() {
        return num1+num2;
    }
    public int restar() {
        return num1-num2;
    }
    public int multiplicar(){
        if (num1==0 || num2==0) {
            System.out.println("Error multiplicacion por cero");
            return 0;
        } else {
        }
        return num1*num2;
    }
    public double dividir() {
        if (num1==0 ||num2==0) {
            System.out.println("Error division por cero");
            return 0;
        } else {
            return (double)num1/num2;
        }
    }
    
}
