/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_28;

/**
 *
 * @author HP-G42
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
public class GuiaJava1_28 {
   
    public static void main(String[] args) {
        Matriz matriz=new Matriz();
        int[][]Mat10x10=new int[10][10];
        int[][]Mat3x3=new int[3][3];
        boolean bool=true;
        int cont=0;
         matriz.FillMatriz(Mat3x3);
      do{
        matriz.FillMatriz(Mat10x10);
       
//            for (int i = 0; i < Mat3x3.length; i++) {
//                for (int j = 0; j < Mat3x3[0].length; j++) {
//                    Mat3x3[i][j]=Mat10x10[i+5][j+4];
//                } 
//            }
        matriz.PrintMatriz(Mat3x3);
        System.out.println("");
        matriz.PrintMatriz(Mat10x10);
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                bool=true;
                for(int m=(0+i);m<=(2+i);m++){
                    for(int n=(0+j);n<=(2+j);n++){
                        if (Mat10x10[m][n]==Mat3x3[m-i][n-j]){
                          bool=bool && bool;
                        }else{
                            bool=false;
                        }
                    }
                }
                if (bool){
                    System.out.println("Se encontró la matriz! :-)");
                    System.out.println("En la posición:");
                    System.out.print("("+(i)+","+(j)+")");
                    System.out.println("");
                    cont++;
                }
            }
        }
        if (cont==0){
            System.out.println("No se encontró la matriz :'( ");
        }
     }while (!bool);
        
    }      
}

