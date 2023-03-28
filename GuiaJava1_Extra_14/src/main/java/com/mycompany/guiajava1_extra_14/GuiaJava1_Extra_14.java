/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_14;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
public class GuiaJava1_Extra_14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = read.nextInt();
        int num2 = read.nextInt(), op;
        String op2 = "";
        do {
            do {
                System.out.println("""
                                   Menu
                                   1) sum
                                   2) subtract
                                   3) multiply
                                   4) divide
                                   5) exit
                                   """);
                op = read.nextInt();
                if (op < 1 || op > 5) {
                    System.out.println("Incorrect opcion. try again please :-)");
                }
            } while (op < 1 || op > 5);
            switch (op) {
                case 1:
                    System.out.println("The result of  the sum is: " + sum(num1, num2));
                    break;
                case 2:
                    System.out.println("The result of  the substraction is: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("The result of  the multiplication is: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("The result of  the division is: " + divide(num1, num2));
                    break;
                case 5:
                    do {
                        System.out.println("Do you want to exit? (Y/N)");
                        op2 = read.next();
                        op2 = op2.toUpperCase();
                        if (!op2.equals("Y") && !op2.equals("N")) {
                            System.out.println("Incorrect opcion. Please try again B-)");
                        }
                        if (op2.equals("Y")) {
                            System.out.println("See you later! Exiting...");
                        }
                    } while (!op2.equals("Y") && !op2.equals("N"));
                    break;
            }
        } while (!op2.equals("Y"));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static Double divide(int num1, int num2) {
//        Double numDou1=(double)(num1);
        Double numDou2 = (double) (num2);
        return num1 / numDou2;
    }
}
