/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_tp_9_2;

import com.mycompany.guiapoo_tp_9_2.entidades.ParDeNumeros;
import com.mycompany.guiapoo_tp_9_2.servicios.ParDeNumerosService;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaPoo_tp_9_2 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        ParDeNumeros par=new ParDeNumeros();
        ParDeNumerosService sc=new ParDeNumerosService();
        int op=0;
        char op2=' ';
        do{
        System.out.println("""
                           Menu
                                   1)Mostrar valores
                                   2)Devolver mayor
                                   3)Calcular potencia
                                   4)Calcular raiz
                                   5)Salir
                           """);
        op=read.nextInt();
        switch (op) {
            case 1:
                sc.mostrarValores(par);
                break;
            case 2:
                sc.devolverMayor(par);
                break;
            case 3:
                System.out.println(sc.calcularPotencia(par));
                break;
            case 4:
                System.out.println(sc.calcularRaiz(par));
                break;
            case 5:
                System.out.println("¿Desea salir? (S/N)");
                op2=read.next().toLowerCase().charAt(0);    
                break;
            default:
                System.out.println("Opción incorrecta.");    
        }
        }while(op2!='s');
    }
}
