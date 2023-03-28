/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiajava1_extra_20;



/**
 *
 * @author HP-G42
 * Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
public class GuiaJava1_Extra_20 {

    public static void main(String[] args) {
        int[] vecNot= new int[4]; 
        double[] vecProm=new double[10];
        int contDes=0;

        for (int i = 0; i < vecProm.length; i++) {
            System.out.println("Notas del alumno número "+(i+1)+" :");
            for (int j = 0; j < vecNot.length; j++) {
                vecNot[j]=randonize(1, 10);
                switch (j) {
                    case 0:
                        System.out.println("Primer trabajo práctico evaluativo: "+vecNot[0]);
                        break;
                    case 1:
                        System.out.println("Segundo trabajo práctico evaluativo: "+vecNot[1]);
                        break;
                    case 2:
                        System.out.println("Primer Integrador: "+vecNot[2]);
                        break;
                    case 3:
                        System.out.println("Segundo integrador: "+vecNot[3]);
                        break;
                   }
            }
            vecProm[i]=(vecNot[0]*0.10+vecNot[1]*0.15+vecNot[2]*0.25+vecNot[3]*0.5);
            System.out.println("El promedio del alumno número "+(i+1)+" es: "+vecProm[i]);
            System.out.println("");
            if (vecProm[i]<7) {
                contDes++;
            }
        }
        System.out.println("");
        System.out.println("La cantidad de aprobados es: "+(10-contDes));
        System.out.println("La cantidad de desaprobados es: "+(contDes));
    }
    
    public static int randonize(int min, int max) {
        return (int)(Math.floor((Math.random()*(max-min+1))+min));        
    }
}
