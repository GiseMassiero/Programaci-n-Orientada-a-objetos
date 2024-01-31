/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_06;

import java.util.Scanner;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 * @author Gisella
 */
public class servicios {
    
    Cafetera cafetera = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera() {
        System.out.println("ingrese la capacidad máxima de la cafetera");
        cafetera.setCapacidadMaxima(leer.nextDouble());
        System.out.println("ingrese la cantidad actual de café en la cafetera");
        cafetera.setCantidadActual(leer.nextDouble());
        if (cafetera.getCantidadActual() < cafetera.getCapacidadMaxima()) {
            double llenar = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
            System.out.println("su cafetera se llenó con " + llenar + "ml de café, quedando igual a su capacidad máxima " );
     
        }
    }

    public void servirTaza() {
        System.out.println("Ingrese la capacidad de la taza vacía: ");
        int tazaVacia = leer.nextInt();
        System.out.println("ingrese la cantidad que desea servir en la taza: ");
        int llenado = leer.nextInt();
        if (llenado < tazaVacia) {
            int suma = tazaVacia + llenado;
            System.out.println("no alcanza para llenar la taza");
        } else if (llenado == tazaVacia) {
            System.out.println("se llenó la taza completamente");
        } else {
            System.out.println("la cantidad que sedea ingresar supera la capacidad de la taza");
        }
    }

    public void VaciarCafetera() {
        Double vacia = cafetera.getCantidadActual() - cafetera.getCantidadActual();
        System.out.println("si Cafetera tiene " + vacia + " ml de Café");

    }

    public void AgregarCafe() {
        System.out.println("ingrese la cantidad de café que desea agregar: ");
        cafetera.setCantidadActual(leer.nextDouble());
        System.out.println("su cafetera tiene : " + cafetera.getCantidadActual() + " ml de café");
    }
    
    public void Menu(){
      Scanner leer = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("ingrese la opción que desea realizar");

            System.out.println("1. Servir Taza");
            System.out.println("2. Vaciar Cafetera");
            System.out.println("3. Agregar café");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                 servirTaza() ;
                    break;

                case 2:
                   VaciarCafetera() ;
                    break;
                case 3:
                   AgregarCafe();
                    break;
            
                default: {
                    System.out.println("La opcion ingresada no es valida, intente nuevamente...");
                    System.out.println();
                    break;
                }
                
            } 
          
        } 
        while (opcion < 3 && opcion > 1);
    }
    
}

