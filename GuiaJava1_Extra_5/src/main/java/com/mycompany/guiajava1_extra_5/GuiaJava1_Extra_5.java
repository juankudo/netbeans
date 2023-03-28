/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_5;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */
public class GuiaJava1_Extra_5 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String clase;
        do {            
        System.out.println("Ingrese su clase de plan social:");
        System.out.println("A) Socios tipo ‘A’");
        System.out.println("B) Socios tipo ‘B’ ");
        System.out.println("C) Socios tipo ‘C’");
        clase=read.next();
        clase=clase.toUpperCase();
        if (!clase.equals("A") && !clase.equals("B") && !clase.equals("C")) {
            System.out.println("Incorrect opcion. Try again please ;-)");
                }else{
            System.out.println("Option successfully loaded.");
        }
        } while (!clase.equals("A") && !clase.equals("B") && !clase.equals("C"));
        System.out.println("Enter the price of the treatment:");
        int price=read.nextInt();
        calculator(price, clase);
    }
    public static void calculator(int num, String letter) {
        switch (letter) {
            case "A":
                System.out.println("Total to pay: $ "+ (num*0.5));
                break;
            case "B":
                System.out.println("Total to pay: $ "+ (num*0.65));
                break;
            case "C":
                System.out.println("Total to pay: $ "+ num);
                break;
        }
            
    }
}
