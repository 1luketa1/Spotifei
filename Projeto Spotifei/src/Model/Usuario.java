/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifldotzlaw
 */
public class Usuario extends Pessoa{
    private String username;
    
    public Usuario(String nome, Data dataNascimento, String username){
        super(nome, dataNascimento);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    
    public String toString() {
        return "Username: [" + username + " | Data de Nascimento: "
                + super.getDataNascimento().toString() + "]";

    }
}
