/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_6;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaJava1_6 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n=read.nextInt();
        System.out.println("El doble de "+ n + " es: "+2*n);
        System.out.println("El triple de "+ n + " es: "+3*n);
        System.out.println("La raiz cuadrada de "+ n + "  es: "+ Math.sqrt(n));
    }
}
