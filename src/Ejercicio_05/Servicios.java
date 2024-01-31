/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_05;

import java.util.Scanner;

/**
 *
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 * @author Gisella
 */
public class Servicios {
    Cuenta cuenta = new Cuenta();
    Scanner leer = new Scanner(System.in);
    
    public void crearCuenta(){
        System.out.println("Ingrese su numero de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su numero de dni: ");
        cuenta.setDni(leer.nextLong());
        System.out.println("ingrese su saldo actual");
        cuenta.setSaldoActual(leer.nextInt());
    }
    
    public void IngresarDinero(){
        System.out.println("ingrese el valor del dinero que desea ingresar: ");
        double ingreso = leer.nextDouble();
        double suma = cuenta.getSaldoActual() + ingreso;
        System.out.println("Su saldo actual es: " + suma);
    }
    public void RetirarDinero(){
         System.out.println("ingrese el valor del dinero que desea  retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("la cantidad ingresada supera el límite.");
        } else{
          double resta = cuenta.getSaldoActual() - retiro;
        System.out.println("Su saldo actual es:  " + resta);          
        }   
    }
    public void extraccionRapida(){
        System.out.println("usted puede retirar de manera rápida el 20% de su saldo actual:");
        System.out.println("su saldo actual es: "+ cuenta.getSaldoActual());
       double extraccion = (cuenta.getSaldoActual() - 0.2);
        System.out.println("Su saldo actual es:  " + extraccion);
    }
    public void ConsultarSaldo(){
        System.out.println("su saldo es: " + cuenta.getSaldoActual());
    }
    
    public void ConsultarDatos(){
        System.out.println("sus datos son:  dni:  " + cuenta.getDni()+ "  Numero de cuenta:  " + cuenta.getNumeroCuenta());
    }
    
    public void Menu(){
      Scanner leer = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("ingrese la operación que desea realizar");

            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extracción rápida (20%)");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6.salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                   IngresarDinero();
                    break;

                case 2:
                    RetirarDinero();
                    break;
                case 3:
                  extraccionRapida();
                    break;
                case 4:
                    ConsultarSaldo();
                    break;
                case 5: 
                    ConsultarDatos();
                    break;
                default: {
                    System.out.println("La opcion ingresada no es valida, intente nuevamente...");
                    System.out.println();
                    break;
                }
                
            } 
          
        } 
        while (opcion < 6 && opcion > 1); 
    }
 }
    
    

