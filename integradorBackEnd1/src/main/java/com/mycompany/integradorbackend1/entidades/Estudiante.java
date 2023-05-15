/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradorbackend1.entidades;

/**
 *
 * @author HP-G42
 */
public class Estudiante {
    private String name;
    private double score;

    public Estudiante() {
    }

    public Estudiante(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return  "Student: " + name + " , score: " + score;
    }
    
}
