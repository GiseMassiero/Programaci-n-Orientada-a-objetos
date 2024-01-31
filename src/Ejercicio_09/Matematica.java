/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_09;

/**
 *Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
//Math.random para generar los dos números y se guardaran en el objeto con su 
//respectivos set
 * @author Gisella
 */
public class Matematica {
    int num1;
    int num2;

    public Matematica() {
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
  // public void Sumar(){
       //int suma = num1 + num2;
       //System.out.println(suma);
   //}
}
