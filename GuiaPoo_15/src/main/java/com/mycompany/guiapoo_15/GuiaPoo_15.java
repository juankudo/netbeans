/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_15;

import com.mycompany.guiapoo_15.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaPoo_15 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase:");
        String word=read.nextLine();
        Cadena cadena=new Cadena(word);
        int op;
        char op2=' ';
        do{
        System.out.println("""
                           Menu
                           1)Unir frases o plabras
                           2)Reemplazar caracter 'a'
                           3)Contar vocales
                           4)Invertir frase/palabra
                           5)Comparar longitud
                           6)Contar un caracter en la frase
                           7)Salir
                           """);
        op=read.nextInt();
        switch (op) {
            case 1:
                cadena.unirFrases();
                break;
            case 2:
                cadena.reemplazar();
                break;
            case 3:
                cadena.mostrarVocales();
                break;
            case 4:
                cadena.invertirFrase();
                break;
            case 5:
                cadena.compararLongitud();
                break;
            case 6:
                cadena.vecesRepetido();
                break;
            case 7:
                System.out.println("¿Desea salir?(S/N)");
                op2=read.next().toUpperCase().charAt(0);
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
        }while(op2!='S');
    }
}
