/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_12;

import com.mycompany.guiapoo_12.entidades.Letra;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Dígito Verificador. Crear una clase Letra que se usará para mantener DNIs con su
correspondiente letra. Los atributos serán el número de DNI (entero largo) y la
letra que le corresponde. La clase dispondrá de los siguientes métodos:
• Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio en
blanco (será un NIF no válido).
• Constructor que reciba el DNI y establezca la letra que le corresponde.
• Métodos getters y setters para el número de DNI (que ajuste también
automáticamente la letra).
• Método leer(): para pedir el número de DNI (ajustando automáticamente la letra)
• Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en mayúscula;
por ejemplo: 00395469-F).
 */
public class GuiaPoo_12 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int op=0;
        String op2="";
        Letra letter=new Letra();
        do{
        do {
            System.out.println("""
                           Menu
                           1) Enter a new ID
                           2)Change the ID
                           3)Enter a ID and show the NIF
                           4)Show your ID
                           5)Show your ID+NIF
                           6)Exit
                           """);
        op=read.nextInt();
            if (op<1 || op>6) {
                System.out.println("Incorrect opcion. Please try again.");
            }
        } while (op<1 || op>6);
        switch (op) {
            case 1:
                System.out.println("Enter your ID:");
                long ID=read.nextLong();
                letter=new Letra(ID);
                break;
            case 2:
                System.out.println("Enter the new ID");
                long newID=read.nextLong();
                letter.setDNI(newID);
                break;
            case 3:
                letter.leer();
                break;
            case 4:
                System.out.println("Your ID is: "+letter.getDNI());
                break;
            case 5:
                letter.showNIF();
                break;
            case 6:
                do {
                     System.out.println("Do you want to exit?(Y/N)");
                op2=read.next();
                if (!op2.equalsIgnoreCase("y") && !op2.equalsIgnoreCase("n")) {
                    System.out.println("Incorrect opcion. Please try again.");
                }
                } while (!op2.equalsIgnoreCase("y") && !op2.equalsIgnoreCase("n"));
                break;
        }
        }while(!op2.equalsIgnoreCase("y"));
    }
}
