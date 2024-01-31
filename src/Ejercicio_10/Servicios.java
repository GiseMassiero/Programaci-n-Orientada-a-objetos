/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

import java.util.Arrays;

/**
 *Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 * @author Gisella
 */
public class Servicios {
    Arreglos arreglo = new Arreglos();
    
 
    public void llenarArreglo(int[] arregloA, int[] arregloB) {

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int) (Math.random() * (15 - 1 + 1) + 1);
        }

        arreglo.setArregloA(arregloA);

        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = (int) (Math.random() * (15 - 1 + 1) + 1);
        }
        arreglo.setArregloB(arregloB);
    }

    public void mostrarArreglo(int[] arregloA, int[] arregloB) {

        System.out.println("Arreglo A: " + Arrays.toString(arregloA));
        System.out.println();
        System.out.println("Arreglo B: " + Arrays.toString(arregloB));
    }

}
