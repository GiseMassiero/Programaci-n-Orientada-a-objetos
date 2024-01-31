/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_08;

import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 * @author Gisella
 */
public class Servicios {
Cadena cadena = new Cadena();
Scanner leer = new Scanner(System.in);

public void mostrarVocales(){
        System.out.println("la longitud de la frase es: " + cadena.getFrase().length());
        int contador = 0;
        
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char c = Character.toLowerCase(cadena.getFrase().charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
            System.out.println("La frase tiene " + contador + " vocal(es).");
        }
    }

       
public void InvertirFrase(){
          StringBuilder inversa = new StringBuilder(cadena.getFrase());
        String invertida = inversa.reverse().toString();
        System.out.println("La frase invertida es " + invertida);
        
    }
     public int mostrarVocales(Cadena cadena) {
        int cant = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            switch (cadena.getFrase().substring(i, i + 1).toLowerCase()) {
                case ("a"):
                    System.out.print(cadena.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("e"):
                    System.out.print(cadena.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("i"):
                    System.out.print(cadena.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("o"):
                    System.out.print(cadena.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;
                case ("u"):
                    System.out.print(cadena.getFrase().substring(i, i + 1) + " ");
                    cant++;
                    break;

            }
        }
        System.out.println("");
        return cant;
    }

    public void invertirFrase(Cadena cadena) {
        String mycad = "";
        for (int i = (int) (cadena.getLongitud() - 1); i >= 0; i--) {

            mycad += cadena.getFrase().substring(i, i + 1);
        }
        cadena.setFrase(mycad);

    }

    public int vecesRepetido(Cadena cadena, String letra) {
        int cant = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cant++;
            }
        }
        return cant;

    }

    public boolean compararLongitud(Cadena cad, String frase) {
        return cadena.getLongitud() == frase.length();
    }
    public void unirFrases(Cadena cad, String frase){
        cad.setFrase(cad.getFrase().concat(frase));
        cad.setLongitud(cad.getFrase().length());
        
    }
    public void reemplazar(Cadena cad){
        String aux="";
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().substring(i, i + 1).equalsIgnoreCase("a")){
                aux+="#";}
                else {
                        aux+=cad.getFrase().substring(i, i + 1);
                        }    
                
            }
          cad.setFrase(aux);  
        }
    public boolean contiene(Cadena cad, String letra){
        if (cad.getFrase().contains(letra)){
            return true;
        }else{
            return false;
        }
        
    }
    

}
        


