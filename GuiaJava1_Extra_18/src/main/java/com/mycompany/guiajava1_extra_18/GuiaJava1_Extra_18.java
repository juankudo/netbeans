/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_18;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
public class GuiaJava1_Extra_18 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector:");
        int n=read.nextInt();
        int[] vec1= new int[n], vec2=new int[n];
        fillVector(vec1);
        fillVector(vec2);
        printVector(vec1);
        printVector(vec2);
        compare(vec1, vec2);
    }
    public static void fillVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
           vec[i]=randonize(-10, 20);
        }
    }
    public static void printVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (i==0) {
                System.out.print( "("+vec[i]);
            }else if (i==(vec.length-1)){ 
                 System.out.println( ","+vec[i]+")");
            }else 
                System.out.print( ","+vec[i]);
            }   
        }
    public static void compare(int[]mat1,int[]mat2) {
        int cont=0;
        for (int i = 0; i < mat1.length; i++) {
            if (mat2[i] == mat1[i]) {
                cont++;
            }else
                break;
        }
        if (cont==mat1.length) {
            System.out.println("Las matrices son iguales B-)");
        }else{
            System.out.println("Las matrices no son iguales :'-(");
        }
    }
    public static int randonize(int min, int max) {
        return (int)(Math.floor((Math.random()*(max-min+1))+min));        
    }
        
    }

