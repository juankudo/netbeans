/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_21;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class GuiaJava1_21 {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int euros, op;
        do{
        System.out.println("Ingrese la cantidad de euros");
        euros=read.nextInt();
        }while(euros<0);
        do{
        System.out.println("Elija la moneda a converir: ");
        System.out.println("1)Libras");
        System.out.println("2)Dólares");
        System.out.println("3)Yenes");
        op=read.nextInt();
        if(op<1||op>3)
                System.out.println("Opción incorrecta. Intente nuevamente por favor.");
        }while(op<1||op>3);
        Convert change=new Convert();
        switch(op){
            case 1: 
                change.libras(euros);
            break;
            case 2: System.out.println(change.dolar(euros) +" Dolares");
            break;
            case 3:
                System.out.println(change.yen(euros)+" Yenes");
        }
    }
}
