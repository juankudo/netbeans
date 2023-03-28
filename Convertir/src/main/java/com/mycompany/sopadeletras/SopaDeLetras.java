/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sopadeletras;

/**
 *
 * @author HP-G42
 */
import java.util.*;

public class SopaDeLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese 5 palabras
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = scanner.nextLine().toUpperCase();
            
            // Verificar que la palabra tenga entre 3 y 5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Intente nuevamente: ");
                palabras[i] = scanner.nextLine().toUpperCase();
            }
        }
        
        // Crear la matriz de la sopa de letras
        char[][] sopaDeLetras = new char[20][20];
        
        // Seleccionar una fila aleatoria para colocar las palabras
        int filaAleatoria = new Random().nextInt(20);
        
        // Colocar las palabras en la fila seleccionada
        int columna = new Random().nextInt(20 - palabras.length + 1); // Posición inicial aleatoria
        for (int i = 0; i < palabras.length; i++) {
            String palabraActual = palabras[i];
            for (int j = 0; j < palabraActual.length(); j++) {
                sopaDeLetras[filaAleatoria][columna + j] = palabraActual.charAt(j);
            }
            columna += palabraActual.length() + 1; // Dejar un espacio entre palabras
        }
        af
        // Rellenar los espacios vacíos con letras aleatorias
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                if (sopaDeLetras[i][j] == '\u0000') { // Si el espacio está vacío
                    char letraAleatoria = (char) ('A' + new Random().nextInt(26));
                    sopaDeLetras[i][j] = letraAleatoria;
                }
            }
        }
        
        // Imprimir la sopa de letras
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}
