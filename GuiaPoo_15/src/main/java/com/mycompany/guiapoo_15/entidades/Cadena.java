/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_15.entidades;

import java.util.Scanner;

/**
 *
 * @author HP-G42 Realizar una clase llamada Cadena que tenga como atributos una
 * frase (de tipo de String) y su longitud. La clase deber tener un constructor
 * mediante el cual se inicialice la frase, con una o más palabras ingresadas
 * por el usuario (separadas entre sí por un espacio en blanco) y se inicialice
 * de manera automática su longitud. Deberá además implementar los siguientes
 * métodos: • Método mostrarVocales(), deberá contabilizar la cantidad de
 * vocales que tiene la frase ingresada. • Método invertirFrase(), deberá
 * invertir la frase ingresada y mostrar la frase invertida por pantalla. Por
 * ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". • Método
 * vecesRepetido(), deberá recibir por parámetro un carácter ingresado por el
 * usuario y contabilizar cuántas veces se repite el carácter en la frase, por
 * ejemplo: Entrada: frase = "casa blanca", car = 'a', Salida: El carácter 'a'
 * se repite 4 veces. • Método compararLongitud(), deberá comparar la longitud
 * de la frase que compone la clase con otra nueva frase ingresada por el
 * usuario. • Método unirFrases(), deberá unir la frase contenida en la clase
 * Cadena con una nueva frase ingresada por el usuario y mostrar la frase
 * resultante. • Método reemplazar(), deberá reemplazar todas las letras “a” que
 * se encuentren en la frase, por algún otro carácter seleccionado por el
 * usuario.
 */
public class Cadena {

    private String word;
    private int length;
    Scanner read = new Scanner(System.in);

    /**
     *
     * @param word La clase deber tener un constructor mediante el cual se
     * inicialice la frase, con una o más palabras ingresadas por el usuario
     * (separadas entre sí por un espacio en blanco) y se inicialice de manera
     * automática su longitud.
     */
    public Cadena(String word) {
        this.word = word;
        length = this.word.length();
    }

    /**
     * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
     * tiene la frase ingresada.
     */
    public void mostrarVocales() {
        int cant = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.toUpperCase().charAt(i) == 'A') {
                cant++;
            } else if (word.toUpperCase().charAt(i) == 'E') {
                cant++;
            } else if (word.toUpperCase().charAt(i) == 'I') {
                cant++;
            } else if (word.toUpperCase().charAt(i) == 'O') {
                cant++;
            } else if (word.toUpperCase().charAt(i) == 'U') {
                cant++;
            }
        }
        System.out.println("La cantidad de vocales es = " + cant);
    }

    /**
     * Método invertirFrase(), deberá invertir la frase ingresada y mostrar la
     * frase invertida por pantalla. Por ejemplo: Entrada: "casa blanca",
     * Salida: "acnalb asac".
     */
    public void invertirFrase() {
        String aux = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            aux += word.charAt(i);
        }
        System.out.println("La frase invertida es = " + aux);
    }

    /**
     * Método vecesRepetido(), deberá recibir por parámetro un carácter
     * ingresado por el usuario y contabilizar cuántas veces se repite el
     * carácter en la frase, por ejemplo: Entrada: frase = "casa blanca", car =
     * 'a', Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido() {
        System.out.println("Ingrese el caracter a contar en la frase:");
        char letter=read.next().toUpperCase().charAt(0);
        int rep = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.toUpperCase().charAt(i) == letter) {
                rep++;
            }
        }
        System.out.println("El caracter " + letter + " se repite " + rep + " veces.");
    }

    /**
     * Método compararLongitud(), deberá comparar la longitud de la frase que
     * compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud() {
        System.out.println("Ingrese la frase a comparar:");
        String comp = read.nextLine();
        if (word.length() < comp.length()) {
            System.out.println("La frase ingresada es de mayor tamaño");
        } else if (word.length() > comp.length()) {
            System.out.println("La frase ingresada es de menor tamaño");
        } else {
            System.out.println("Son del mismo tamaño");
        }
    }
    /**
     * Método unirFrases(), deberá unir la frase contenida en la clase
 Cadena con una nueva frase ingresada por el usuario y mostrar la frase
 resultante
     */
    public void unirFrases() {
         System.out.println("Ingrese la frase a unir:");
        String unir = read.nextLine();
        word+=" "+unir;
        System.out.println("La frase resultante es = " + word);
    }
    /**
     * 
     * Método reemplazar(), deberá reemplazar todas las letras “a” que
 * se encuentren en la frase, por algún otro carácter seleccionado por el
 * usuario.
     */
    public  void reemplazar() {
        System.out.println("Ingrese el caracter que reemplazara las 'a' ");
        char letra=read.next().charAt(0);
        String aux="";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a' || word.charAt(i)=='A') {
                aux+=letra;
            }else{
                aux+=word.charAt(i);
            }  
        }
        System.out.println("La nueva frase es = " + aux);
    }
    
}
