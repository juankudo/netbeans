/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_extra_2.entities;

/**
 *
 * @author HP-G42
 */
public class FamousSinger {
    private String name;
    private String bestSellingAlbum;

    public FamousSinger() {
    }

    public FamousSinger(String name, String bestSellingAlbum) {
        this.name = name;
        this.bestSellingAlbum = bestSellingAlbum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBestSellingAlbum(String bestSellingAlbum) {
        this.bestSellingAlbum = bestSellingAlbum;
    }

    public String getName() {
        return name;
    }

    public String getBestSellingAlbum() {
        return bestSellingAlbum;
    }

    @Override
    public String toString() {
        return "Singer´s name:" + name + ", best selling album:" + bestSellingAlbum;
    }
    
}
