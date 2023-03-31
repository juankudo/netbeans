/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_4_m;

import java.util.Arrays;

/**
 *
 * @author HP-G42
 */
public class GuiaPoo_4_m {

    public static void main(String[] args) {
        Cocina cocina=new Cocina();
        
        cocina.agregarReceta();
        System.out.println("Ingrese una receta:");
        cocina.agregarReceta();
        System.out.println("Ingrese una receta:");
        cocina.agregarReceta();
         System.out.println("Ingrese una receta:");
        cocina.agregarReceta();
        System.out.println("Las recetas ingresadass son:");
        Receta[] arreglo = cocina.getLista();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ") " + arreglo[i].getNombre());
        }
        cocina.buscarRecetaNombre("pure de papas");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        cocina.buscarRecetaIngredientes();
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(Arrays.toString(cocina.buscarRecetasPorIngredientes(arreglo[0].getIngredientes())));
    }
}
