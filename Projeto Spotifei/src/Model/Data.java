/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifldotzlaw
 */
public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        //Quero fazer as datas certas (meses c/30, 31 e 28 dias), então vou 
        //ajustar esse tipo de coisa dentro da aplicação principal
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }
    
    
}
