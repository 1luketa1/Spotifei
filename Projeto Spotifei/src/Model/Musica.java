/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifldotzlaw
 */
public class Musica {
    private String titulo;
    private String genero;
    private int duracaoMin;
    private int duracaoSeg;
    private Data dataLancada;
    private boolean single;

    public Musica(String titulo, String genero, int minutos, int segundos, Data dataLancamento, boolean single){
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMin = minutos;
        this.duracaoSeg = segundos;
        this.dataLancada = dataLancamento;
        this.single = single;
        //preciso descobrir como fazer mais de uma música por álbum de forma
        //dinâmica, não acho que dá pra fazer arraylist
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public int getDuracaoSeg() {
        return duracaoSeg;
    }

    public void setDuracaoSeg(int duracaoSeg) {
        this.duracaoSeg = duracaoSeg;
    }

    public Data getDataLancada() {
        return dataLancada;
    }

    public void setDataLancada(Data dataLancada) {
        this.dataLancada = dataLancada;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
    
    @Override
    public String toString(){
        return titulo + "| Gênero: " + genero + " | Duração: " + duracaoMin +
                ":" + duracaoSeg + " | Data de Lançamento: " + dataLancada;
    }
    //Quando descobrir como fazer Álbum, ponho aqui
}
