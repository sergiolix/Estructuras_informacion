/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;


public class fecha {

    int dia;
    int mes;
    int ano;

    public fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        } else {
            System.out.println("no es valido el dato");
        }
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else {
            System.out.println("no es valido el dato");
        }
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("el dato no es valido");
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
