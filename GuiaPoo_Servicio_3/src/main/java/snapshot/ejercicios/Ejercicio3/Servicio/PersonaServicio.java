package snapshot.ejercicios.Ejercicio3.Servicio;

import java.util.Scanner;
import snapshot.ejercicios.Entidades.Personas;

public class PersonaServicio {

    Scanner entrada = new Scanner(System.in);

    public Personas crearPersona() {
        Personas persona = new Personas();
        System.out.println("Introduzca el nombre: ");
//        persona.setNombre(entrada.nextLine());
        String name = "NN" + (int) (Math.random() * 59);

        persona.setNombre(name);
        System.out.println("name = " + name);
        System.out.println("Introduzca la edad");
//        persona.setEdad(entrada.nextInt());
        persona.setEdad((int) (Math.random() * 90));
        System.out.println(persona.getEdad());
        do {
            System.out.println("Introduzca el sexo");
//            persona.setSexo(entrada.next().toUpperCase().charAt(0));
int var=(int)Math.floor((Math.random()*3)+1);
switch (var) {
                case 1:
                    persona.setSexo('O');
                    break;
                case 2:
                    persona.setSexo('H');
                    break;
                case 3:
                    persona.setSexo('M');
                    break;
            }
            if (persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'O') {
                System.out.println("Digito mal el sexo, Vuelva a intentarlo!");
            }
            System.out.println(persona.getSexo());
        } while (persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'O');
        System.out.println("Introduzca el peso: ");
//        persona.setPeso(entrada.nextDouble());
        persona.setPeso((Math.random() * 100) + 35);
        System.out.println(persona.getPeso());
        do {
            System.out.println("Introduzca la altura en Metros: ");
//            persona.setAltura(entrada.nextDouble());
            persona.setAltura(Math.random() * 1.5 + 1);
            System.out.println(persona.getAltura());
//            entrada.nextLine();
        } while (persona.getAltura() > 2.50);
        System.out.println("----------------------------------------------------------------");
        return persona;
    }

    public boolean esMayorDeEdad(Personas persona) {
        boolean ok = false;
        if (persona.getEdad() > 18) {
            ok = true;
        }
        return ok;
    }

    public double calcularIMC(Personas persona) {
        double pesoIdeal;

        pesoIdeal = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (pesoIdeal < 20) {
            pesoIdeal = -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            pesoIdeal = 0;
        } else {
            pesoIdeal = 1;
        }
        return pesoIdeal;
    }
}
