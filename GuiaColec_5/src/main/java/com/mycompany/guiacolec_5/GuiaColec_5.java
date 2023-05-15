/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiacolec_5;

import com.mycompany.guiacolec_5.servicio.PaisServicio;
import java.util.*;

/**
 *
 * @author HP-G42
 */
public class GuiaColec_5 {

    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        HashSet<String> coleccionPaises = ps.crearPaises();
        ps.mostrarConjunto(coleccionPaises);
        System.out.println("------------------------------------");
        TreeSet<String> ordenPais = new TreeSet<>(coleccionPaises);
        ps.mostrarConjunto(ordenPais);
        System.out.println("------------------------------------");
        ps.eliminaPais(ordenPais);
        System.out.println("------------------------------------");
        ps.mostrarConjunto(ordenPais);
    }
}
