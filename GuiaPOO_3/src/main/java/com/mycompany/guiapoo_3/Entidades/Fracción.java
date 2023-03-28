/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_3.Entidades;

/**
 *
 * @author HP-G42
 */
public class Fracción {
    private int numerador;
    private int denominador;
            
    public Fracción() {
    }

    public Fracción(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fracción sum(Fracción fra) {
        return new Fracción(numerador*fra.denominador+fra.numerador*denominador, denominador*fra.denominador).simplifica();
        
    }
    public Fracción resta(Fracción fra) {
        return new Fracción(numerador*fra.denominador-fra.numerador*denominador, denominador*fra.denominador).simplifica();
    }
    public Fracción multiplicación(Fracción fra) {
        Fracción result=new Fracción(numerador*fra.numerador, denominador*fra.denominador);
        return result.simplifica();
    }
    public Fracción división(Fracción fra) {
        return new Fracción(numerador*fra.denominador,fra.numerador*denominador).simplifica();
    }
    public Fracción simplifica() {
        int n=0;
        if (Math.abs(denominador)<Math.abs(numerador)) {
            n=Math.abs(denominador);
        } else {
            n=Math.abs(numerador);
        }
        for (int i = n; i >=2; i--) {
            if (denominador%i==0 && numerador%i==0) {
                setDenominador(denominador/i);
                setNumerador(numerador/i);
            }
        }
        return new Fracción(numerador, denominador);
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    public String toString() {
        return "Fracci\u00f3n{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }
    
}
