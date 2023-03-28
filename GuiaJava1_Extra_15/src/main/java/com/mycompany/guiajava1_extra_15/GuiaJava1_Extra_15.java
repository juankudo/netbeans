/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_15;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
 */
public class GuiaJava1_Extra_15 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String respond="";
        do{
        System.out.println("Enter the name:");
        String name=read.next();
        System.out.println("Enter the age of "+name+" : ");
        int age=read.nextInt();
            if (age<18) {
                System.out.println("Younger");
            }else{
                System.out.println("Adult");
            }
            do {
                  System.out.println("Do you want to enter more persons? (Yes/No)");
                  respond=read.next();
                  if (!respond.equals("No") && !respond.equals("Yes")) {
                      System.out.println("Incorrect opcion. Please try again");
                }
            } while (!respond.equals("No") && !respond.equals("Yes"));
        }while(!respond.equals("No"));
        }
}
