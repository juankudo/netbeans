/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiacolec_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList. 
 * Después de mostrar los perros, al usuario se le
 * pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro
 * en la lista. Si el perro está en la lista, se eliminará el perro que ingresó
 * el usuario y se mostrará la lista ordenada. Si el perro no se encuentra en la
 * lista, se le informará al usuario y se mostrará la lista ordenada.
 *
 * @author HP-G42
 */
public class GuiaColec_1 {

    public static void main(String[] args) {
        List<String> razaPerros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        char option;
        do {
            System.out.println("Ingrese una raza de perro:");
            razaPerros.add(sc.next());
            System.out.println("¿Desea agregar mas razas de perro?(S/N)");
            option = sc.next().toUpperCase().charAt(0);
        } while (option == 'S');
        for (String raza : razaPerros) {
            System.out.print(raza + " ");
        }
        System.out.println("");
        System.out.println("¿Que raza desea eliminar?");
        String razaEliminar=sc.next();
        Iterator it= razaPerros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) 
                it.remove(); 
        }
        for (String razaPerro : razaPerros) {
            System.out.print(razaPerro+" ");
        }
        
    }
}
