/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rxtra2;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class Rxtra2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your name:");
        String frase = read.next();
        alReves(frase);
        upperCaseLower(frase);
    }

    public static void alReves(String word) {
        String rev = "";
        for (int i = word.length(); i > 0; i--) {
            rev += word.substring(i - 1, i);
        }
        System.out.println(rev);
    }

    public static void upperCaseLower(String word) {
        String UpperLower = "";
        for (int i = 0; i < word.length(); i++) {
            if (!(i % 2 == 0)) {
                UpperLower += word.toLowerCase().substring(i, i + 1);
            } else {
                UpperLower += word.toUpperCase().substring(i, i + 1);
            }
        }
        System.out.println(UpperLower);
    }
}
