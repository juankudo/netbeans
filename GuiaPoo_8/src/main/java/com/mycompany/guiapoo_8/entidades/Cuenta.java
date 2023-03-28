/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_8.entidades;

/**
 *
 * @author HP-G42
 */
public class Cuenta {

    private int numeroCuenta;
    private long  DNI;
    private double saldo_actual;
    private double interés_anual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldo_actual, double interés_anual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo_actual = saldo_actual;
        this.interés_anual = interés_anual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void setInterés_anual(double interés_anual) {
        this.interés_anual = interés_anual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public double getInterés_anual() {
        return interés_anual;
    }
//    Método actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés
//diario (interés anual dividido entre 365 aplicado al saldo actual)
    public void actualizarSaldo() {
        saldo_actual+=(interés_anual/365)*saldo_actual;
    }
//    Método ingresar(double): permitirá ingresar una cantidad en la cuenta bancaria.
    public void ingresar(double monto) {
        saldo_actual+=monto;
    }
//    Método retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
    public void retirar(double monto) {
        if (saldo_actual>=monto) {
             saldo_actual-=monto;
        }
    }
//    Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println("El saldo de la cuenta es: "+saldo_actual);
    }
//    Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
//     private int numeroCuenta;
//    private long  DNI;
//    private double saldo_actual;
//    private double interés_anual;
    public void consultarDatos() {
        System.out.println("Número de cuenta:"+numeroCuenta);
        System.out.println("DNI: "+DNI);
        System.out.println("Saldo actual: "+saldo_actual);
        System.out.println("Interés anual: "+interés_anual);
    }
    
}
