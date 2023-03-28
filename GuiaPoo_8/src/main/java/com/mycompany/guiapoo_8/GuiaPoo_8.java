/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo_8;

import com.mycompany.guiapoo_8.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
y el interés anual que se aplica a la cuenta (porcentaje). Las operaciones
asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes con los que llenaremos el
objeto en el Main.
• Método actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés
diario (interés anual dividido entre 365 aplicado al saldo actual)
• Método ingresar(double): permitirá ingresar una cantidad en la cuenta bancaria.
• Método retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 */
public class GuiaPoo_8 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        int op;
        String op2 = "";
        do {
            System.out.println("----------Bienvenido a BBVA frances---------");
            System.out.println("Elija una opción: ");
            System.out.println("1)Ingresar saldo");
            System.out.println("2)Retiros");
            System.out.println("3)Consultar saldo");
            System.out.println("4)Consultar datos de la cuenta");
            System.out.println("5)Actualizar saldo");
            System.out.println("6)Editar/ingresar datos de cuenta");
            System.out.println("7)Salir");
            op = read.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el monto que desea ingresar:");
                    cuenta.ingresar(read.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea retirar:");
                    cuenta.retirar(read.nextInt());
                    break;
                case 3:
                    cuenta.consultarSaldo();
                    break;
                case 4:
                    cuenta.consultarDatos();
                    break;
                case 5:
                    cuenta.actualizarSaldo();
                    break;
                case 6:
                    int op3;
                    do {
                        System.out.println("1)Ingresar/Cambiar Número de cuenta:");
                        System.out.println("2)Ingresar/Cambiar el DNI del titular");
                        System.out.println("3)Ingresar/Cambiar el interes anual");
                        System.out.println("4)Ingresar/Cambiar el saldo actual");
                        System.out.println("5)Ingesar cuenta nueva");
                        op3 = read.nextInt();
                                           
                    switch (op3) {
                        case 1:
                            System.out.println("Ingrese el número de cuenta:");                            
                            cuenta.setNumeroCuenta(read.nextInt());
                            break;
                        case 2:
                            System.out.println("Ingrese el número de DNI");                            
                            cuenta.setDNI(read.nextLong());
                            break;
                        case 3:
                            System.out.println("Ingrese el interés anual:");                            
                            cuenta.setInterés_anual(read.nextDouble());
                            break;
                        case 4:                            
                            cuenta.setSaldo_actual(read.nextInt());
                            break;
                        case 5:
                            System.out.println("Ingrese los datos en el siguiente orden: Número de cuenta, DNI, saldo, interes anual ");                            
                            cuenta= new Cuenta(read.nextInt(), read.nextLong(), read.nextDouble(), read.nextDouble());
                            break;
                                
                        default:
                            System.out.println("Opción incorrecta. Por favor vuelva a intentar :-)");    
                    }
                    } while (op3 < 1 || op3 > 5);
                break;
                case 7:
                    do {
                        System.out.println("¿Desea salir?(S/N)");
                        op2 = read.next();
                        op2 = op2.toUpperCase();
                        if (op2.equals("S")) {
                            System.out.println("Saliendo. Nos vemos pronto.");
                        } else if (!op2.equals("S") && !op2.equals("N")) {
                            System.out.println("Opción incorrecta. Por favor vuelva a intentar :-)");
                        }
                    } while (!op2.equals("S") && !op2.equals("N"));
                    
                    break;
                
                default:
                    System.out.println("Opción incorrecta. Por favor vuelva a intentar :-)");
            }
        } while (!op2.equals("S"));
    }
}
