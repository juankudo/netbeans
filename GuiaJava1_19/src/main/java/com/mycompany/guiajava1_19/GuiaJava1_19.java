/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_19;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class GuiaJava1_19 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese los un número entero ´N´, elementos del cuadrado por lado:");
        int n=read.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");}
            }System.out.println("");
        }
        
       
    }
}
