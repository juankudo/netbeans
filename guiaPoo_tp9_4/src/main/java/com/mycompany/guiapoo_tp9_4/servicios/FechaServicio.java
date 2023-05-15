/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_tp9_4.servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class FechaServicio {
    Scanner read=new Scanner(System.in);
    /**
     * Pregunta al usuario día, mes y año de su nacimiento.
     * @return un nuevo objeto Date.
     */
    public Date fechaNacimiento() {
        System.out.println("Ingrese el dia de su nacimiento (AAAA):");
        int dia=read.nextInt();
        System.out.println("Ingrese el mes de su nacimiento (MM):");
        int mes=read.nextInt();
        mes--;
        System.out.println("Ingrese el año de su nacimiento:");
        int año=read.nextInt();
        año-=1900;
        return new Date(año, mes, dia);
    }
    /**
     * crea un objeto fecha con el día actual. 
     * @return un nuevo objeto Date.
     */
    public Date fechaActual() {
        return new Date();
    }
    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        long dif=fechaActual.getTime()-fechaNacimiento.getTime();
        dif/=1000;
        dif/=60;
        dif/=60;
        dif/=24;
        dif/=365;
        return (int)dif;
    }
}
