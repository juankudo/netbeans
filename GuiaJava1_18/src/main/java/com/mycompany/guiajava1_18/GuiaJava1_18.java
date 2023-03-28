/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_18;

/**
 *
 * @author HP-G42
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
public class GuiaJava1_18 {

    public static void main(String[] args) {
        String numCad;
        numCad="";
        for (int i=0;i<1000;i++){
            if (i<10){
                if (i==3){
                 System.out.println("0-0-E");   
                }else {
                  System.out.println("0-0-"+i);
                }
            }else if(i<100){
                numCad=String.valueOf(i);
                numCad=numCad.replace("3", "E");
                System.out.println("0-"+numCad.substring(0, 1)+"-"+numCad.substring(1));
             }else{
                numCad=String.valueOf(i);
                numCad=numCad.replace("3", "E");
                System.out.println(numCad.substring(0, 1)+"-"+numCad.substring(1, 2)+"-"+numCad.substring(2));
            }
                
            }
           }       
        }
