/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_13;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
 */
public class GuiaJava1_Extra_13 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the amount of families:");
        int numFam=read.nextInt(), sumChild=0;
        Double sumAge=0.0;
        for (int i = 1; i <= numFam; i++) {
             System.out.println("Enter the amount of childrens, in family number "+i+" : ");
        int numChild=read.nextInt();
        sumChild+=numChild;
            for (int j = 1; j <=numChild; j++) {
                System.out.println("Enter them age of children "+j+" : ");
//                int age=read.nextInt();
                int age=randomnize(1,25);
                System.out.println(age);
                sumAge+=age;
            }
        }
        Double ave=sumAge/sumChild;
        System.out.println("The average of ages for childrens is: "+ave);
       
    }
    public static int randomnize(int min, int max) {
            return (int)(Math.floor(Math.random()*(max-min+1))+min);
    }
}
