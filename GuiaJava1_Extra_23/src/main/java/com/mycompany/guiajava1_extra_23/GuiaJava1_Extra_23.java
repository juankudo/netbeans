/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_23;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
 */
public class GuiaJava1_Extra_23 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the number for the  succession of Fibonaccin: ");
        int n=read.nextInt();
        int[] vec= new int[n];
        fillVector(vec);
        printVec(vec);
    }
    public static void fillVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) 
           vec[i]=fibonaccin(i);   
        }
    public static void printVec(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (i==0) {
                 System.out.print("("+vec[i]+" , ");
            }else if(i==(vec.length-1)){
                System.out.println(vec[i]+")");
            }else
            System.out.print(vec[i]+" , ");  
        }
    }
       public static int fibonaccin(int n) {
        if (n<=1) {
            return 1;
        }else
            return (fibonaccin(n-1)+fibonaccin(n-2));
    } 
    }
    

