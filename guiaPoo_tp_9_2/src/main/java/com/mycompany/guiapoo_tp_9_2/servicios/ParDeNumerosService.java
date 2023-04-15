/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_tp_9_2.servicios;

import com.mycompany.guiapoo_tp_9_2.entidades.ParDeNumeros;

/**
 *
 * @author HP-G42
 */
public class ParDeNumerosService {
     public void mostrarValores(ParDeNumeros par){
         System.out.println("El primer número es: "+par.getNum1());
         System.out.println("El segundo número es: "+par.getNum2());
     }
    public int  devolverMayor(ParDeNumeros par) {
        if (par.getNum1()<par.getNum2()) {
            System.out.println("El mayor es el numero 2.");
            return 1;
            
        } else if( par.getNum1()>par.getNum2()){
            System.out.println("El mayor es el numero 1.");
            return 2;
        }else
            System.out.println("Son iguales.");
        return 0;
    }
    public double calcularPotencia(ParDeNumeros par) {
        switch (devolverMayor(par)) {
            case 1:
                return Math.pow(Math.round(par.getNum2()),Math.round(par.getNum1()));
            case 2:
                return Math.pow(Math.round(par.getNum1()),Math.round(par.getNum2()));
            default:
            return 0;
        }
    }
    public double calcularRaiz(ParDeNumeros par) {
        switch (devolverMayor(par)) {
            case 1:
                return Math.sqrt(Math.abs(par.getNum1()));
            case 2:
                return Math.sqrt(Math.abs(par.getNum2()));
            default:
                throw new AssertionError();
        }
    }
}
