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
 * Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar nuevas 
 * recetas a la lista, para buscar una receta 
 *por nombre y para obtener la lista de recetas que se pueden 
 * preparar con los ingredientes disponibles en la cocina.
 */
public class Cocina {
    private int n;
    private Receta[] lista=new Receta[n];

    public Cocina() {
    }

    public Receta[] getLista() {
        return lista;
    }

    public void setLista(Receta[] lista) {
        this.lista = lista;
    }
    public  void agregarReceta() {
        Receta rec=new Receta();
        rec.crearReceta();
        Receta[] nuevaLista=new Receta[lista.length+1];
        for (int i = 0; i <lista.length; i++) {
            nuevaLista[i]=lista[i];
        }
        nuevaLista[lista.length]=rec;
        lista=nuevaLista;
    }
    public void buscarRecetaNombre(String name) {
        int cont=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNombre().equalsIgnoreCase(name)) {
                System.out.println(lista[i].toString()); 
            } else
               cont+=1; 
        }
        if (cont==lista.length) {
            System.out.println("No se encontro la receta.");
        }
    }
    public void buscarRecetaIngredientes() {
        System.out.println("""
                           Ingrese los ingredientes que tiene en su cocina:
                           (al terminar ingrese fin)""");
         Scanner read = new Scanner(System.in);
        String aux;
        String acumulador = "";
        int cont = 0;
        do {
            aux = read.nextLine();
            if (!aux.equalsIgnoreCase("fin")) {
                cont += 1;
                acumulador += aux+"/"  ;
            }
        } while (!aux.equalsIgnoreCase("fin"));
        String[] ingredientes = new String[cont];
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
        
        cont=0;
        String[] recetasPosibles=new String[lista.length];
        for (int j = 0; j < lista.length; j++) {
            boolean coinciden=true;
                for (int i = 0; i < ingredientes.length; i++) {
                    if (!Arrays.asList(lista[j].getIngredientes()).contains(ingredientes[i])) {
                        coinciden=false;
                    }
            }
                 if (coinciden) {
                        recetasPosibles[cont]=lista[j].getNombre();
                        cont+=1;
                    }
        }
        System.out.println("Las recetas posibles son:");
        System.out.println( Arrays.toString(Arrays.copyOf(recetasPosibles, cont)));
    }
     public String[] buscarRecetasPorIngredientes(String[] ingredientes) {
        String[] nombresRecetas = new String[lista.length];
        int contadorRecetas = 0;

        for (int i = 0; i <lista.length; i++) {
            String[] ingredientesReceta = lista[i].getIngredientes();
            boolean recetaValida = true;

            for (int j = 0; j < ingredientes.length; j++) {
                if (!Arrays.asList(ingredientesReceta).contains(ingredientes[j])) {
                    recetaValida = false;
                    break;
                }
            }

            if (recetaValida) {
                nombresRecetas[contadorRecetas++] = lista[i].getNombre();
            }
        }

        return Arrays.copyOf(nombresRecetas, contadorRecetas);
    }
}

