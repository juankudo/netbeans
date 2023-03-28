/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_1;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */
public class GuiaJava1_Extra_1 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Convertir convert=new Convertir();
        System.out.println("Ingrese una cantidad de tiempo en minutos:");
        int min=read.nextInt();
        System.out.println(convert.ConvertDays(min));
        System.out.println("Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si\n" +
"el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 245\n" +
                "culiau\n"+
                "asi se hace\n");
    }
}
