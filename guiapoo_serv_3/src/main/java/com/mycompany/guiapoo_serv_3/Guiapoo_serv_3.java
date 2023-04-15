/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_serv_3;

import com.mycompany.guiapoo_serv_3.entidades.servicios.Persona;
import com.mycompany.guiapoo_serv_3.entidades.servicios.servicio.PersonaServicio;

/**
 *
 * @author HP-G42
 */
public class Guiapoo_serv_3 {

    public static void main(String[] args) {
        Persona[] matrizPersona=new Persona[4];
        PersonaServicio servicio=new PersonaServicio();
        int[] matrizIMC=new int[4];
        int contIdeal=0;
        int contSobre=0;
        int contBajo=0;
        int contMayor=0;
        
        for (int i = 0; i < matrizPersona.length; i++) {
            matrizPersona[i]=servicio.crearPersona();
            matrizIMC[i]=servicio.calcularIMC(matrizPersona[i]);
            if (matrizIMC[i]==0) {
                contIdeal++;
            } else if(matrizIMC[i]==1) {
                contSobre++;
            }else {
                contBajo++;
            }
            if (servicio.mayorDeEdad(matrizPersona[i])) {
                contMayor++;
            }
        }
        System.out.println("Porcentaje con peso ideal:" + (double) contIdeal/4*100);
        System.out.println("Porcentaje con sobrepeso:" + (double) contSobre/4*100);
        System.out.println("Porcentaje con bajo peso:" + (double) contBajo/4*100);
        System.out.println("Porcentaje mayores de edad:" + (double) contMayor/4*100);
        System.out.println("Porcentaje mayores de edad:" + (double) (4-contMayor)/4*100);
    }
}
