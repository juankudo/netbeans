/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_serv_3.entidades.servicios.servicio;

import com.mycompany.guiapoo_serv_3.entidades.servicios.Persona;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class PersonaServicio {
    
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    public boolean  mayorDeEdad(Persona persona) {
            return persona.getEdad()>=18;
        
    }
    public Persona crearPersona() {
        Persona persona=new Persona();
        System.out.println("Ingrese el nombre:");
        persona.setNombre(read.next());
        System.out.println("Ingrese la edad:");
        persona.setEdad(read.nextInt());
       char sex;
        do {
             System.out.println("Ingrese el sexo:");
             sex=read.next().toUpperCase().charAt(0);
             if (sex!='O' &&sex!='H' &&sex!='M' ) {
            System.out.println("Opción incorrecta. Por favor vuelva a intentar :)");  
        }
        } while (sex!='O' &&sex!='H' &&sex!='M');
        System.out.println("Ingrese el peso:");
        persona.setPeso(read.nextDouble());
        System.out.println("Ingrese altura:");
        persona.setAltura(read.nextDouble());
//        read.nextLine();
        return persona;
    }
    public int calcularIMC(Persona persona) {
        if (persona.getPeso()/Math.pow(persona.getAltura(), 2)>25) {
            return 1;
        } else if(persona.getPeso()/Math.pow(persona.getAltura(), 2)>20) {
            return 0;
        }else{
            return -1;
        }
    }    
}
