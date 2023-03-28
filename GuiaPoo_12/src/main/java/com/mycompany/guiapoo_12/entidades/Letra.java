/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_12.entidades;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class Letra {

    private long DNI;
    private char letra;
    private char[] vector = new char[23];
    private Scanner read = new Scanner(System.in);

    public Letra() {
        DNI =0;
        letra =' ';
    }
//Constructor que reciba el DNI y establezca la letra que le corresponde.

    public Letra(long DNI) {
        this.DNI = DNI;

    }
//Métodos getters y setters para el número de DNI (que ajuste también
//automáticamente la letra).

    public void setDNI(long DNI) {
        this.DNI = DNI;
        fillVector();
        letra = vector[(int) (DNI % 23)];
    }

    public long getDNI() {
        return DNI;
    }
//    • Método leer(): para pedir el número de DNI (ajustando automáticamente la letra)

    public void leer() {
        System.out.print("Enter your ID:");
        DNI = read.nextLong();
        fillVector();
        letra = vector[(int) (DNI % 23)];
        System.out.println("You NIF is: " + letra);
    }
//    Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en mayúscula;
//por ejemplo: 00395469-F).

    public void showNIF() {
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
