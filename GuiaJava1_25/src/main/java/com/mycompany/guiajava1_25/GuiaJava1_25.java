/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_25;

/**
 *
 * @author HP-G42
 * Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.
 */
public class GuiaJava1_25 {

    public static void main(String[] args) {
        Matriz matriz= new Matriz();
        int mat[][]= new int[4][4];
       matriz.FillMatriz(mat);
       matriz.PrintMatriz(mat);
    }
}
