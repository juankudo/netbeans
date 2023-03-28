/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_16;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
public class GuiaJava1_Extra_16 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter a integer number:");
        int n=read.nextInt();
        System.out.println("The number "+n+" is odd: "+primo(n));
    }
    public static Boolean primo(int n) {
        int divisor=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                divisor++;
                }
            if (divisor==3) 
            break;
        }
        if (divisor==3) 
            return false;
        else {
            return true;
        }
        }
}
