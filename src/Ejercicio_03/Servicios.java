/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_03;

import java.util.Scanner;

/**
 *Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 * @author Gisella
 */
public class Servicios {
    Operacion op = new Operacion();
    Scanner leer= new Scanner(System.in);
    
    public void crearOperacion(){
        System.out.println("Ingrese el número 1: ");
        op.setNum1(leer.nextInt());
        System.out.println("Ingrese el numero 2: ");
        op.setNum2(leer.nextInt());
        
    }
    public void Sumar() {
        int suma = op.getNum1() + op.getNum2();
        System.out.println("el resultado de la suma es: " + suma);
    }

    public void Restar() {
        int resta = op.getNum1() - op.getNum2();
        System.out.println("el resultado de la resta es: " + resta);
    }

    public void Multiplicar() {
        if (op.getNum1() == 0 || op.getNum2() == 0) {
            System.out.println("error su operación no es válida");
        } else {
            int multiplicacion = op.getNum1() * op.getNum2();
            System.out.println("el resultado de la multiplicación es: " + multiplicacion);
        }
    }
       

    public void Dividir(){
        if (op.getNum1() == 0 || op.getNum2() == 0) {
            System.out.println("error su operación no es válida");
        } else {
            double division = op.getNum2() / op.getNum1();
            System.out.println("el resultado de la division es: " + division);
        }

    }
    
    public void MostrarMenu(){
        
             Scanner leer = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("ingrese la operación que desea realizar");

            System.out.println("1.sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Sumar();
                    break;

                case 2:
                    Restar();
                    break;
                case 3:
                    Multiplicar();
                    break;
                case 4:
                    Dividir();
                    break;
                default: {
                    System.out.println("La opcion ingresada no es valida, intente nuevamente...");
                    System.out.println();
                    break;
                }
                
            } 
          
        } 
        while (opcion < 4 && opcion > 1); 
    }
}

 

