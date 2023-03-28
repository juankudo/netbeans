/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_13.entidades;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Un método para mostrar la longitud de la palabra que se debe encontrar.
• Un método para buscar si una letra ingresada por el usuario es parte de la palabra o
no.
• Un método para informar error o acierto.
• Un método para mostrar cuantas oportunidades le queda al jugador.
• Un método que al pedir ingresar una letra muestre que letras han sido encontradas y
en qué posición. Además, se debe mostrar también cuántas oportunidades quedan.
• Un método para buscar si se encontró la palabra completa.
 */
public class Ahorcado {
    private String word;
    private int oportunities;
    Scanner read=new Scanner(System.in);

    public Ahorcado(String word, int oportunities) {
        this.word = word;
        this.oportunities = oportunities;
    }
//   Un método para mostrar la longitud de la palabra que se debe encontrar.
    public int largo() {
        return word.length();
    }
//    Un método para buscar si una letra ingresada por el usuario es parte de la palabra o no.
    public boolean buscar(String letra) {
        boolean res=false;
        for (int i = 0; i <word.length(); i++) {
            if (word.substring(i, i+1).equalsIgnoreCase(letra)) {
                res=true;
            }
        }
        return res;
    }
//    Un método para informar error o acierto.
    public void errorAcierto(String letra) {
        if (buscar(letra)) {
            System.out.println("La letra pertenece a la palabra");
        }else{
            System.out.println("La letra no pertenece a la palabra");
        }
    }
//    Un método para mostrar cuantas oportunidades le queda al jugador.
    public int oportunidadesRestantes(String letra) {
        do {
            if (!buscar(letra)) {
            oportunities-=1;
        }
        } while (oportunities>0);
       return oportunities;
    }
//    Un método que al pedir ingresar una letra muestre que letras han sido encontradas y
//en qué posición. Además, se debe mostrar también cuántas oportunidades quedan.
    public void Encontradas() {
        System.out.println("Ingrese una letra:");
        String letra=read.next();
        int encontradas=0;
        for (int i = 0; i <word.length(); i++) {
            if (word.substring(i, i+1).equalsIgnoreCase(letra)) {
                encontradas++;
            }
        }
        System.out.println("Número de letras (encontradas,faltantes): "+"("+encontradas+","+(word.length()-encontradas)+")");
        System.out.println("Número de oprtunidades restantes: "+oportunidadesRestantes(letra));
        if (buscar(letra)) {
            String aux="";
            for (int i = 0; i < word.length(); i++) {
                if (letra.equalsIgnoreCase(word.substring(i, i+1))) {
                    aux+=letra;
                }else{
                    aux+=" _ ";
                }
            }
            System.out.println(aux);
        }
    }
//    Un método para buscar si se encontró la palabra completa.
    public static void main(String[] args) {
        
    }
}
