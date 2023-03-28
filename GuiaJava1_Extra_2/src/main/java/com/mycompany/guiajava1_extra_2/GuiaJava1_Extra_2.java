/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_2;

/**
 *
 * @author HP-G42
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
public class GuiaJava1_Extra_2 {

    public static void main(String[] args) {
        int A, B, C, D, aux;
        A=(int) (Math.random()*10);
        B=(int) (Math.random()*10);
        C=(int) (Math.random()*10);
        D=(int) (Math.random()*10);
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
        aux=A;
        A=D;
        D=B;
        B=C;
        C=aux;
        System.out.println("----------------------------------");
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
    }
}
