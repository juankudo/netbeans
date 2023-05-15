/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_4.utilidades;

import com.mycompany.guiacolec_4.entidad.Movie;
import java.util.Comparator;

/**
 *
 * @author HP-G42
 */
public class Comparators {

    /**
     * compare the titles of the movies
     */
    public static Comparator<Movie> title = (Movie o1, Movie o2) -> o1.getTitle().compareToIgnoreCase(o2.getTitle());

    /**
     * compare the director´s names
     */
    public static Comparator<Movie> director = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().compareToIgnoreCase(o2.getDirector());
        }
    };

    /**
     * compare the movie´s duration, and sort its longest to shorest.
     */
    public static Comparator<Movie> durationLongestToShortest = (Movie o1, Movie o2) -> Double.compare(o2.getDuration(), o1.getDuration());

    /**
     * compare the movie´s duration, and sort its shorest to longest .
     */
    public static Comparator<Movie> durationShortestToLongest = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return Double.compare(o1.getDuration(), o2.getDuration());
        }
    };

}
