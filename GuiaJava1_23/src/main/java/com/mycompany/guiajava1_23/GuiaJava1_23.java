/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_23;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
public class GuiaJava1_23 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n=read.nextInt();
        System.out.println("Ingrese un número a buscar en el vector:");
        int buscar=read.nextInt();
        int vector[] = new  int[n];
        int rep=0;
        for (int i=0;i<n;i++){
            vector[i]=(int)(Math.random()*10);
            if (vector[i]==buscar){
                System.out.println("El número "+buscar+" se encuentra en la posición "+i);
                rep=rep+1;
            }      
        }
        if (rep>1){
            System.out.println("El número se encuentra repetido "+rep+" veces.");
        }else if (rep==0){
            System.out.println("El número no se encontro. :´(");
        }
            
    }
}
