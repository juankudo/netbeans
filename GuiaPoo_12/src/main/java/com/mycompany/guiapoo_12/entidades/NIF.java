/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_12.entidades;


/**
 *
 * @author HP-G42
 */
public class NIF {

    private long DNI;
    private char letra;
    
  

    public NIF() {
        DNI =0;
        letra=' ';
    }
/**
 * 
 * @param DNI 
 * Constructor que reciba el DNI 
 */
    public NIF(long DNI) {
        this.DNI = DNI;

    }
/**
 * 
 * @param DNI 
 * setter para el número de DNI 
 */
    public void setDNI(long DNI) {
        this.DNI = DNI;
        letra=' ';
    }
/**
 * 
 * @return 
 * getter para el número de DNI 
 */
    public long getDNI() {
        return DNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }
    
}
    

