/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_tp9_4;

import com.mycompany.guiapoo_tp9_4.servicios.FechaServicio;
import java.util.Date;

/**
 *
 * @author HP-G42
 */
public class GuiaPoo_tp9_4 {

    public static void main(String[] args) {
        FechaServicio fs=new FechaServicio();
        Date nacimiento=fs.fechaNacimiento();
        Date actual=fs.fechaActual();
        System.out.println("Edad de la persona= " + fs.diferencia(nacimiento, actual));
        
    }
}
