/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_4;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
public class GuiaJava1_Extra_4 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n;
        do{
        System.out.println("Ingrese un número entre 1 y 10:");
        n=read.nextInt();
        if (n<11 && n>0) {
            System.out.println("Número cargado correctamente.");
        }else {
            System.out.println("Número incorrecto. Intente nuevamente.");
        }
        }while(!(n<11 && n>0));
        Romans(n);
    }
    public static void Romans(int num) {
        String NumRom="";
        switch (num) {
            case 1, 2, 3 :
                for (int i = 0; i <num; i++) {
                    NumRom+="I";
                }
                break;
                case 4 :
                NumRom="IV";
                break;
                case 5, 6, 7, 8 :
                    NumRom="V";
                for (int i = 5; i <num; i++) {
                    NumRom+="I";
                }
                break;
                case 9 :
                NumRom="IX";
                break;
                case 10 :
                NumRom="X";
                break;
        }
        System.out.println("In roman numbers is: "+NumRom);
    }
}
