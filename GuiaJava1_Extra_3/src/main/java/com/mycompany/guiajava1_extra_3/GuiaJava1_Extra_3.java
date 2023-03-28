/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_3;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
public class GuiaJava1_Extra_3 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        String letter=read.next();
        letter=letter.toUpperCase();
        if (letter.equals("A")||letter.equals("E")||letter.equals("I")||letter.equals("O")||letter.equals("U")) {
            System.out.println("The letter is a vocal ;-)");
        } else {System.out.println("Sorry, the letter isn´t a vocal :-(");
        
        }
    }
}
