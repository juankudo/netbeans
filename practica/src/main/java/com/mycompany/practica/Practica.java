/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica;

import com.mycompany.practica.enumeraciones.Raza;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author HP-G42
 */
public class Practica {

    public static void main(String[] args) {
        /*for (Raza value : Raza.values()) {
            System.out.println(value);
        }
        DecimalFormat formato = new DecimalFormat("#.##"); // Define el formato con dos decimales
        double x1=Double.parseDouble(formato.format(Math.random()*100).replace(",", "."));
        double x2=Double.parseDouble(formato.format(Math.random()*100).replace(",", "."));
        double mayor=(x1<x2)?x2:x1;
        System.out.println("x1 = " + x1+"\nx2 = " + x2+"\nmayor = " + mayor);
       double numeroAleatorio = Math.random() * 100; // Genera un número aleatorio entre 0 y 1
        String numeroString=formato.format(numeroAleatorio);
        numeroString = numeroString.replace(",", ".");
        double numeroFormateado = Double.parseDouble(numeroString); // Formatea y convierte a double
        System.out.println("El número generado es: " + numeroFormateado);
        List<String> words = Arrays.asList("hello", "world", "java");
        List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths); // salida: [5, 5, 4]
        List<Integer> cuadrados = numeros.stream().map(n -> (int) Math.pow(n, 2)).collect(Collectors.toList());
        System.out.println(cuadrados);
        int sum = IntStream.rangeClosed(1, 10).reduce(0, (a, b) -> a + b);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numeros.stream().reduce(0, (a, b) -> a + b);
        System.out.println((double )sum/numeros.size()); */

        int[] numbers = IntStream.rangeClosed(1, 12).filter(n -> (n != 8 && n != 9)).toArray();
        System.out.print("[");
        for (int number : numbers) {
            System.out.print(number +" ");
        }
        System.out.println("]");
        List<Integer> numeros = IntStream.rangeClosed(1, 12).filter(n -> (n != 8 && n != 9)).boxed().collect(Collectors.toList());
        System.out.println(numeros);

    }
}
