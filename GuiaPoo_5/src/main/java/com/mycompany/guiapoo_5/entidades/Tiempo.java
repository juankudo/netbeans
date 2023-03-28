/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_5.entidades;

/**
 *
 * @author HP-G42
 */
public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    public void imprimirHoraCompleta() {
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos = segundos % 60;
        }
        if (minutos >= 60) {
            hora += minutos / 60;
            minutos = minutos % 60;
        }
        System.out.println("La hora es: " + hora + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }

    @Override
    public String toString() {
        return "Tiempo{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }
    
}
