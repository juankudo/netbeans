/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaalumnos.servicios;

import com.mycompany.practicaalumnos.entidades.Alumno;
import java.util.*;

/**
 *
 * @author HP-G42
 */
public class AlumnoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * En el servicio de Alumno deberemos tener un bucle que crea un objeto
     * Alumno.Se pide toda la información al usuario y ese Alumno se guarda en
     * una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro
     * Alumno o no.
     *
     * @return
     */
    public ArrayList<Alumno> crearListaAlumnos() {
        ArrayList<Alumno> alumnosLista = new ArrayList();
        char op;
        do {
            Alumno aux = new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            aux.setNombre(sc.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota numero " + (i + 1) + ":");
                aux.getNotas().add(sc.nextInt());
            }
            alumnosLista.add(aux);
            do {
                System.out.println("Desea seguir agragando alumnos?(S/N)");
                op = sc.next().toLowerCase().charAt(0);
            } while (op != 's' && op != 'n');
        } while (op == 's');
        return alumnosLista;
    }

    /**
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos.Si está en la
     * lista, se llama al método.Dentro del método se usará la lista notas para
     * calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main.
     *
     * @param alumnosLista
     * @param nombre
     */
    public void notaFinal(ArrayList<Alumno> alumnosLista, String nombre) {
        boolean bandera = true;
        Integer suma = 0;
        for (Alumno alumno : alumnosLista) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota : alumno.getNotas()) {
                    suma += nota;
                }
                bandera = false;
                break;
            }
        }
        System.out.println(bandera ? "No se encontro el alumno en la lista." : "El promedio final del alumno es " + (double) suma / 3);
    }

    /**
     * Este metodo utiliza todos los metodos creaos anteriormente y le permite
     * al usuario elegir con un menu interactivo las acciones.
     */
    public void menu() {
        int op;
        ArrayList<Alumno> alumnosLista = new ArrayList();
        do {
            System.out.println("-----------------MENU------------------\n"
                    + "1)Cargar alumnos\n"
                    + "2)Calcular el promedio final de un alumno\n"
                    + "3)Salir.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    alumnosLista = crearListaAlumnos();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del alumno:");
                    String nombre = sc.next();
                    notaFinal(alumnosLista, nombre);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. ");
            }
        } while (op != 3);
    }
}
