/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_14;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
public class GuiaJava1_14 {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int max=read.nextInt();
        int sum;
        sum=0;
        do {
            System.out.println("Ingrese un número:");
            int num=read.nextInt();
            sum+=num;
        }while(sum<max);
        System.out.println("Limite superado!!!...");
    }
}
