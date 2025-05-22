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
    private String senha;
    
    public Usuario(String nome, int pessoaId, String username, String senha){
        super(nome, pessoaId);
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setUsername(String username) {
        this.username = username;
        
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    
    public String toString() {
        return "Username: [" + username + " | Senha: " + senha;

    }
}
