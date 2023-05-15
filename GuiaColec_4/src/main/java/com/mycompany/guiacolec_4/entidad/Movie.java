/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_4.entidad;

/**
 *
 * @author HP-G42
 */
public class Movie {
    private String title;
    private String director;
    private double duration;

    public Movie() {
    }

    public Movie(String title, String director, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie title: " + title + ", director: " + director + ", duration: " + duration;
    }
    
    
}
