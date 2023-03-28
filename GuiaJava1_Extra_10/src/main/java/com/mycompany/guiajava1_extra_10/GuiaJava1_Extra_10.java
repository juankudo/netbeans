/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_10;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
public class GuiaJava1_Extra_10 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int adivina,n;
        int adivina1=random(0,10);
        int adivina2=random(0, 10);
        do {            
           System.out.println("Ingrese un número:");
        n=read.nextInt(); 
        adivina=adivina1*adivina2;
            if (n==adivina) {
            System.out.println("Acertaste!!! :-) ");
            System.out.println(adivina1+" x "+adivina2+"="+adivina);
        }else{
            System.out.println("Intentá otra vez :'-( ");
        } 
        } while (!(n==adivina));
    }
public static int random(int min,int max){
return (int)(Math.floor((Math.random()*(max-min+1))+min));
}
}


