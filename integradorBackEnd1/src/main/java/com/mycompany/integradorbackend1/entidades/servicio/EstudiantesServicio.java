/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradorbackend1.entidades.servicio;

import com.mycompany.integradorbackend1.entidades.Estudiante;
import java.text.DecimalFormat;
import java.util.Arrays;
//import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class EstudiantesServicio {

    private double average;
//    Scanner sc=new Scanner(System.in);
    DecimalFormat formato = new DecimalFormat("#.#");
/**
* This metod creates a array of 8 Estudiante´s object, first ask the name of each student, then ask for the score in the final exam.  
 * @return a Estudiante[], with a length of 8.
 */
    public Estudiante[] createEstudiante() {
        Estudiante[] arrayEst = new Estudiante[8];
        for (int i = 0; i < arrayEst.length; i++) {
            System.out.println("Enter the name of student number " + (i + 1) + ":");
//            String name=sc.nextLine();
            String name = "Student " + (i + 1);
            System.out.println(name);
            System.out.println("Enter the final exam´s score for the student number" + (i + 1) + ":");
//            double score=sc.nextDouble();
            double score = Double.parseDouble(formato.format((Math.random() * 6) + 4).replace(",", "."));
            System.out.println(score);
            arrayEst[i] = new Estudiante(name, score);
        }
        return arrayEst;
    }
/**
 * The metod displays the average score of the final exam for the class.
 * @param arrayEst a array of 8 Estudiante´s objects.
 */
    public void displayAverage(Estudiante[] arrayEst) {
        double sum = 0;
        for (Estudiante est : arrayEst) {
            sum += est.getScore();
        }
        average = Double.parseDouble(formato.format(sum / 8).replace(",", "."));
        System.out.println("The average score in the class is: " + average);
    }
/**
 * 
 * @param arrayEst a array of 8 Estudiante´s objects.
 * @return a String[], filled whit names, each one belongs to a student, whit a score higher than the average.
 */
    public String[] highAverage(Estudiante[] arrayEst) {
        String[] aux = new String[arrayEst.length];
        int cont = 0;
        for (Estudiante est : arrayEst) {
            if (est.getScore() > average) {
                aux[cont] = est.getName();
                cont++;
            }
        }
        return Arrays.copyOf(aux, cont);
    }
/**
 * This metod displays the names and the scores, for the list of students whit a score higher than the average in the class.
 * @param highAverage a String[], filled whit names, each one belongs to a student, whit a score higher than the average.
 * @param arrayEst a array of 8 Estudiante´s objects.
 */
    public void displayHighAverage(String[] highAverage, Estudiante[] arrayEst) {
        System.out.println("List of students with a score higher than the average:");
        for (String name : highAverage) {
            for (Estudiante est : arrayEst) {
                if (est.getName().equalsIgnoreCase(name)) {
                    System.out.println(est);
                }
            }
        }
    }
    /**
     * Invoque all the previously  created metods, and request for the necesary data (names, scores),
     * calculates and displays the averege score, and finaly displays the list of the students whit 
     * a score higher than the average in the class.
     */
    public void calculateAverage() {
        Estudiante[] arrayEst;
        arrayEst=createEstudiante();
        displayAverage(arrayEst);
        displayHighAverage(highAverage(arrayEst),arrayEst);
    }

}
