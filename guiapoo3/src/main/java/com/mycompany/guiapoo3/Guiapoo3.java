/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo3;

import com.mycompany.guiapoo3.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class Guiapoo3 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String op="";
        int op1;
        Operacion operacion=new Operacion();
        operacion.crearOperacion();
        do {
            System.out.println("""
                               MENU
                                        1)Sumar
                                        2)Restar
                                        3)Dividir
                                        4)Multiplicar
                                        5)Salir
                               """);
            op1=read.nextInt();
            switch (op1) {
                case 1:
                    System.out.println("La suma es: "+operacion.sumar());
                    break;
                case 2:
                    System.out.println("La resta es: "+operacion.restar());
                    break;
                case 3:
                    System.out.println("La división es: "+operacion.dividir());
                    break;
                case 4:
                    System.out.println("La multiplicación es: "+operacion.multiplicar());
                    break;
                case 5:
                    System.out.println("¿Desea Salir?");
                    op=read.next();
                    if (!op.equalsIgnoreCase("s")&&!op.equalsIgnoreCase("n")) {
                        System.out.println("Opción incorrecta");
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor vuelva a intentar.");
            }
            
        } while (!op.equalsIgnoreCase("s"));
    }
}
