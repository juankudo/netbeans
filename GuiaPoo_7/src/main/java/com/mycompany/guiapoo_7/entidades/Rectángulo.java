/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_7.entidades;

/**
 *
 * @author HP-G42
 */
public class Rectángulo {
    private int altura;
    private int base;

    public Rectángulo() {
    }

    public Rectángulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    public int perimetro() {
        return 2*(base+altura);
    }
    public int superficie() {
        return base*altura;
    }
    public void printSquare() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1 || j==0 || j==base-1) {
                    System.out.print(" * ");
                } else 
                    System.out.print("   ");
            }
            System.out.println("");
        }
    }
    public  void desplaza(int x, int y) {
        for (int i = 0; i < altura+y; i++) {
            for (int j = 0; j < base+x; j++) {
                if (i==0 && j>=x || i==altura-1 && j>=x || j==base+x-1 && i<altura-1||j==x && i<altura-1) {
                    System.out.print(" * ");
                } else 
                    System.out.print("   ");
            }
            System.out.println("");
        }
    }
}
