/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_10;

import com.mycompany.guiapoo_10.entidades.Fecha;
import com.mycompany.guiapoo_10.entidades.servicios.serviciosFecha;

/**
 *
 * @author HP-G42
 */
public class GuiaPoo_10 {

    public static void main(String[] args) {
        serviciosFecha sf=new serviciosFecha();
        Fecha fecha=new Fecha();
        fecha=sf.leer();
        fecha.validar();
        System.out.println("validar:");
        System.out.println(fecha);
        System.out.println("Dias transcurridos:");
        System.out.println( fecha.diasTranscurridos());
        System.out.println("es bisiesto?: "+fecha.bisiesto());
        System.out.println("dias del mes: "+fecha.diasMes(fecha.getMes()));
        System.out.println("dia anterior: "+fecha.anterior());
        System.out.println("dia siguiente "+fecha.siguiente());
        System.out.println("dias entre:");
        System.out.println(fecha.diasEntre(fecha.siguiente()));
        System.out.println(fecha.diasEntre(fecha.anterior()));
        
        
        
    }
}
