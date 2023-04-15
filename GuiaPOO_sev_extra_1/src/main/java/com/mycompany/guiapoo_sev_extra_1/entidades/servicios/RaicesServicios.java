/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_sev_extra_1.entidades.servicios;

import com.mycompany.guiapoo_sev_extra_1.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * a)	Método getDiscriminante(): devuelve el valor del discriminante (double).
 * El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b)	Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
* para que esto ocurra, el discriminante debe ser mayor o igual que 0.
c)	Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
* para que esto ocurra, el discriminante debe ser igual que 0.
d)	Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, 
* imprime las 2 posibles soluciones.
e)	Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true 
* imprime una única raíz. Es en el caso en que se tenga una única solución posible.
f)	Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
* y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los 
* métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos 
* y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

 */
public class RaicesServicios {
    public Raices crearRaiz() {
        Scanner read=new Scanner(System.in);
        
        int a=read.nextInt();
        int b=read.nextInt();
        int c=read.nextInt();
        Raices raiz =new Raices(a, b, c);
        return raiz;
    }
    /**
     * 
     * @param raices 
     * @return devuelve el valor del discriminante (double).
 * El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices raices) {
        return (Math.pow(raices.getB(), 2)-4*raices.getA()*raices.getC());
    }
    /**
     * 
     * @param raices
     * @return devuelve un booleano indicando si tiene dos soluciones, 
* para que esto ocurra, el discriminante debe ser mayor o igual que 0
     */
    public boolean  tieneRaices(Raices raices) {
        return getDiscriminante(raices)>=0;
    }
    /**
     * 
     * @param raices
     * @return devuelve un booleano indicando si tiene una única solución,
* para que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices)==0;
    }
    /**
     * 
     * @param raices 
     * llama a tieneRaíces() y si devolvió́ true, 
* imprime las 2 posibles soluciones.
     */
    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            System.out.println("La primera raiz es:" + (-raices.getB()+Math.sqrt(getDiscriminante(raices)))/(2*raices.getA()));
            System.out.println("La segunda raiz es:" + (-raices.getB()-Math.sqrt(getDiscriminante(raices)))/(2*raices.getA()));
        }
    }
    /**
     * 
     * @param raices lama a tieneRaiz() y si devolvió́ true 
* imprime una única raíz. Es en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            System.out.println("La única raiz es: " + -raices.getB()/(2*raices.getA()));
        }
    }
    /**
     * 
     * @param raices 
     * esté método llamará tieneRaices() y a tieneRaíz(),
* y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los 
* métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos 
* y en caso de no existir solución, se mostrará un mensaje.
     */
    public void calcular(Raices raices) {
        if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else if(tieneRaices(raices)) {
            obtenerRaices(raices);
        }else
            System.out.println("No tiene raices");
    }
}
