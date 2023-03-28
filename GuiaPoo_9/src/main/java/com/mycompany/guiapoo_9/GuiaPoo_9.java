/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_9;

import com.mycompany.guiapoo_9.entidades.Raices;
import java.util.Scanner;

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
//Solo varia el signo delante de -b
 */
public class GuiaPoo_9 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese los 3 coeficientes  a, b y c:");
        Raices coef=new Raices(read.nextInt(), read.nextInt(), read.nextInt());
        
        coef.calcular();
    }
}
