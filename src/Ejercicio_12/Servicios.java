/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_12;

import java.util.Date;
import java.util.Scanner;

/**
 *Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 * @author Gisella
 */
public class Servicios {
    Persona pers = new Persona();
    int dia;
    int mes;
    int annio;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPersona(){
 
        System.out.println("ingrese su nombre: ");
        pers.setNombre(leer.nextLine());

        System.out.println("Ingrese su día de nacimiento");
        dia = leer.nextInt();

        System.out.println("Ingrese su mes de nacimiento: ");
        if (mes > 12) {
            System.out.println("el mes ingresado es incorrecto.");
        } else {
            mes = leer.nextInt();

            System.out.println("Ingrese su año de nacimiento: ");
            annio = leer.nextInt();

            Date fecha = new Date(annio - 1900, mes - 1, dia);
            pers.setFechaNac(fecha);

        }
    }

    public void calcularEdad(){
         Date fechaNacimiento = new Date(annio, mes, dia);
        Date fechaActual = new Date();
         
       //int edad = fechaActual - fechaNacimiento;
 
    }   
    
    public boolean menorQue( int edad){
       
        System.out.println("Ingrese otra edad: ");
        int newEdad = leer.nextInt();
        if (edad > newEdad){
           return true;
        }else{
            return false;
        }
    }
    
    public void MostrarPersona(){
        crearPersona();
    }
}
