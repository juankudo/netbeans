/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_15;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class GuiaJava1_15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        String op2 = "";
        int op;
        do {
            System.out.println("Ingrese una opción:");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            op = read.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma es " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta es " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplicación es " + n1 * n2);
                    break;
                case 4:
                    double num = (double) n1;
                    System.out.println("La división es " + num / n2);
                    break;
                case 5:
                    do {
                        System.out.println("¿Desea Salir? (S/N)");
                        op2 = read.next();
                        op2 = op2.toUpperCase();
                        switch (op2) {
                            case "S":
                                System.out.println("Saliendo. Hasta la Proxima.");
                                break;
                            case "N":
                                System.out.println("Volviendo al menu...");
                                break;
                            default:
                                System.out.println("Opción incorrecta. Vuelva a intentar.");
                        }
                    } while (!op2.equals("N") && !op2.equals("S"));
                    break;
                default:
                    System.out.println("Opción incorrecta.Intente nuevamente.");
            }

        } while (!op2.equalsIgnoreCase("s"));
    }
}
