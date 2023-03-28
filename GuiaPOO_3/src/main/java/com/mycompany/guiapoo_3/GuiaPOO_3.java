/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_3;

import com.mycompany.guiapoo_3.Entidades.Fracción;
import java.util.Scanner;

/**
 *
 * @author HP-G42 Crear una clase llamada Fraccion que contenga métodos para
 * sumar, restar, multiplicar y dividir fracciones. Los argumentos de cada
 * método son el numerador y denominador según corresponda. La clase también
 * debe contener un método constructor con parámetros.
 */
public class GuiaPOO_3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el numerador y el denominador de la primera fracción");
        Fracción fra1 = new Fracción(read.nextInt(), read.nextInt());
        System.out.println("Ingrese el numerador y el denominador de la segunda fracción");
        Fracción fra2 = new Fracción(read.nextInt(), read.nextInt());
        int op;
        String op2 = "";
        do {
            System.out.println("Elija una opcion:");
            System.out.println("Menú");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            op = read.nextInt();
            switch (op) {
                case 1:
                    System.out.println(fra1.sum(fra2));
                    break;
                case 2:
                    System.out.println(fra1.resta(fra2));
                    break;
                case 3:
                    System.out.println(fra1.multiplicación(fra2));
                    break;
                case 4:
                    System.out.println(fra1.división(fra2));
                    break;
                case 5:
                    do {
                        System.out.println("¿Desea salir?(S/N)");
                        op2 = read.next();
                        op2 = op2.toUpperCase();
                        if (!op2.equals("S") && !op2.equals("N")) {
                            System.out.println("Opción equivocada. Por favor vuelva a intentar ;-)");
                        } else if (op2.equals("S")) {
                            System.out.println("Saliendo... Nos vemos pronto! B-)");
                        }
                    } while (!op2.equals("S") && !op2.equals("N"));
                    break;
                default:
                    System.out.println("Opción equivocada. Por favor vuelva a intentar ;-)");
            }
        } while (!op2.equals("S"));
    }
}
