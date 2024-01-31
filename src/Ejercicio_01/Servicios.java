/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author Gisella
 */
public class Servicios {
    Clase_Libro libros = new Clase_Libro();
    
Scanner leer = new Scanner(System.in);
  
public void CargarLibros(){
    
    System.out.println(" ingrese el titulo del libro: ");
    libros.setTítulo(leer.nextLine());
    System.out.println(" Ingrese el autor del libro: ");
    libros.setAutor(leer.nextLine());
    System.out.println("Ingrese la cantidad de paginas:  ");
    libros.setNumpaginas(leer.nextInt());
    System.out.println("Ingrese el número  ISBN del libro: ");
    libros.setISBN(leer.nextInt());

      
   }

public void MostrarLibro(){
    System.out.println("su libro es:  "+ libros.getTítulo() + " , Su autor es: " + libros.getAutor() + " la cantidad de páginas que tiene es:  " + libros.getNumpaginas() + ", el número de ISBN es:  " + libros.getISBN());
    
}
}

