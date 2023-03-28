/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package com.mycompany.guiapoo_9.entidades;

/**
 *
 * @author HP-G42
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a
través de un método constructor. Luego, las operaciones que se podrán realizar
son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2
posibles soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
Solo varia el signo delante de -b
 */
public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//    Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante() {
        return Math.pow(b, 2)-4*a*c;
    }
//    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices() {
        if (getDiscriminante()>=0) {
            return true;
        }else
            return false;
    }
//    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz() {
        if (getDiscriminante()==0) {
            return true;
        }else
    return false;
    }
//    Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2
//posibles soluciones.
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x2=(-b+Math.sqrt(getDiscriminante()))/(2*a);
            double x1=(-b-Math.sqrt(getDiscriminante()))/(2*a);
            System.out.println("Las raices son x1: "+x1+" , x2: "+x2);
        }else
            System.out.println("No tiene raices.");
    }
//    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible.
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.println("La única raiz es "+(-b+Math.sqrt(getDiscriminante()))/(2*a));
        } else 
            System.out.println("No tiene una única solución, o no tiene ninguna.");
    }
//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    public void calcular() {
        if (tieneRaices() && !tieneRaiz()) {
            obtenerRaices();
        } else if(tieneRaiz()) {
            obtenerRaiz();
        }else 
            System.out.println("No tiene Raices");
    }
}
