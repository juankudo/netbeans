/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_5;

import com.mycompany.guiapoo_5.entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Definir la clase Tiempo, la cual tendrá la hora, minutos y
 * segundos. Definir dos constructores: un constructor vacío y otro con la hora,
 * minutos y segundos ingresado por el usuario. Deberá definir además, los
 * métodos getters y setters correspondientes, y el método
 * imprimirHoraCompleta().
 */
public class GuiaPoo_5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Tiempo tiempo = new Tiempo();
        System.out.println("Ingrese la hora, minutos y segundos:");
        tiempo.setHora(read.nextInt());
        tiempo.setMinutos(read.nextInt());
        tiempo.setSegundos(read.nextInt());
        System.out.println("...............................................");
        System.out.println("La hora ingresada es: " + tiempo.getHora() + " horas, " + tiempo.getMinutos() + " minutos, " + tiempo.getSegundos() + " segundos.");
        System.out.println("...............................................");
        System.out.println("Ingrese nuevos hora, minutos y segundos:");
        Tiempo tiempo1 = new Tiempo(read.nextInt(), read.nextInt(), read.nextInt());
        tiempo1.imprimirHoraCompleta();
    }
}
