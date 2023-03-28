/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_6.entidaddes;

/**
 *
 * @author HP-G42
 */
public class Cancion {
    private String título;
    private String autor;

    public Cancion() {
    }

    public Cancion(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "t\u00edtulo=" + título + ", autor=" + autor + '}';
    }
    
}
