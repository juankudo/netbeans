/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_3.entidaes.servicio;

import com.mycompany.guiacolec_3.entidaes.Student;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class StudentService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * The metod create a list of objects whit class Student, ask for the name
     * ande scores for each one.at least ask if you want to continue adding
     * student to the list.
     *
     * @return a Array list of Students
     */
    public ArrayList<Student> createStudents() {
        ArrayList<Student> listStudents = new ArrayList();
        char option;
        int cont = 1;
        do {
            Student aux = new Student();
            System.out.println("Enter the name of the Studen:");
//            aux.setName(sc.next());
            aux.setName("Student " + cont);
            System.out.println(aux.getName());
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the grade number " + (i + 1) + ":");
//                aux.getGrades().add(sc.nextInt());
                aux.getGrades().add((int) Math.floor(Math.random() * 10) + 1);
                System.out.println(aux.getGrades().get(i));
            }
            listStudents.add(aux);
            do {
                System.out.println("Do you want to add one more Student?(S/N)");
                option = sc.next().toLowerCase().charAt(0);
                System.out.println((option != 's' && option != 'n') ? "Incorrect opcion, please try again" : "");
            } while (option != 's' && option != 'n');
            cont++;
        } while (option == 's');
        return listStudents;
    }

    /**
     * This metod use all the previos created metods, for charge the list of
     * students, calculates and displays the average of a solicitate Student´s
     * name.
     */
    public void finalGrade() {
        ArrayList<Student> listStudent = createStudents();
        boolean flag = true;
        double average = 0;
        System.out.println("Enter the name of the Student for calculate the average: ");
        String name = sc.next();
        for (Student student : listStudent) {
            if (student.getName().equalsIgnoreCase(name)) {
                average = calculateAverage(student);
                flag = false;
            }
        }
        System.out.println((flag) ? "The name dosen´t exist in the list " : "The average of " + name + " is " + average);
    }

    /**
     * calculate the average of grades for a given Student
     *
     * @param student a object that provides the grades for the average
     * @return the average of the gades for a student.
     */
    public double calculateAverage(Student student) {
        double sum = 0;
        DecimalFormat format = new DecimalFormat("#.#");
        for (Integer grade : student.getGrades()) {
            sum += grade;
        }
        return Double.parseDouble(format.format((double) sum / student.getGrades().size()).replace(",", "."));
    }
}
