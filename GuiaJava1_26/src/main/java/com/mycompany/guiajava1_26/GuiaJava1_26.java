/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_26;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
public class GuiaJava1_26 {

    public static void main(String[] args) {
       Matriz matriz=new Matriz();
       Scanner read= new Scanner(System.in);
        System.out.println("Ingrese la dimension ´N´ de la matriz:");
        int n=read.nextInt();
       int[][]mat=new int[n][n];
        System.out.println("Ingrese los "+n*n+" elementos de la matriz:");
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                   mat[i][j]=read.nextInt();
            }
        }
            matriz.PrintMatriz(mat);
           System.out.println("¿La matriz es anti-simetrica?: "+matriz.AntiSimétrica(mat));
    }
}
