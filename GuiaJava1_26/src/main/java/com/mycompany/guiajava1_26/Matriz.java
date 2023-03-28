/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiajava1_26;

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
    public boolean AntiSimétrica(int[][] mat){
        int[][]mat2=new int[mat.length][mat.length];
        boolean bool=true;
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
              mat2[i][j]=mat[i][j];
            }
        }
        
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                    mat[i][j]=(mat2[j][i]*-1);
            }
        }
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                  if (mat[i][j]==mat2[i][j])
                      bool=bool && bool;
                  else 
                      bool=false;
            }
        }
        return bool;
    }
    
}
