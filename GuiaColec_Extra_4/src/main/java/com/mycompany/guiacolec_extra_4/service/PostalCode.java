/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_extra_4.service;


import java.util.*;

/**
 *
 * @author HP-G42
 */
public class PostalCode {
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    /**
     * This metod adds 10 cities to a HashMap, each one whit its postal code.
     *
     * @param postalCodes an empty hashmap.
     */
    public void addTenCities(HashMap<Integer, String> postalCodes) {
        Integer[] postalCode = {1414, 1425, 1642, 2000, 4000, 4400, 5000, 5700, 8300, 9000};
        String[] cities = {"Ciudad Autónoma de Buenos Aires", "Palermo", "Beccar", "Rosario", "San Miguel de Tucumán", "Salta", "Córdoba", "Neuquén", "Bariloche", "Bahía Blanca"};
        for (int i = 0; i < 10; i++) {
            postalCodes.put(postalCode[i], cities[i]);
        }
        displayHashMap(postalCodes);
    }
    /**
     * This metod adds one or more cities to a HashMap, asks to the user if he
     * wants to continue adding cities and postal codes.
     *
     * @param postalCodes Its a HashMap qhit a integer key (postal code), and
     * string values (City´s name).
     */
    public void addCities(HashMap<Integer, String> postalCodes) {
        char op;
        do {
            System.out.println("Enter the city:");
            String city = sc.next();
            System.out.println("Enter de postal code:");
            Integer pc = sc.nextInt();
            postalCodes.put(pc, city);
            do {
                System.out.println("Do you want to continue adding cities?(Y/N)");
                op = sc.next().toLowerCase().charAt(0);
                System.out.println((op != 'y' && op != 'n') ? "Incorrect option, please try again B-/" : "");
            } while (op != 'y' && op != 'n');
        } while (op == 'y');
    }
/**
     * This metod adds one citiy to a HashMap, entered by the user.
     *
     * @param postalCodes Its a HashMap qhit a integer key (postal code), and
     * string values (City´s name).
     */
    public void addCity(HashMap<Integer, String> postalCodes,String city,Integer pc) {
            postalCodes.put(pc, city);   
    }
    /**
     * This metod adds one citiy to a HashMap, entered by the user.
     * @param postalCodes Its a HashMap qhit a integer key (postal code), and
     * string values (City´s name).
     */
    public void userAdd10Cities(HashMap<Integer, String> postalCodes) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number "+ (i+1)+" city:");
            String city = sc.next();
            System.out.println("Enter the "+city+ "´s postal code:");
            Integer pc = sc.nextInt();
            addCity(postalCodes, city, pc); 
        }
    }

    /**
     * This metod displays the cities´names whit theirs postal codes
     *
     * @param postalCodes Its a HashMap qhit a integer key (postal code), and
     * string values (City´s name).
     */
    public void displayHashMap(HashMap<Integer, String> postalCodes) {
        System.out.println("-------------------------------------------------------------");
        for (Map.Entry<Integer, String> entry : postalCodes.entrySet()) {
            System.out.println("City: " + entry.getValue() + ", " + "P.C: " + entry.getKey());
        }
        System.out.println("-------------------------------------------------------------");
    }

    /**
     * This metod looks for a postal code into the hashMap, if its found prints
     * the city´s name, if not display a message.
     *
     * @param postalCodes Its a HashMap qhit a integer key (postal code), and
     * string values (City´s name).
     */
    public void postalCodeCity(HashMap<Integer, String> postalCodes) {
        boolean flag = true;
        System.out.println("Enter the postal code:");
        Integer cp = sc.nextInt();
        for (Map.Entry<Integer, String> entry : postalCodes.entrySet()) {
            if (cp.equals(entry.getKey())) {
                System.out.println("City: " + entry.getValue() + ", " + "P.C: " + entry.getKey());
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "The postal code " + cp + " wasn´t found in the list." : "");
    }

    /**
     * The metod remove a city, entered by the user from the HashMap
     *
     * @param postalCodes Its a HashMap qhit a integer key (postal code), and
     * string values (City´s name).
     */
    public void removeCity(HashMap<Integer, String> postalCodes, String city) {
        boolean flag = true;
        for (Map.Entry<Integer, String> entry : postalCodes.entrySet()) {
            if (city.equalsIgnoreCase(entry.getValue())) {
                postalCodes.remove(entry.getKey());
                flag = false;
                break;
            }
        }
        System.out.println((flag) ? "The city " + city + " wasn´t found in the list." : "");
    }

    /**
     * The motod asks the user for the name of 3 cities, then remove the cities
     * from the HashMap, finaly displays the remaining cities and theis postal
     * codes
     *
     * @param postalCodes Its a HashMap qhit a integer key (postal code), and
     * string values (City´s name).
     */
    public void remove3cities(HashMap<Integer, String> postalCodes) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number " + (i + 1) + " city to remove:");
            String city = sc.next();
            removeCity(postalCodes, city);
        }
        displayHashMap(postalCodes);
    }

    /**
     *
     */
    public void menu() {
        HashMap<Integer, String> postalCodes = new HashMap();
        addTenCities(postalCodes);
        int op;
        do {  
        System.out.println("---------------------_*MENU*_------------------------\n"
                + "1)Display the cities and their postal codes\n"
                + "2)Enter 10 postal codes and their cities\n"
                + "3)Enter a postal code and find his city\n"
                + "4)Enter one or more cities ehit their postal codes\n"
                + "5)Remove 3 cities\n"
                + "6)Exit");
        op = sc.nextInt();
        switch (op) {
            case 1:
                displayHashMap(postalCodes);
                break;
            case 2:
                userAdd10Cities(postalCodes);
                break;
            case 3:
                postalCodeCity(postalCodes);
                break;
            case 4:
                addCities(postalCodes);
                break;
            case 5:
                remove3cities(postalCodes);
                break;
            case 6:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Incorrect Option, please try again ;-)");
        }
        } while (op!=6);
    }
}
