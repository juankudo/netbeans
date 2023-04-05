/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiapoo_4_m;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaPoo_4_m {

    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        Scanner read = new Scanner(System.in);
        int op = 0; 
        char opSalida = ' ';
        do {
            System.out.println("""
                           Menu
                           1)Ingresar recetas
                           2)Buscar recetas por el nombre
                           3)Buscar recetas por ingredientes
                           4)Salir
                           """);
            op = read.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Ingrese las recetas:");
                    char opción = ' ';
                    String aux;
                    int cont=0;
                    do {
                        cocina.agregarReceta();
                        System.out.println("Receta agregada.");
                        do {
                            if (cont!=0) {
                                System.out.println("¿Desea agregar más recetas? (S/N)");
                            }
                            aux = read.nextLine().toUpperCase();
                            cont+=1;
                        } while (aux.length()!=1);
                        opción = aux.charAt(0);
                        do {
                            if (opción != 'N' && opción != 'S') {
                                System.out.println("Opción incorrecta. Por favor vuelva a intentar.");
                                opción = read.nextLine().toUpperCase().charAt(0);
                            }
                        } while (opción != 'N' && opción != 'S');
                    } while (opción != 'N');
                    System.out.println("Las recetas ingresadas son:");
                    Receta[] arreglo = cocina.getLista();
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println((i + 1) + ") " + arreglo[i].getNombre());
                    }
                    break;
                case 2:
                    cocina.buscarRecetaNombre();
                    break;
                case 3:
                    cocina.buscarRecetaIngredientes();
                    break;
                case 4:
                    System.out.println("¿Desea salir? (S/N)");
                    opSalida = read.next().charAt(0);
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opSalida != 's' && opSalida != 'S');

    }
}
