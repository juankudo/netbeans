/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_11;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.
 */
public class GuiaJava1_Extra_11 {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner read=new Scanner(System.in);
        int n=read.nextInt(), cont=1;
        while (n>10) {            
            n=n/10;
            cont++;
        }
        System.out.println("The amount of digits in the number is "+cont);
    }
}
