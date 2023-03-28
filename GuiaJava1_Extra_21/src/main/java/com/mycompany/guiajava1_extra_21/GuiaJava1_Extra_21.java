/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_21;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
 */
public class GuiaJava1_Extra_21 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de la matriz de tamaño NxM:");
        int n=read.nextInt();
        int m=read.nextInt();
        int[][] mat=new int[n][m];
        fillMatriz(mat);
        printMatriz(mat);
        System.out.println("La suma de sus elementos es: "+sumMatriz(mat));
    }
    public static void fillMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
               mat[i][j]=randonize(10, 90);             
            }   
        }
    }
    public static void printMatriz(int[][] mat) {
        String aux;
        for (int[] fila: mat) {
            aux="";
            for (int elemento: fila) {
                aux+=" "+elemento;
            }
            System.out.println(aux);
        }
    }
    public static int sumMatriz(int[][] mat) {
        int sum=0;
        for (int[] fila: mat) {
            for (int elemento: fila) {
                sum+=+elemento;
            }
        }
        return sum;
    }
    public static int randonize(int min, int max) {
        return (int)(Math.floor((Math.random()*(max-min+1))+min));
    }
}
