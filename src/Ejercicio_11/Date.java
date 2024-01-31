/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;

/**
 *
 * @author Gisella
 */
public class Date {
    int dia;
     int mes;
     int annio;

    public Date() {
    }

    public Date(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    @Override
    public String toString() {
        return "Date{" +  + dia + "/" + mes + "/" + annio + '}';
    }
     
}
