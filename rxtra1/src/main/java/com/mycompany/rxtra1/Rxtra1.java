/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rxtra1;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Diseñar un procedimiento que permita convertir coordenadas 
 * polares (radio, ángulo) en cartesianas (x,y). NOTA: x=radio*cos(ángulo) e y=radio*sen(ángulo).
 */
public class Rxtra1 {

    public static void main(String[] args) {
        convertCoor();
    }
    public static void convertCoor() {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the polar coordenades (rad, angle) in sexagecimal:");
        int rad = read.nextInt();
        double ang = read.nextDouble();
        ang = ang * Math.PI / 180;
        System.out.println("x= " + Math.floor(rad * Math.cos(ang)));
        System.out.println("y= " + Math.floor(rad * Math.sin(ang)));
    }
}
