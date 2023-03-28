/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_12;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
public class GuiaJava1_Extra_12 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the size of the numbers ladder:");
        int n=read.nextInt();
        String aux="";
        for (int i = 1; i <= n; i++) {
            aux+=i;
            System.out.println(aux);  
        }
    }
}
