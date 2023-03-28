/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_6;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class GuiaJava1_Extra_6 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the amount of numbers for load:");
        int n=read.nextInt();
        int cont160=0;
        Double sum160=0.0, sumGen=0.0, datas;
        for (int i = 0; i <n; i++) {
            System.out.println("Enter the "+ (i+1) +" number:");
            datas=read.nextDouble();
            sumGen+=datas;
            if (datas<1.60 ) {
                sum160+=datas;
                cont160++;
            }  
        }
        System.out.println("The average of all statures: "+(sumGen/n)+" mts");
        System.out.println("The average of statures under 1.60 mts.: "+(sum160/cont160)+" mts");
    }
}
