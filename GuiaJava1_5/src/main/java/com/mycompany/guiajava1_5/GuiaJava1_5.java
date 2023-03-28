/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_5;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaJava1_5 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados (°C): ");
        int centigrados = read.nextInt();
        int result=32+(9*centigrados/5);
        System.out.println("La temperatura en grados Fahrenheit es: "+result);
    }
}
