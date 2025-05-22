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
    private int musicaId;

    public Musica(String titulo, String genero, int minutos, int segundos, int musicaId){
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMin = minutos;
        this.duracaoSeg = segundos;
        this.musicaId = musicaId;
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

    public int getMusicaId() {
        return musicaId;
    }

    public void setMusicaId(int musicaId) {
        this.musicaId = musicaId;
    }
    
    @Override
    public String toString(){
        return titulo + "| Gênero: " + genero + " | Duração: " + duracaoMin +
                ":" + duracaoSeg;
    }
}
