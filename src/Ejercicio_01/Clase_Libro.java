/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_01;

/**
 *
 * @author Gisella
 */
public class Clase_Libro {
    int ISBN;
    String Título;
    String Autor;
    int Numpaginas;

    public Clase_Libro() {
    }

    public Clase_Libro(int ISBN, String Título, String Autor, int Numpaginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Numpaginas = Numpaginas;
        
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumpaginas() {
        return Numpaginas;
    }

    public void setNumpaginas(int Numpaginas) {
        this.Numpaginas = Numpaginas;
    }



}
