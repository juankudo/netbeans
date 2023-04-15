/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_sev_extra_1;

import com.mycompany.guiapoo_sev_extra_1.entidades.Raices;
import com.mycompany.guiapoo_sev_extra_1.entidades.servicios.RaicesServicios;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaPOO_sev_extra_1 {

    public static void main(String[] args) {
//        Scanner read=new Scanner(System.in);
        RaicesServicios serv=new RaicesServicios();
        Raices raices=new Raices(2, 5, 0);
        serv.calcular(raices);
    }
}
