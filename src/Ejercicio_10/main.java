/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

import java.util.Arrays;

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
  Servicios serv = new Servicios();
        // Crear un arreglo de tipo double llamado arregloA con longitud 50
        int[] arregloA = new int[50];

        // Crear un arreglo de tipo double llamado arregloB con longitud 20
       int[] arregloB = new int[20];

        // Llenar los arreglos arregloA y arregloB con valores aleatorios
        serv.llenarArreglo(arregloA, arregloB);

        // Mostrar los arreglos arregloA y arregloB en la consola
        serv.mostrarArreglo(arregloA, arregloB);

        System.out.println();

        // Ordenar el arregloA en orden ascendente
        Arrays.sort(arregloA);

        // Crear un nuevo arreglo llamado arregloAux que contiene los primeros 10
        // elementos de arregloA
        int[] arregloAux = Arrays.copyOf(arregloA, 10);

        // Copiar los elementos de arregloAux al inicio de arregloB
        System.arraycopy(arregloAux, 0, arregloB, 0, 9);

        // Llenar los últimos elementos de arregloB (desde el índice 10 hasta el final)
        // con el valor 0.5
        Arrays.fill(arregloB, 10, arregloB.length, (int) 0.5);

        // Mostrar el contenido de arregloA en la consola
        System.out.println("Arreglo A: " + Arrays.toString(arregloA));

        System.out.println();

        // Mostrar el contenido de arregloB en la consola
        System.out.println("Arreglo B: " + Arrays.toString(arregloB));
    }
    
}
