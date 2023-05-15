/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_ahorcado.entidades;

/**
 *
 * @author HP-G42
 */
public class Ahorcado {
    private char[] word;
    private int lettersFound=0;
    private int maxPlays;

    public Ahorcado() {
    }

    public char[] getWord() {
        return word;
    }

    public int getLettersFound() {
        return lettersFound;
    }

    public int getMaxPlays() {
        return maxPlays;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    public void setLettersFound(int lettersFound) {
        this.lettersFound = lettersFound;
    }

    public void setMaxPlays(int maxPlays) {
        this.maxPlays = maxPlays;
    }
    
    
    
}
