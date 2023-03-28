/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_9;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaJava1_9 {

    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String frase=read.next();
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
}
