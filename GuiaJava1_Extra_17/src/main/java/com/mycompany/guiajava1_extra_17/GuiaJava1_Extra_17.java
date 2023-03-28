/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_17;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
 */
public class GuiaJava1_Extra_17 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el tamaño 'N' del vector: ");
        int n=read.nextInt(), sum=0;
        int[] vec=new int[n];
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingrese el número de la posicion "+i+" del vector: ");
            vec[i]=read.nextInt();
            sum+=vec[i];
        }
        String aux="";
        for (int elemnto : vec) {
            aux+=" "+elemnto;
        }
        System.out.println("("+aux+")");
        System.out.println("La suma de los elementos del vector es "+sum);
    }
}
