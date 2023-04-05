/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_13.entidades;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP-G42 Un método para mostrar la longitud de la palabra que se debe
 * encontrar. • Un método para buscar si una letra ingresada por el usuario es
 * parte de la palabra o no. • Un método para informar error o acierto. • Un
 * método para mostrar cuantas oportunidades le queda al jugador. • Un método
 * que al pedir ingresar una letra muestre que letras han sido encontradas y en
 * qué posición. Además, se debe mostrar también cuántas oportunidades quedan. •
 * Un método para buscar si se encontró la palabra completa.
 */
public class Ahorcado {

    private String word;
    private int oportunities = 10;
    private int encontradas = 0;
    Scanner read = new Scanner(System.in);
    String[] aux;

    public Ahorcado() {

    }

    public Ahorcado(String word) {
        this.word = word;

    }

    public String getWord() {
        return word;
    }

    public int getOportunities() {
        return oportunities;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setOportunities(int oportunities) {
        this.oportunities = oportunities;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

//   Un método para mostrar la longitud de la palabra que se debe encontrar.
    public int largo() {
        return word.length();
    }
//    Un método para buscar si una letra ingresada por el usuario es parte de la palabra o no.

    public boolean buscar(String letra) {
        boolean res = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equalsIgnoreCase(letra)) {
                res = true;
            }
        }
        return res;
    }
//    Un método para informar error o acierto.

    public void errorAcierto(String letra) {
        if (buscar(letra)) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }
    }
//    Un método para mostrar cuantas oportunidades le queda al jugador.

    public int oportunidadesRestantes(String letra) {
        if (oportunities > 0) {
            if (!buscar(letra)) {
                oportunities -= 1;
            }
        }
        return oportunities;
    }
//    Un método que al pedir ingresar una letra muestre que letras han sido encontradas y
//en qué posición. Además, se debe mostrar también cuántas oportunidades quedan.

    public void Encontradas() {
        System.out.println("Ingrese una letra:");
        String letra = read.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equalsIgnoreCase(letra) && !Arrays.asList(aux).contains(letra)) {
                encontradas++;
            }
        }
        System.out.print("Mensaje:");
        errorAcierto(letra);
        System.out.println("Número de letras (encontradas,faltantes): " + "(" + encontradas + "," + (word.length() - encontradas) + ")");
        System.out.println("Número de oportunidades restantes: " + oportunidadesRestantes(letra));

        for (int i = 0; i < word.length(); i++) {
            if (letra.equalsIgnoreCase(word.substring(i, i + 1))) {
                aux[i] = letra;
            }
        }
        System.out.println("Estado actual: " + Arrays.toString(aux));

    }
//    Un método para buscar si se encontró la palabra completa.

    public boolean palabraCompleta() {
        if (encontradas == word.length()) {
            return true;
        } else {
            return false;
        }
    }

    public void ingresaPalabra() {
//        System.out.println("Ingrese al menos 3 palabras distintas");
//        String aux = "", a = "";
//        String[] palabras = new String[10];
//        int cont = 0;
//        boolean bool = true;
//        do {
//            aux = read.next();
//            if (cont != 0) {
//                if (aux.equalsIgnoreCase(a)) {
//                    bool = false;
//                    System.out.println("Palabras iguales.");
//                }
//            }
//            a = aux;
//            if (bool) {
//                palabras[cont] = aux;
//                cont += 1;
//            }
//        } while (bool && cont < 3);
String[] palabras={ "alegria", "abstinencia", "indulgente", "oftalmologia", 
    "redundante", "alucinante", "iridiscencia", "cardiopatia", "inefable", "chicharron"};
        word = palabras[(int) (Math.random() * 10)];
        fillAux();
    }

    public void fillAux() {
        aux = new String[word.length()];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = " _ ";

        }
    }
    
}
