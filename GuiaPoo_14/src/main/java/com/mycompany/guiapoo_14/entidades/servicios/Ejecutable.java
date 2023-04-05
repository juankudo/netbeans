/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_14.entidades.servicios;

import com.mycompany.guiapoo_14.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * crear una clase ejecutable que haga lo siguiente:
 * Pedir por teclado el nombre, la edad, sexo, peso y altura. Luego se crearán 3 objetos de
la clase Persona de la siguiente manera: el primer objeto obtendrá los valores pedidos
por teclado, el segundo objeto obtendrá del usuario todos los atributos menos el peso y
la altura, y el tercer objeto será inicializado con valores por defecto. Para este último
utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso
o está por debajo de su peso ideal. Mostrar un mensaje.
Indicar para cada objeto si la persona es mayor de edad.
Por último, se debe mostrar la información completa de cada objeto, es decir, los valores
de todos sus atributos.
 */
public class Ejecutable {
    Scanner read=new Scanner(System.in);
//    Pedir por teclado el nombre, la edad, sexo, peso y altura.
    public Persona[] crearPersona() {
        System.out.println("Enter your name:");
        String name=read.nextLine();
        System.out.println("Enter your age:");
        int age=read.nextInt();
        int var;
        char sex=' ';
        do{
        System.out.println("""
                           Select your gender:
                                   1)Man
                                   2)Woman
                                   3)Other""");
        var=read.nextInt();
        switch (var) {
            case 1:
                sex='H';
                break;
            case 2:
                sex='M';
                break;
            case 3:
                sex='O';
                break;
            default:
                System.out.println("Incorrect opción");
        }
        }while(var<1&&var>3);
        System.out.println("Enter your weigth in kilograms:");
        double weigth=read.nextDouble();
        System.out.println("Enter your heigth in meters:");
        double heigth=read.nextDouble();
        
        Persona persona1=new Persona(name, age, sex, weigth, heigth);
        Persona persona2=new Persona(name, age, sex);
        Persona persona3=new Persona();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter  the new name:");
        persona3.setNombre(read.next());
        System.out.println("Enter  the new age:");
        persona3.setEdad(read.nextInt());
        System.out.println("Enter  the new gender H (male), M (female) or O (other):");
        persona3.setSexo(read.next().toUpperCase().charAt(0));
        System.out.println("Enter the new heigth: ");
        persona3.setAltura(read.nextDouble());
        System.out.println("Enter the new weigth: ");
        persona3.setPeso(read.nextDouble());
        Persona[] vector={persona1,persona2,persona3};
        return vector;
    }
//    Para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso
//o está por debajo de su peso ideal. Mostrar un mensaje.
public void pesoIdeal() {
        Persona[] vector=crearPersona();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].calcularIMC()==-1) {
                System.out.println("The person " +(i+1)+" is under their ideal weigth"  );
            } else if(vector[i].calcularIMC()==0){
                System.out.println("The person " +(i+1)+" is at their ideal weigth"  );
            }else System.out.println("The person " +(i+1)+" is  over their ideal weigth"); 
            if (vector[i].esMayorDeEdad()) {
                System.out.println("Is of legal age.");
            }else System.out.println("Is underage");
            System.out.println(vector[i].toString());
    }
    }
}
