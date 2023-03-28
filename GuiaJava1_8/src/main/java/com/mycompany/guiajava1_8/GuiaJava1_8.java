/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_8;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaJava1_8 {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = read.nextInt();
            if(n%2==0){
            System.out.println("El numero "+n+" es par.");            
        }else{
            System.out.println("El numero "+n+" es impar.");
        }
    }
}
