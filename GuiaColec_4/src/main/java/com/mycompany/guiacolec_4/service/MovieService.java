/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_4.service;

import com.mycompany.guiacolec_4.entidad.Movie;
import java.util.*;
import com.mycompany.guiacolec_4.utilidades.Comparators;

/**
 *
 * @author HP-G42
 */
public class MovieService {

    public ArrayList<Movie> createMoviesList() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Movie> movieList = new ArrayList();
        char op;
        int i=0;
        do {
            System.out.println("Enter the movie´s title:");
            String[] peliculas = {"E.T. the Extra-Terrestrial", "The Dark Knight", "No más drogas", "Pulp Fiction", "Gravity","Altas esperanzas"};
             String title = peliculas[i];
            System.out.println(title);
//            String title = sc.next();
            System.out.println("Enter the movie´s director:");
            String[] directores = {"Steven Spielberg", "Christopher Nolan", "Pablo Emilio Escobar Gabidlia","Quentin Tarantino", "Alfonso Cuarón","Elenano"};
            String director =directores[i];
            System.out.println(director);
//            String director = sc.next();
            System.out.println("Enter the movie´s duration (in hours):");
            double[] duracion = {1.55, 2.32,0.8,2.34,1.31,0.7};
            double duration =duracion[i];
            System.out.println(duration);
//            double duration = sc.nextDouble();
            movieList.add(new Movie(title, director, duration));
            do {
                System.out.println("Do you want to continue adding movies to the list? (S/N)");
                op = sc.next().toLowerCase().charAt(0);
                System.out.println((op != 's' && op != 'n') ? "Icorrect option, please try again ;-)" : "");
            } while (op != 's' && op != 'n');
            i++;
        } while (op == 's');
        return movieList;
    }

    public void displayMovies(ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
    public void oneHourMovies(ArrayList<Movie> movieList){
        System.out.println("Movies whit a duration longer than 1 hour:");
        for (Movie movie : movieList) {
            if (movie.getDuration()>1) {
                System.out.println(movie);
            }
        }
    }
    public void sortMoviesLongestToShrotest(ArrayList<Movie> movieList) {

        Collections.sort(movieList, Comparators.durationLongestToShortest);
        System.out.println("Ordered by duration  (longest to shortest):");
        displayMovies(movieList);
    }
    public void sortMoviesShrotestToLongest(ArrayList<Movie> movieList) {
//        Comparator<Movie> compareDuration=(Movie o1, Movie o2) -> Double.compare(o1.getDuration(), o2.getDuration());
        Collections.sort(movieList, Comparators.durationShortestToLongest);
        System.out.println("Ordered by duration  (shortest to longest):");
        displayMovies(movieList);
    }
    public void sortMoviesTitle(ArrayList<Movie> movieList) {
//        Comparator<Movie> compareDuration=(Movie o1, Movie o2) -> o1.getTitle().compareTo(o2.getTitle());
        Collections.sort(movieList, Comparators.title);
        System.out.println("Ordered by movie´s title:");
        displayMovies(movieList);       
    }
    public void sortMoviesDirector(ArrayList<Movie> movieList) {
//        Comparator<Movie> compareDuration=(Movie o1, Movie o2) -> o1.getDirector().compareTo(o2.getDirector());
        Collections.sort(movieList, Comparators.director);
        System.out.println("Ordered by director´s name:");
        displayMovies(movieList);       
    }
    public void enterAndSortMovies() {
        ArrayList<Movie>movieList=createMoviesList();
        System.out.println("All the movies");
        displayMovies(movieList);
        System.out.println("------------------------");
        oneHourMovies(movieList);
        System.out.println("------------------------");
        sortMoviesLongestToShrotest(movieList);
        System.out.println("------------------------");
        sortMoviesShrotestToLongest(movieList);
        System.out.println("------------------------");
        sortMoviesTitle(movieList);
        System.out.println("------------------------");
        sortMoviesDirector(movieList);
    }
}
