/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_7;

import com.mycompany.guiapoo_7.entidades.Rectángulo;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado alto y un atributo privado largo, dados por el usuario. La clase también
incluirá un método para calcular la superficie del rectángulo, un método para
calcular el perímetro del rectángulo y otro que desplace el rectángulo en el plano.
Y por último tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos
getters, setters y constructores correspondientes.
 */
public class GuiaPoo_7 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the high an the base of the square:");
        Rectángulo rec1=new Rectángulo();
        rec1.setAltura(read.nextInt());
        rec1.setBase(read.nextInt());
        System.out.println("The perimeter is: "+rec1.perimetro());
        System.out.println("The surface is: "+rec1.superficie());
        System.out.println("|||||||||||||||||||||||||||||||||||");
        rec1.printSquare();
        System.out.println("|||||||||||||||||||||||||||||||||||");
        System.out.println("Enter the amount of displacement you want (X,Y):");
        rec1.desplaza(read.nextInt(), read.nextInt());
    }
}
