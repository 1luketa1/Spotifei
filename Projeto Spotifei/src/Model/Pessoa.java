/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifldotzlaw
 */
public abstract class Pessoa {
    private String nome;
    private Data dataNascimento;
    
    public Pessoa(String nome, Data dataNasc){
        this.nome = nome;
        this.dataNascimento = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Data de nascimento: "
               + dataNascimento.toString();
    }
    
    
}
