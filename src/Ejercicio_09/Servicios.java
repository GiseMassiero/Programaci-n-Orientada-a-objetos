/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_09;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;



/**
 *Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * @author Gisella
 */
public class Servicios {
    Matematica mat = new Matematica();

 int  numeroMayor = max(mat.getNum1(), mat.getNum2());
 int numeroMenor = min(mat.getNum1(), mat.getNum2());
       
    public void devolverMayor(){
        
        System.out.println("sus números son: " + mat.getNum1()+ "," +  mat.getNum2() );
        System.out.println ("el número mayor es: " + numeroMayor);
  
    }
    
    public void calcularPotencia(){
    
       int potencia = (int) pow( numeroMayor, numeroMenor);
            System.out.println("la potencia entre ambos numeros es: "+ potencia);
          
    }
 
    public void calcularRaiz(){
        
      int abs = abs(numeroMenor);
      double raiz = sqrt(abs);
        System.out.println("la raíz cuadrada del número menor es: " + raiz);
    }


}
