/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_ahorcado.entidades.servicios;

import com.mycompany.extra_ahorcado.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class AhorcadoServicio {

    Scanner sc = new Scanner(System.in);
    private Ahorcado ahorcado;
    private char[] progress;

    /**
     * Ask the user for the word , and the maximum number of plays.With the
     * user's word, it sets the length of the word as the length of the vector.
     * Then, it enters the word into the vector, letter by letter, with each
     * letter of the word occupying an index of the vector. It also saves the
     * maximum number of plays and the value entered by the user.
     */
    public void createGame() {
        ahorcado = new Ahorcado();
        /*System.out.println("Enter a word:");
        ahorcado.setWord(sc.next().toUpperCase().toCharArray());*/
        String[] words={"quintuplicados","whatsapp","inefable","esternocleidomastoideo","coyuntura","Fisioterapeuta","Hemiplejia","Plaguicidas","Choquezuela","chicharron","iridiscente","sinusoidal","asintóticamente","axolote"};
        ahorcado.setWord(words[(int) (Math.random()* words.length)].toUpperCase().toCharArray());
        System.out.println("Enter the number of opurtunities:");
        ahorcado.setMaxPlays(sc.nextInt());
        
    }

    /**
     * Display the length of the word, that needs to be found.
     */
    
    public void length() {
        System.out.println("Length of the word:" + ahorcado.getWord().length);
    }

    /**
     * This metod reicieves a letter given by the user and checks if the entered
     * letter is part of the word or not. It will also report whetever the
     * letter was found or not.
     *
     * @param letter a char introduce for the user.
     */
    public void lookFor(char letter) {
        boolean aux = false;
        for (int i = 0; i < ahorcado.getWord().length; i++) {
            if (letter == ahorcado.getWord()[i]) {
                aux = true;
                break;
            }
        }
    System.out.println((aux)?"Message: the letter belongs to the word":"Message: the letter doesn´t belong to the word");
    }

    /**
     * Reicieves a letter given by the user and displays how many have been
     * found and how many are still missing.
     *
     * @param letter a char introduce for the user.
     * @return true if the letter was found false if it wasn´t.
     */
    
    public boolean found(char letter) {
        boolean aux=false;
        for (int i = 0; i < ahorcado.getWord().length; i++) {
            if (ahorcado.getWord()[i] == letter) {
                aux=true;
                if(aux && progress[i]!=letter){
                ahorcado.setLettersFound(ahorcado.getLettersFound()+1);
                }
            }
        }
        System.out.println("Nunmber of letters (found, missing): (" + ahorcado.getLettersFound() + "," + (ahorcado.getWord().length - ahorcado.getLettersFound()) + ")");
        return aux;
    }

    /**
     * Display how many attempts the player has left.
     */
    
    public void attempts() {
        System.out.println("Number of remaining opportunities: " + ahorcado.getMaxPlays());
    }
    /**
     * The metod create a new instance of progress and fill all the vector whit '_' . 
     */
    public void fillProgress() {
        progress=new char[ahorcado.getWord().length];
        Arrays.fill(progress, '_');
    }
    /**
     * This metod displays the progress in the game.
     * @param letter  a char introduce for the user.
     */
    public void displayProgress(char letter) {
        for (int i = 0; i < progress.length; i++) {
            if (ahorcado.getWord()[i] == letter) 
            progress[i]=letter; 
        }
         System.out.println("Current state: "+Arrays.toString(progress));
        }
    
    /**
     * The play method will be responsible for calling all the previously
     * mentioned methods and will report when the user uncovers the entire word
     * or runs out of attempts.
     */
    
    public void game() {
        createGame();
        fillProgress();
        do {
            System.out.println("Enter a letter:");
            char letter = sc.next().toUpperCase().charAt(0);
            length();
            lookFor(letter);
            if (!found(letter)) {
                ahorcado.setMaxPlays(ahorcado.getMaxPlays() - 1);
            }
            attempts();
            displayProgress(letter);
            System.out.println("""
                               
                               -----------------------------------------------------------------------
                               
                               """);
        } while (ahorcado.getMaxPlays() != 0 && ahorcado.getWord().length != ahorcado.getLettersFound());
        if (ahorcado.getMaxPlays() == 0) {
            System.out.println("You run out of attempts. Try again :)");
            System.out.println(" The word was: "+Arrays.toString(ahorcado.getWord()));         
        } else {
            System.out.println("Winner!!!");
        }

    }
}
