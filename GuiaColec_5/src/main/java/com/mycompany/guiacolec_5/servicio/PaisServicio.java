/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_5.servicio;

import java.util.*;

public class PaisServicio {
    
    public HashSet<String> crearPaises() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        HashSet<String> paises = new HashSet<>();
        char op;
        int i=0;
        do {
            System.out.println("Ingresa un país:");
            String[] countries = {"México", "Estados Unidos", "Canadá", "Brasil", "México","Argentina", "España", "Francia","Canadá" ,"Reino Unido", "Japón", "China"};
            paises.add(countries[i]);
            System.out.println(countries[i]);
//            paises.add(sc.next());
            do {
                System.out.println("Quiere ingresar más paises?");
                op = sc.next().toLowerCase().charAt(0);
                System.out.println((op != 's' && op != 'n') ? "Opción incorrecta, por favor vuelva a intentar." : "");
            } while (op != 's' && op != 'n');
            i++;
        } while (op == 's');
        return paises;
    }

    public void mostrarConjunto(Set<String> paises) {
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    public void eliminaPais(Set<String> paises) {
        boolean flag=true;
        Iterator<String> it=paises.iterator();
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el país a eliminar de la lista:");
        String paisEliminar=sc.next();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(paisEliminar)) {
                it.remove();
                flag=false;
            }     
        }
        System.out.println(flag?"No se encontro el pais en la lista":"");
    }

}
