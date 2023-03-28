/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_19;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */
public class GuiaJava1_Extra_19 {

    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector:");
        int n=read.nextInt();
        int[] vec= new int[n];
        fillVector(vec);
        printVector(vec);
    }
    public static void fillVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
           vec[i]=randonize(-10, 20);
        }
    }
    public static void printVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (i==0) {
                System.out.print( "("+vec[i]);
            }else if (i==(vec.length-1)){ 
                 System.out.println( ","+vec[i]+")");
            }else 
                System.out.print( ","+vec[i]);
            }   
        }
    public static int randonize(int min, int max) {
        return (int)(Math.floor((Math.random()*(max-min+1))+min));        
    }
}

