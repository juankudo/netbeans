/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_8;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */
public class GuiaJava1_Extra_8 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num,sumPar=0,sumImpar=0;
       do{
            System.out.println("Enter integer numbers:");
        num=read.nextInt();
           if (num%5==0) {
               break;
           }
        if (num>0) {
            if (num%2==0) {
                sumPar++;    
        } else{
              sumImpar++;  
            }
        }
       }while(!(num%5==0));
        System.out.println("The amount of even numbers is: "+sumPar);
        System.out.println("The amount of odd numbers is: "+sumImpar);
    }
}
