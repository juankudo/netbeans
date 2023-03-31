/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_4_m;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class Receta {
    private String nombre;
    private int num;
    private String[] ingredientes=new String[num];

    public Receta() {
    } 

    public String[] getIngredientes() {
        return ingredientes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void crearReceta() {
        Scanner read = new Scanner(System.in);
        String aux;
        String acumulador = "";
        int cont = 0;
        System.out.println("Ingrese el nombre de la receta:");
        nombre = read.nextLine();
        System.out.println("Ingrese los ingredientes, para finalizar ingrese la palabra 'fin' (sin comillas):");
        do {
            aux = read.nextLine();
            if (!aux.equalsIgnoreCase("fin")) {
                cont += 1;
                acumulador += aux+"/"  ;
            }
        } while (!aux.equalsIgnoreCase("fin"));
        ingredientes = new String[cont];
        cont = 0;
        aux="";
        for (int i = 0; i < acumulador.length(); i++) {
            if (!acumulador.substring(i, i + 1).equals("/")) {
                aux += acumulador.substring(i, i + 1);
            } else {
                ingredientes[cont] = aux;
                cont += 1;
                aux="";
            }
            
        }
    }
        
    

    @Override
    public String toString() {
        return "Receta{" + "nombre=" + nombre + ", ingredientes=" + Arrays.toString(ingredientes) + '}';
    }
    
}
