/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;

import java.util.Date;
import java.util.Scanner;

/**
 *Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 * @author Gisella
 */
public class mainDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Date date = new Date(); 
        
        int dia = 0;
        int mes = 0;
        int annio;
   
        System.out.println("Ingrese un día: ");
        if (dia >= 31) {
            System.out.println("el dia ingresado es incorrecto.");
        } else {
          date.setDate(dia = leer.nextInt());
        }
 
        System.out.println("Ingrese un mes: ");
        if (mes > 12) {
            System.out.println("el mes ingresado es incorrecto.");
        } else {
           date.setMonth(mes = leer.nextInt()- 1);
        }
        
        System.out.println("Ingrese un año: ");
       date.setYear(annio = leer.nextInt() - 1900);
       

        Date fechaUsuario = new Date(annio, mes, dia);
        Date fechaActual = new Date();

        //System.out.println(fechaUsuario);
       // System.out.println(fechaActual);

        int añosDeDiferencia =  fechaActual.getYear()- fechaUsuario.getYear();
        System.out.println("Hay " + añosDeDiferencia + " años de diferencia entre las fechas");
        
    }
   
}
