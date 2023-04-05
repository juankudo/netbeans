/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_serv_extras_1.entidades.servicios;

import com.mycompany.guiapoo_serv_extras_1.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author HP-G42 RaicesServicio las operaciones que se podrán realizar son las
 * siguientes: a)	Método getDiscriminante(): devuelve el valor del discriminante
 * (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c b)	Método
 * tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
 * que esto ocurra, el discriminante debe ser mayor o igual que 0. c)	Método
 * tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
 * que esto ocurra, el discriminante debe ser igual que 0. d)	Método
 * obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
 * posibles soluciones. e)	Método obtenerRaiz(): l lama a tieneRaiz() y si
 * devolvió́ true imprime una única raíz. Es en el caso en que se tenga una
 * única solución posible. f)	Método calcular(): esté método llamará
 * tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles
 * soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o
 * obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no
 * existir solución, se mostrará un mensaje. Nota: Fórmula ecuación 2o grado:
 * (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
public class RaicesServicio {

    Scanner read = new Scanner(System.in);
    int a;
    int b;
    int c;

    /**
     *
     * @return Devuelve un objeto Raices, primero pidiento los parametros a,b y
     * c al usuario.
     */
    public Raices crearRaiz() {
        System.out.print("Enter the value of 'a' :");
        a = read.nextInt();
        System.out.print("Enter the value of 'b' :");
        b = read.nextInt();
        System.out.print("Enter the value of 'c' :");
        c = read.nextInt();
        Raices raices = new Raices(a, b, c);
        return raices;
    }

    /**
     *
     * @return devuelve el valor del discriminante (double). El discriminante
     * tiene la siguiente fórmula: (b^2)-4*a*c
     */
    public double getDiscriminante() {
        return (Math.pow(b, 2) - (4 * a * c));
    }

    /**
     *
     * @return devuelve un booleano indicando si tiene dos soluciones, para que
     * esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices() {
        if (getDiscriminante() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return devuelve un booleano indicando si tiene una única solución, para
     * que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
     * soluciones. (-b±√((b^2)-(4*a*c)))/(2*a)
     */
    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("The first raiz is: " + (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a));
            System.out.println("The second raiz is: " + (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a));
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.println("The raiz is: " + (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a));
        }
    }

    /**
     * Esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
     * pantalla las posibles soluciones que tiene nuestra ecuación con los
     * métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
     * métodos y en caso de no existir solución, se mostrará un mensaje.
     */
    public void calcular() {
        if (tieneRaiz()) {
            obtenerRaiz();
        } else if (tieneRaices()) {
            obtenerRaices();
        } else {
            System.out.println("It has no roots");
        }
    }
}
