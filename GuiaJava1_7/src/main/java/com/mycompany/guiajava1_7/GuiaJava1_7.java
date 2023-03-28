/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_7;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaJava1_7 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int n1=read.nextInt();
        System.out.println("Ingrese el primer número: ");
        int n2=read.nextInt();
        if (n1<n2) {
              System.out.println("El número mayor es: "+ n2);
        } else if (n1>n2){
            System.out.println("El número mayor es: "+ n1);
        } else{
            System.out.println("Los números son iguales");
        }           
     }
}
