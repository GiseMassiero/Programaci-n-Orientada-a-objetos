/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_02;

import java.util.Scanner;

/**
 *) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 * @author Gisella
 */
public class Servicios {
    Circunferencia Circ = new Circunferencia();
    
    Scanner leer= new Scanner(System.in);
    Double π = 3.1416;
   
    public void CrearCincunferencia(){
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        Circ.setRadio(leer.nextDouble());
        
    }
    
        
    public void Area(){
     Double Area = ( (Circ.getRadio()*2)* π);
        System.out.println("el área de la circunferencia es: "+ Area);
        }
    public void Perimetro(){
        Double Perimetro = (2 * π * Circ.getRadio());
        System.out.println("el perímetro de la circunferencia es: " + Perimetro);
    }
}

    

