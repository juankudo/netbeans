/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_27;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class GuiaJava1_27 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la dimensión ´N´ de la matriz:");
        int n=read.nextInt();        
        System.out.println("Ingrese los "+n*n+" elementos de la matriz:");
        int[][]mat=new int[n][n];
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=read.nextInt();
            }
        }
        PrintMatriz(mat);
        System.out.println("¿La matriz es mágica?: "+MatMagica(mat));
        
    }
    public static void PrintMatriz(int[][] mat){
        String aux;
        for(int[] fila:mat){
            aux="";
            for(int element:fila){
                aux+=" "+element;
            }
            System.out.println(aux);
        }
         System.out.println("*******************************************");
    }
    public static boolean MatMagica(int[][] mat){
        int SumFila=0,SumCol=0,SumD1=0,SumD2=0,SumaPatern;
        boolean bool=true;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                SumFila=SumFila+mat[i][j];
                SumCol=SumCol+mat[j][i];
                if(i==j){
                SumD1=SumD1+mat[i][j];
                }
                if((i+j)==(mat[0].length-1))
                SumD2=SumD2+mat[i][j];
            }
            if (i==0){
                SumaPatern=SumFila;
            }
            if (SumFila==SumCol){
                bool=bool && bool;
            }else{
                bool=false;
            }
        }
        if (SumD1==SumD2){
                bool=bool && bool;
            }else{
                bool=false;
            }return bool;
        }
     }
        
            

