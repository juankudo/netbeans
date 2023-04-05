/*
Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package snapshot.ejercicios.Ejercicio3;

import snapshot.ejercicios.Ejercicio3.Servicio.PersonaServicio;
import snapshot.ejercicios.Entidades.Personas;

public class Main {

    public static void main(String[] args) {

        PersonaServicio sc = new PersonaServicio();

        Personas persona1 = sc.crearPersona();

        Personas persona2 = sc.crearPersona();

        Personas persona3 = sc.crearPersona();

        Personas persona4 = sc.crearPersona();

        double [] vectorIMC = new double [4];
        boolean[] vectorMayorMenor = new boolean[4];
        Personas[] vectorPersona = {persona1, persona2, persona3, persona4};
        int contIdeal = 0;
        int contSobre = 0;
        int contBajo = 0;
        int contMayor = 0;

        for (int i = 0; i < vectorPersona.length; i++) {

            vectorIMC[i] = sc.calcularIMC(vectorPersona[i]);
            if (vectorIMC[i] == 1) {
                contSobre++;

            } else if (vectorIMC[i] == 0) {
                contIdeal++;

            } else {
                contBajo++;

            }
            vectorMayorMenor[i] = sc.esMayorDeEdad(vectorPersona[i]);
            if (vectorMayorMenor[i]) {
                contMayor++;

            }
        }

        System.out.println("Promedio de personas con peso Ideal: " + (double) contIdeal / 4 * 100 + " %");
        System.out.println("Promedio de personas  con sobrepeso: " + (double) contSobre / 4 * 100 + " %");
        System.out.println("Promedio de personas por debajo del peso ideal: " + (double) contBajo / 4 * 100 + " %");
        System.out.println("Promedio de personas mayores de edad " + (double) contMayor / 4 * 100 + " %");
        System.out.println("Promedio de personas mayores de edad " + (double) (4 - contMayor) / 4 * 100 + " %");

    }
}
