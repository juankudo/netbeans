/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiarel_3.entities.services;

import com.mycompany.guiarel_3.entities.Carta;
import com.mycompany.guiarel_3.entities.enumciados.Palos;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author HP-G42
 */
public class BarajaServicio {
    
    private List<Carta> monton = new ArrayList();
    
    public void CrearBaraja(List<Carta> baraja) {
        int[] numeracion = IntStream.rangeClosed(1, 12).filter(n -> (n != 8 && n != 9)).toArray();
        for (Palos Palo : Palos.values()) {
            for (int i = 0; i < numeracion.length; i++) {
                baraja.add(new Carta(numeracion[i], Palo));
            }
        }
    }
    
    public void barajar(List<Carta> baraja) {
        Collections.shuffle(baraja);
    }
    
    public Carta siguienteCarta(List<Carta> baraja) {
        Carta carta;
        if (!baraja.isEmpty()) {
            carta = baraja.get(0);
            baraja.remove(0);
            return carta;
        } else {
            System.out.println("No hay más cartas.");
            return null;
        }
    }
    
    public int cartasDisponibles(List<Carta> baraja) {
        return baraja.size();//(40 - posicion);
    }
    
    public void darCartas(int num, List<Carta> baraja) {
        if (cartasDisponibles(baraja) >= num) {
            for (int i = 0; i < num; i++) {
                monton.add(siguienteCarta(baraja));
            }
            System.out.println(num+" cartas dadas.");
        }else{
        System.out.println("No hay suficientes cartas. Hay "+cartasDisponibles(baraja)+" cartas disponibles.");
        }
    }
    
    public void cartasMonton() {
        for (Carta carta : monton) {
            System.out.println(carta);
        }
    }
    
    public void mostrarBaraja(List<Carta> baraja) {
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }
    
    public void menu() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
        int op;
        List<Carta> baraja = new ArrayList();
        CrearBaraja(baraja);
        do {
            System.out.println("""
                               --------------------Menu---------------------
                               1)Dar cartas
                               2)Barajar
                               3)Mostrar baraja
                               4)Mostrar monton
                               5)Salir""");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("¿Cuantas cartas quiere dar?");
                    darCartas(sc.nextInt(), baraja);
                }
                case 2 -> barajar(baraja);
                case 3 -> mostrarBaraja(baraja);
                case 4 -> cartasMonton();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción incorrecta, por favor intente de nuevo :-)");
            }
        } while (op != 5);
    }
}
