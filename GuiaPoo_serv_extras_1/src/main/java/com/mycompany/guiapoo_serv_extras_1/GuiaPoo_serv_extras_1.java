/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_serv_extras_1;

import com.mycompany.guiapoo_serv_extras_1.entidades.Raices;
import com.mycompany.guiapoo_serv_extras_1.entidades.servicios.RaicesServicio;

/**
 *
 * @author HP-G42
 */
public class GuiaPoo_serv_extras_1 {

    public static void main(String[] args) {
        RaicesServicio servicio=new RaicesServicio();
        Raices[] vectorRaices=new Raices[5];
        for (int i = 0; i < vectorRaices.length; i++) {
            vectorRaices[i]=servicio.crearRaiz(); 
            servicio.calcular();
        }
    }
}
