/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_1.Entidades;

import java.util.Scanner;

/**
 *
 * @author HP-G42 Crear una clase llamada Libro que contenga los siguientes
 * atributos: ISBN, Título, Autor, Número de páginas, y un constructor que
 * inicialice esos atributos con los valores pasados como parámetros. Definir
 * una instancia para cargar un libro y luego informar mediante otro método el
 * número de ISBN, el título y el autor del libro.
 */
public class Libro {
private String ISBN;
private String título;
private String autor;
private int numOfPages;
private Scanner read=new Scanner(System.in);

    public Libro(String ISBN, String título, String autor, int numOfPages) {
        this.ISBN = ISBN;
        this.título = título;
        this.autor = autor;
        this.numOfPages = numOfPages;
    }

    public Libro() {
    }

    public void setISBN( String  ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public Scanner getRead() {
        return read;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    
    public void printLibro() {
        System.out.println("ISBN:"+ISBN+", título: "+título+", autor: "+autor);
    } 
    public void fillLibro() {
        System.out.print("Enter the ISBN number:");
        ISBN = read.nextLine();
        System.out.println("Enter the title of the book:");
        título = read.nextLine();
        System.out.println("Enter the autor:");
        autor=read.nextLine();
        System.out.println("Enter the number of pages:");
        numOfPages =read.nextInt();
    }
    public void tamaño() {
        if (numOfPages<500) {
            System.out.println("el libro ");
        }
 
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", t\u00edtulo=" + título + ", autor=" + autor + ", numOfPages=" + numOfPages + '}';
    }
    
}
