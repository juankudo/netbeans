/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_11;

import com.mycompany.guiapoo_11.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
y cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente,
al menos, los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• Métodos getters y setters.
• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
• Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
 */
public class GuiaPoo_11 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Cafetera cafetera= new Cafetera();
        System.out.println(cafetera);
        System.out.print("Ingrese la capacidad de la cafetera:");
        cafetera= new Cafetera(read.nextInt());
        System.out.println(cafetera);
        System.out.print("Ingrese la cantidad actual de la cafetera:");
        cafetera.setCantidadActual(read.nextInt());
        System.out.println(cafetera);
        System.out.println("Ingrese la capacidad y la cantidad de cafe de la segunda cafetera");
        Cafetera cafetera2=new Cafetera(read.nextInt(), read.nextInt());
        System.out.println(cafetera2);
        int op=0;
        String op2="";
        do {
            do{
        System.out.println("Ingrese una de las opciones:");
        System.out.println("1) Servir una taza.");
        System.out.println("2) Vaciar cafetera.");
        System.out.println("3) Llenar cafetera.");
        System.out.println("4) Agregar café");
        System.out.println("5) Salir");
        op=read.nextInt();
            if (op<1 || op>5) {
                System.out.println("Opción incorrecta. Intente nuevamente por favor");
            }
        }while(op<1 || op>5);
        switch (op) {
            case 1:
                System.out.println("Ingrese la capacidad de la taza en cc:");
                cafetera.servirTaza(read.nextInt());
                System.out.println(cafetera);
                break;
            case 2:
                cafetera.vaciarCafetera();
                System.out.println(cafetera);
                break;
            case 3:
                cafetera.llenarCafetera();
                System.out.println(cafetera);
                break;
            case 4:
                System.out.println("Ingrese la cantidad de cafe que desea agregar en cc:");
                cafetera.agregarCafe(read.nextInt());
                System.out.println(cafetera);
                break;
            case 5:
                do {
                    System.out.println("¿Desea salir?(S/N)");
                op2=read.next();
                if (!op2.equalsIgnoreCase("s") && !op2.equalsIgnoreCase("n")) {
                    System.out.println("Opción incorrecta. Intente nuevamente por favor");
                }
                } while (!op2.equalsIgnoreCase("s") && !op2.equalsIgnoreCase("n"));
                break;
        }
        } while (!op2.equalsIgnoreCase("s"));
    }
}
