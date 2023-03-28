/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sopadeletras;

/**
 *
 * @author HP-G42
 */
import java.util.Random;

public class MatrizContenida {

    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = { {5, 6, 7},
                            {6, 7, 8},
                            {7, 8, 9} };
        boolean encontrada = false;
        int filaInicio = -1;
        int columnaInicio = -1;
        Random rand = new Random();

        // Inicializar matriz M con números aleatorios entre 0 y 9
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[0].length; j++) {
                matrizM[i][j] = rand.nextInt(10);
            }
        }

        while (!encontrada) {
            for (int i = 0; i <= matrizM.length - matrizP.length; i++) {
                for (int j = 0; j <= matrizM[0].length - matrizP[0].length; j++) {
                    if (matrizM[i][j] == matrizP[0][0]) {
                        boolean coinciden = true;
                        for (int k = 0; k < matrizP.length; k++) {
                            for (int l = 0; l < matrizP[0].length; l++) {
                                if (matrizM[i + k][j + l] != matrizP[k][l]) {
                                    coinciden = false;
                                    break;
                                }
                            }
                            if (!coinciden) {
                                break;
                            }
                        }
                        if (coinciden) {
                            encontrada = true;
                            filaInicio = i;
                            columnaInicio = j;
                            break;
                        }
                    }
                }
                if (encontrada) {
                    break;
                }
            }
            if (!encontrada) {
                // Si no se encuentra, reiniciar matriz M con nuevos números aleatorios
                for (int i = 0; i < matrizM.length; i++) {
                    for (int j = 0; j < matrizM[0].length; j++) {
                        matrizM[i][j] = rand.nextInt(10);
                    }
                }
            }
        }

        System.out.println("La matriz P está contenida en la matriz M.");
        System.out.println("Comienza en la fila " + filaInicio + " y la columna " + columnaInicio + ".");
    }
}
