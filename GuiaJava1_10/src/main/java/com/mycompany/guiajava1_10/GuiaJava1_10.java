/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_10;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class GuiaJava1_10 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String frase=read.next();
        if(frase.length()==8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
