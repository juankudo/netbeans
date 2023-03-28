/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_10.entidades.servicios;

import com.mycompany.guiapoo_10.entidades.Fecha;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class serviciosFecha {
    private Scanner read=new Scanner(System.in);
    /**
     * Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a 2050).
     */
    public Fecha leer() {
        Fecha fecha=new Fecha();
        System.out.println("Ingrese el día (1 a 31)");
        fecha.setDía(read.nextInt());
        System.out.println("Ingrese el mes (1 a 12):");
        fecha.setMes(read.nextInt());
        System.out.println("Ingrese el año (1900 a 2050):");
        fecha.setAño(read.nextInt());
        return fecha;
    }
}
