/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_13;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class GuiaJava1_13 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
       int nota;
        do{
            System.out.println("Ingrese una nota entre el 0 y 10:");
            nota=read.nextInt();
                if (nota<0 || nota>10){
                System.out.println("Nota invalida. Intente nuevamente por favor.");
                }else{
                    System.out.println("Nota cargada correctamente.");
                }
           }while (nota<0 || nota>10);
    }
}
