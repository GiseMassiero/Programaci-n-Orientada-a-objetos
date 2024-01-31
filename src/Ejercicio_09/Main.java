/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_09;




/**
 *set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) 
 * @author Gisella
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Matematica matematica = new Matematica();
            Servicios serv = new Servicios();
          
           matematica.setNum1((int) (Math.random() *100));
          matematica.setNum2((int) (Math.random() *100));
      
        //System.out.println("sus números son: " + matematica.getNum1()+ "," +  matematica.getNum2() );  
        
 serv.devolverMayor();
 serv.calcularPotencia();
 serv.calcularRaiz();

    }
    
    
}
