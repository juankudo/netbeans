/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_20;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class GuiaJava1_20 {

    public static void main(String[] args) {
        
        int n1=0,n2=0,n3=0,n4=0;
        n1=CargarNum(n1);
        n2=CargarNum(n2);
        n3=CargarNum(n3);
        n4=CargarNum(n4);
        PrintAst(n1);
        PrintAst(n2);
        PrintAst(n3);
        PrintAst(n4);
        }
        public static int CargarNum(int n){
           Scanner read=new Scanner(System.in);
           do{
            System.out.println("Ingrese el primer número:");
             n=read.nextInt();
             if (n<1 || n>20){
                System.out.println("Opción equivocada. Intente nuevamente.");
            }
            }while(n<1|| n>20); 
           return n;
       }
       public static void PrintAst(int n){
             for (int i=1;i<=n;i++){
              if (i==1){
                  System.out.print(n+"*");
              }else System.out.print("*");
             }System.out.println("");
       }
       
}
        /*do{
            System.out.println("Ingrese el primer número:");
             n1=read.nextInt();
             if (n1<1 || n1>20){
                System.out.println("Opción equivocada. Intente nuevamente.");
            }
            }while(n1<1|| n1>20);
             
        do{
           
            System.out.println("Ingrese el segundo número:");
            n2=read.nextInt();
            
             if (n2<1 || n2>20){
                  System.out.println("Opción equivocada. Intente nuevamente.");
                }
            }while(n2<1 || n2>20);
         do{
            System.out.println("Ingrese el tercer número:");
            n3=read.nextInt();
               if (n3<1 || n3>20){
                System.out.println("Opción equivocada. Intente nuevamente.");
                }
              }while(n3<1 || n3>20);
         do{
            System.out.println("Ingrese el cuarto número:");
            n4=read.nextInt();
            if (n4<1 || n4>20){
                System.out.println("Opción equivocada. Intente nuevamente.");
            }
            }while(n4<1 || n4>20);
         for (int i=1;i<=n1;i++){
              if (i==1){
                  System.out.print(n1+"*");
              }else
              System.out.print("*");
          }  System.out.println("");
         for (int i=1;i<=n2;i++){
              if (i==1){
                  System.out.print(n2+"*");
              }else
              System.out.print("*");
          }  System.out.println("");
         for (int i=1;i<=n3;i++){
              if (i==1){
                  System.out.print(n3+"*");
              }else
              System.out.print("*");
          }  System.out.println("");
         for (int i=1;i<=n4;i++){
              if (i==1){
                  System.out.print(n4+"*");
              }else
              System.out.print("*");
          } */
    