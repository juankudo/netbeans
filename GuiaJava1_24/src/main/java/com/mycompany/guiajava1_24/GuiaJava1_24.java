/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_24;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class GuiaJava1_24 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=read.nextInt();
        int[] vector= new int[n];
        int dig1=0,dig2=0,dig3=0,dig4=0,dig5=0;
        for(int i=0;i<n;i++){
            vector[i]=randomnize(1, 99999);
            String chain=String.valueOf(vector[i]);
                switch (chain.length()) {
                case 1:
                   dig1=dig1+1;
                    break;
                case 2:
                    dig2=dig2+1;
                    break;
                case 3:
                    dig3=dig3+1;
                    break;
                case 4:
                    dig4=dig4+1;
                    break;
                case 5:
                    dig5=dig5+1;
                    break;
            }
  
        }
        System.out.println("Los numero de 1 digito son: "+dig1);
        System.out.println("Los numero de 2 digito son: "+dig2);
        System.out.println("Los numero de 3 digito son: "+dig3);
        System.out.println("Los numero de 4 digito son: "+dig4);
        System.out.println("Los numero de 5 digito son: "+dig5);  
    }
    public static int randomnize(int min, int max) {
        return (int)Math.floor((Math.random()*(max-min+1))+min);
    }
}
