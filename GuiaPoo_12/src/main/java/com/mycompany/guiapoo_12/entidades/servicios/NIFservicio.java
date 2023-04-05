/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_12.entidades.servicios;

import com.mycompany.guiapoo_12.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class NIFservicio {

    private long DNI;
    private char letra;
    private char[] vector = new char[23];
    private Scanner read = new Scanner(System.in);

    /**
     *  para pedir el número de DNI 
     * 
     */
    public NIF crearNIF() {
        NIF nif = new NIF();
        System.out.print("Enter your ID:");
        DNI = read.nextLong();
        nif.setDNI(DNI);
        fillVector();
        letra = vector[(int) (DNI % 23)];
        nif.setLetra(letra);
        System.out.println("Your NIF is: " + letra);
        return nif;
    }

    /**
     * Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra
     * en mayúscula; por ejemplo: 00395469-F).
     */
    public void mostrar() {
        System.out.println("Your NIF is:  " + DNI + "-" + letra);
    }

    public void fillVector() {
        vector[0] = 'T';
        vector[1] = 'R';
        vector[2] = 'W';
        vector[3] = 'A';
        vector[4] = 'G';
        vector[5] = 'M';
        vector[6] = 'Y';
        vector[7] = 'F';
        vector[8] = 'P';
        vector[9] = 'D';
        vector[10] = 'X';
        vector[11] = 'B';
        vector[12] = 'N';
        vector[13] = 'J';
        vector[14] = 'Z';
        vector[15] = 'S';
        vector[16] = 'Q';
        vector[17] = 'V';
        vector[18] = 'H';
        vector[19] = 'L';
        vector[20] = 'C';
        vector[21] = 'K';
        vector[22] = 'E';
    }
}
