/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_17;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
public class GuiaJava1_17 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String cadena;
        int cont=0, cont2=0;
        System.out.println("Ingrese las cadenas:");
        do{
        cadena=read.next();
        if (cadena.length()==5){
            //if(cadena.startsWith("X") && cadena.endsWith("O")){
            if(cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
            cont=cont+1;
                }else if(!cadena.equals("&&&&&")){
                cont2=cont2+1;
                }
            }else {
                cont2=cont2+1;
                   }
        }while(!cadena.equals("&&&&&"));
        System.out.println("la cantidad de lecturas correctas: "+cont);
        System.out.println("la cantidad de lecturas incorrectas: "+cont2);
    }
}
