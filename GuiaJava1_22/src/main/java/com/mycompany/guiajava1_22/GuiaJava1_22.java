/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_22;

/**
 *
 * @author HP-G42
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
public class GuiaJava1_22 {

    public static void main(String[] args) {
        int[] vector= new int[100];
        for(int i=0;i<100;i++){
            vector[i]=i+1;
            if (i==99)
                System.out.println(vector[i]);
            else
            System.out.print(vector[i]+",");
        }
    }
}
