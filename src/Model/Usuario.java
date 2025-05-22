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
    private int userId;
    
    public Usuario(String nome, String username, String senha, int userId){
        super(nome);
        this.username = username;
        this.senha = senha;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public int getUserId() {
        return userId;
    }
    
    public void setUsername(String username) {
        this.username = username;
        
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    @Override
    
    public String toString() {
        return "Username: [" + username + " | Senha: " + senha;

    }
}
