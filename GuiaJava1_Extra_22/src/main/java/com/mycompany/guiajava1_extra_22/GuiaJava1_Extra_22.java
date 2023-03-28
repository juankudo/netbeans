/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_22;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
 */
public class GuiaJava1_Extra_22 {

    public static void main(String[] args) {
        String[][] mat=new String[20][20];
        fillMatrizLetter(mat);
        enterWords(mat);
        printMatriz(mat);
    }
    public static void enterWords(String[][] mat) {
        Scanner read=new Scanner(System.in);
        String word;
        for (int i = 0; i < 5; i++) {
            do {                
                System.out.println("Enter the word number "+(i+1)+" for the word search:");
                word=read.next();
                word=word.toUpperCase();
            } while (word.length()<3 || word.length()>5);
            int[] posibilities=new int[21];
            for (int l = 0; l < posibilities.length; l++) {
                posibilities[l]=l;   
            }
            int m=randonize(0, 19);
            Boolean bool=true;
            do {            
                for (int k = 0; k < posibilities.length; k++) {
                if (m==posibilities[k]) {
                    posibilities[k]=20;
                    bool=false;
                }else
                    m=randonize(0, 19);
            }
            } while (bool);
            //int m=randonize(0, mat.length-1);
            int n=randonize(0, 20-word.length());
            for (int j = 0; j < word.length(); j++) {
                mat[m][n+j]=word.substring(j, j+1);
            }
        }
    }
    public static int randonize(int min, int max) {
        return (int)(Math.floor((Math.random()*(max-min+1))+min));
    }
    public static String randomLetter() {
        String abc="abcdefghijklmnopqrstuvwxyz";
        abc=abc.toUpperCase();
        int numLetra=randonize(1, abc.length());
       return abc.substring((numLetra-1), numLetra);
    }
    public static void fillMatrizLetter(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
               mat[i][j]=randomLetter();
            }   
        }
    }
     public static void printMatriz(String[][] mat) {
        String aux;
        for (String[] fila: mat) {
            aux="";
            for (String elemento: fila) {
                aux+=" "+elemento;
            }
            System.out.println(aux);
        }
    }
}
