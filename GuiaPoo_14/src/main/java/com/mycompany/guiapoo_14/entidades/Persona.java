/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_14.entidades;

import java.util.Scanner;

/**
 *
 * @author HP-G42 Realizar una clase llamada Persona que tenga los siguientes
 * atributos: nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y
 * altura. Si el alumno desea añadir algún otro atributo, puede hacerlo
 */
public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    Scanner read=new Scanner(System.in);
//Un constructor por defecto.
//• Un constructor con el nombre, edad y sexo recibidos como parámetro; y el resto de
//los atributos se inicializarán con valores por defecto.
//• Un constructor con todos los atributos como parámetro.

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso=75;
        altura=1.75;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
        this.sexo=sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
//    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en m)). Si esta fórmula da por resultado un valor menor que 20, la función
//devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
//significa que el peso está por debajo de su peso ideal y la función devuelve un 0.
//Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la
//persona tiene sobrepeso, y la función devuelve un 1. Se recomienda hacer uso de
//constantes para devolver estos valores.
    public int calcularIMC() {
        if (peso/(Math.pow(altura, 2))<20) {
            return -1;
        } else if(peso/(Math.pow(altura, 2))<=25) {
            return 0;
        }else
            return 1;
    }
//    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    public boolean esMayorDeEdad() {
        if (edad<=18) {
            return false;
        } else 
        return true;
    }
//    Método comprobarSexo(char sexo): comprueba que el sexo introducido sea
//correcto, es decir, H M ó O. Si no es correcto se deberá mostrar un mensaje.
    /**
     * 
     * @param sexo 
     * tipo character puede ser H M ó O
     */
    public void comprobarSexo(char sexo) {
        do{
        if (sexo!='H'&&sexo!='M'&&sexo!='O') {
            System.out.println("Sexo cargado incorrectamente.");
            sexo=read.next().toUpperCase().charAt(0);
        }
        }while(sexo!='H'&&sexo!='M'&&sexo!='O');
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
}
