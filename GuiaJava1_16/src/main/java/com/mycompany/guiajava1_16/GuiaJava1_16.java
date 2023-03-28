/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_16;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class GuiaJava1_16 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num, sum=0;
        System.out.println("Ingrese los 20 números a sumar: ");
        for(int i=1;i<21;i++){
            num=read.nextInt();
            if (num>0){
                sum=sum+num;
            }else if (num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            }
        System.out.println("La suma de los números es: "+sum);
    }             
  }

