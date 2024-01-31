/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_07;

import java.util.Scanner;

/**
 *Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 * @author Gisella
 */
public class Servicios {
    Persona persona = new Persona();
    Scanner leer = new Scanner(System.in);
    
    public Persona CrearPersona(){
       final Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su nombre");

        persona.setNombre(leer.next());

        System.out.println("Ingrese su sexo");

        System.out.println("H(Hombre),M(Mujer),O(Otro)");

        System.out.println("H, M, O");

        String sexo = leer.next().toUpperCase();

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {

            System.out.println("Ingrese una opción válida: ");

            sexo = leer.next().toUpperCase();
        }

        persona.setSexo(sexo);

        System.out.println("Ingrese su edad");

        persona.setEdad(leer.nextInt());

        System.out.println("Ingrese su peso");

        persona.setPeso(leer.nextDouble());

        System.out.println("Ingrese su altura");

        persona.setAltura(leer.nextDouble());

        return persona;

    }

    public int calcularIMc(Persona persona) {

        double peso = persona.getPeso();

        double altura = persona.getAltura();

        double imc = peso / (altura * altura);

        if (imc < 20) {

            System.out.println("Usted se encuentra por debajo de su peso ideal");

            return -1;

        } else if (imc >= 20 && imc <= 25) {

            System.out.println("Usted se encuentra en su peso ideal");

            return 0;

        } else {

            System.out.println("Usted se encuentra por arriba de su peso ideal");

            return 1;

        }

    }

    public boolean esMayorDeEdad(Persona persona) {

        int edad = persona.getEdad();

        if (edad > 18) {

            System.out.println("Es mayo de edad");

            return true;

        } else {

            System.out.println("Es menor de edad");

            return false;

        }

    }

}

