/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_4;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaJava1_4 {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String Frase=read.nextLine();
        System.out.println(Frase.toUpperCase());
        System.out.println(Frase.toLowerCase());
    }
}
