/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_04;

import java.util.Scanner;

/**
 *La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author Gisella
 */
public class Servicios {
   Rectangulo rec = new Rectangulo();
   Scanner leer = new Scanner(System.in);
   
   public void CrearRectangulo(){
       System.out.println("Ingrese la base del rectángulo");
       rec.setBase(leer.nextInt());
       System.out.println("Ingrese la altura del rectángulo");
       rec.setAltura(leer.nextInt());
  
}
  public void CalcularSuperficie(){
       int superficie = rec.getBase() * rec.getAltura();
      System.out.println("el resultado de la superficie de su rectangulo es: " + superficie);
  }
   
   public void CalcularPerimetro(){
       int perimetro = ((rec.getBase() + rec.getAltura()) * 2);
       System.out.println("el resultado del perímetro de su rectángulo es: " + perimetro);
   }
   
   public void DibujarRectangulo(){
       System.out.println("El rectángulo dibujado es: ");
       for (int i = 0; i < rec.getBase(); i++) {
           for (int j = 0; j < rec.getAltura(); j++) {
               System.out.print("*");   
           }
           System.out.println();
       }
       System.out.print("");
   }
   
}
