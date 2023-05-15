/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_extra_2.services;

import com.mycompany.guiacolec_extra_2.entities.FamousSinger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class FamousSingerService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void add5Singer(ArrayList<FamousSinger> famousList) {
        String[] cantantes = {"Madonna", "Michael Jackson", "Beyoncé", "Elvis Presley", "Adele"};
        String[] albumes = {"The Immaculate Collection", "Thriller", "Dangerously in Love", "Elvis' Christmas Album", "21"};
        for (int i = 0; i <5; i++) {   
            FamousSinger fs = new FamousSinger();
            fs.setName(cantantes[i]);
            fs.setBestSellingAlbum(albumes[i]);
            famousList.add(fs);
        }
        
    }

    public void addSinger(ArrayList<FamousSinger> famousList) {
        char op;
        do {
            FamousSinger fs = new FamousSinger();
            System.out.println("Enter the singer´s name:");
            fs.setName(sc.next());
            System.out.println("Enter his best selling album:");
            fs.setBestSellingAlbum(sc.next());
            famousList.add(fs);
            System.out.println("Do you want to enter a new famous singer?(Y/N)");
            op = sc.next().toLowerCase().charAt(0);
        } while (op == 'y');
    }

    public void displaysList(ArrayList<FamousSinger> famousList) {
        for (FamousSinger famousSinger : famousList) {
            System.out.println(famousSinger);
        }
    }

    public void eliminateSinger(ArrayList<FamousSinger> famousList) {
        boolean flag = false;
        Iterator<FamousSinger> it=famousList.iterator();
        System.out.println("Enter the singer´s name:");
        String name = sc.next();
        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(name)) {
                it.remove();
                flag=true;
            }
            
        }
        System.out.println(flag ? "" : "The singer wasn´t found");
    }

    public void menu() {
        ArrayList<FamousSinger> singerList = new ArrayList<>();
        add5Singer(singerList);
        displaysList(singerList);
        int op;
        do {
            System.out.println("----------------Menu-----------------\n"
            +"1)Add one or more singers\n"
            +"2)Display the list of singers\n"
            +"3)Delite a singer\n"
            +"4)Exit.");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    addSinger(singerList);
                    break;
                case 2:
                    displaysList(singerList);
                    break;
                case 3:
                    eliminateSinger(singerList);
                    break;
                case 4:
                    System.out.println("Thank you for using the program! exiting...");
                    break;
                default:
                    System.out.println("Incorrect option. Please try again ;-)");
            }
        } while (op!=4);
        
    }
}
