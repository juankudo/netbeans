/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiapoo_1;

import com.mycompany.guiapoo_1.Entidades.Libro;

/**
 *
 * @author HP-G42
 */
public class GuiaPOO_1 {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setAutor("Cortazar");
        libro1.setTítulo("Rayuela");
        libro1.setNumOfPages(728);
        libro1.setISBN("9788489666153");
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        libro1.printLibro();
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        System.out.println(libro1);
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        Libro libro2=new Libro();
        libro2.fillLibro();
        libro2.printLibro();
    }
}
