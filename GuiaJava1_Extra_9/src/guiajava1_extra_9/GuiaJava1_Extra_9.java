/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiajava1_extra_9;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
public class GuiaJava1_Extra_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese los 2 números enteros a dividir:");
        int dividendo=read.nextInt();
        int divisor=read.nextInt();
        int cociente=0;
        while (dividendo>divisor){
            cociente++;
            System.out.print(dividendo+" - "+divisor+" = ");
            dividendo=dividendo-divisor;
            System.out.println(dividendo);
        } 
        System.out.println("El cociente de la división es "+cociente);
        System.out.println("EL residuo de la división es "+dividendo);
    }
    
}
