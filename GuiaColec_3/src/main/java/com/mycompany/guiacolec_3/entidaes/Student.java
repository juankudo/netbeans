/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_3.entidaes;


import java.util.ArrayList;

/**
 *
 * @author HP-G42
 */
public class Student {
    private String name;
    private ArrayList <Integer> grades;

    public Student() {
        this.grades = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    
    
}
