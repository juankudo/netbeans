/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiapoo_13;

import com.mycompany.guiapoo_13.entidades.Ahorcado;

/**
 *
 * @author HP-G42 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la
 * cual deberá contener un vector con la palabra a buscar y la cantidad jugadas
 * máximas que puede realizar el usuario. Definir los siguientes métodos con los
 * parámetros que sean necesarios: • En el método main() se deberá pedir al
 * usuario una letra hasta que el usuario haya gastado todas sus oportunidades o
 * bien hasta que encuentre la palabra. Un ejemplo de salida puede ser así:
 * Longitud de la palabra: 6 Ingrese una letra: a
 */
public class GuiaPoo_13 {

    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Juego del Ahorcado:");
        ahorcado.ingresaPalabra();
        do {
            ahorcado.Encontradas();
            System.out.println("");
            System.out.println("---------------------------------------------------------------");
            System.out.println("");
            if (ahorcado.palabraCompleta()) {
                System.out.println("Haz ganado!");
            }
        } while (ahorcado.getOportunities() > 0 && !ahorcado.palabraCompleta());
        if (ahorcado.getOportunities() == 0) {
            System.out.println("Haz perdido!.");
        }
    }
}
