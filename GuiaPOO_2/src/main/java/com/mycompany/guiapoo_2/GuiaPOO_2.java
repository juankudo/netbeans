/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiapoo_2;

import com.mycompany.guiapoo_2.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaPOO_2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the radio:");
        Circunferencia rad = new Circunferencia(read.nextInt());
        System.out.println("The area for the radio "+rad.getRadio()+" is:");
        System.out.println(rad.area());
        System.out.println("The perimeter for the radio "+rad.getRadio()+" is:");
        System.out.println(rad.perimetro());
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println("Enter a new radio;");
        rad.setRadio(read.nextInt());
        System.out.println("The area for the radio "+rad.getRadio()+" is:");
        System.out.println(rad.area());
        System.out.println("The perimeter for the radio "+rad.getRadio()+" is:");
        System.out.println(rad.perimetro());
     
        
    }
}
