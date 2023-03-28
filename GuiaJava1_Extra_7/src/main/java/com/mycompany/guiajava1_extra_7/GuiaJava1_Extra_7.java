/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_7;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números . El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
public class GuiaJava1_Extra_7 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the amount of numbers 'n' (n>0):");
        int n=read.nextInt();
        int data, min=0 ,max=0,sum=0;
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter the number "+(i+1)+" of the set: ");
//            data=read.nextInt();
//            sum+=data;
//            if (i==0) {
//                min=data;
//                max=data;                
//            }else{
//            if (max<data) {
//               max=data; 
//            }
//            if (min>data) {
//                max=data;
//            }
//            }
//        }
//        System.out.println("The highest number is: "+max);
//        System.out.println("The lowest number is: "+min);
//        System.out.println("The average of all numbers is: "+(sum/n));


//        int cont=0;
//        do {
//            cont++;
//            System.out.println("Enter the number "+(i+1)+" of the set: ");
//            data=read.nextInt();
//            sum+=data;
//            if (i==0) {
//                min=data;
//                max=data;                
//            }else{
//            if (max<data) {
//               max=data; 
//            }
//            if (min>data) {
//                max=data;
//            }
//            }
//        }while(cont<n);
//        System.out.println("The highest number is: "+max);
//        System.out.println("The lowest number is: "+min);
//        System.out.println("The average of all numbers is: "+(sum/n));
        int cont=0;
        while(cont<n){
            cont++;
            System.out.println("Enter the number "+(i+1)+" of the set: ");
            data=read.nextInt();
            sum+=data;
            if (i==0) {
                min=data;
                max=data;                
            }else{
            if (max<data) {
               max=data; 
            }
            if (min>data) {
                max=data;
            }
            }
        }
        System.out.println("The highest number is: "+max);
        System.out.println("The lowest number is: "+min);
        System.out.println("The average of all numbers is: "+(sum/n));
    }
}
