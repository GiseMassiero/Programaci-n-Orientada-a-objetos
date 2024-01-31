/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_08;

import java.util.Scanner;

/**
 *
 * @author Gisella
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadena cadena = new Cadena();
        Servicios serv = new Servicios();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese una frase ");
        cadena.setFrase(leer.nextLine());
        int longitud = cadena.getFrase().length();
        System.out.println("su frase es: "+ cadena.getFrase()+ "tiene una longitus de: " + longitud + " caracteres" );

        System.out.println("La cantidad de vocales es "+ serv.mostrarVocales(cadena));
        serv.invertirFrase(cadena);
        System.out.println(cadena.getFrase());
        System.out.println("Ingrese una caracter: ");
        String car= leer.next();
        System.out.println("El caracter se repite: "+serv.vecesRepetido(cadena, car)+" veces");
        System.out.println("Ingrese una frase: ");
        if (serv.compararLongitud(cadena, leer.next())){
            System.out.println("Tienen la misma longitud ");
        }
        else{
            System.out.println("NO tienen la misma longitud");
            }
        System.out.println("Ingrese una frase: ");
        serv.unirFrases(cadena, leer.next());
        System.out.println(cadena.getFrase());
        serv.reemplazar(cadena);
       System.out.println(cadena.getFrase());
        System.out.println("Ingrese un caracter para saber si esta dentro de la frase: ");
        if(serv.contiene(cadena, leer.next())){
            System.out.println("LA cadena contiene el caracter");
        }
        else{
            System.out.println("La cadena NO contiene el caracter");
        }
    }
}



   

