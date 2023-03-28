/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_6;

import com.mycompany.guiapoo_6.entidaddes.Cancion;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Desarrollar una clase Cancion con los siguientes atributos:
 * título y autor. Se deberá definir además dos constructores: uno vacío que
 * inicializa el título y el autor a cadenas vacías y otro que reciba como
 * parámetros el título y el autor de la canción. Se deberán además definir los
 * métodos getters y setters correspondientes.
 */
public class GuiaPoo_6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre y el autor de la canción:");
        Cancion canción = new Cancion();
        canción.setTítulo(read.nextLine());
        canción.setAutor(read.nextLine());
        System.out.println("El autor de la cación " + canción.getTítulo() + " es " + canción.getAutor());
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println("Ingrese el nombre y el autor de una nueva canción:");
        Cancion cancion1 = new Cancion(read.nextLine(), read.nextLine());
        System.out.println(cancion1.toString());
    }
}
