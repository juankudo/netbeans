/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_11;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class GuiaJava1_11 {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String frase=read.nextLine();
    if (frase.substring(0, 1).toUpperCase().equals("A")){
        System.out.println("CORRECTO");
    }else{
         System.out.println("INCORRECTO");
    } 
    }
}
