/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiajava1_25;

/**
 *
 * @author HP-G42
 */
public class Matriz {
    public void PrintMatriz(int[][] mat){
        String aux;
        for (int[] fila: mat){
            aux="";
            for(int elemnt: fila){
                aux+=" "+elemnt;   
            }
            System.out.println(aux);
        }
    }
    public void FillMatriz(int[][] mat){
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                   mat[i][j]=(int)(Math.random()*10);
            }
        }        
    }  
}
