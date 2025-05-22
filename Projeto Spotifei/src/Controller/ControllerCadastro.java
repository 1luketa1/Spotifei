/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.Conexao;
import View.TelaCadastro;
import javax.swing.JOptionPane;
import Model.Usuario;
import java.sql.SQLException;
import java.sql.Connection;
import DAO.UsuarioDAO;

/**
 *
 * @author Lucas
 */
public class ControllerCadastro {
    private TelaCadastro view;
    
    public ControllerCadastro(TelaCadastro view){
        this.view = view; 
    }

    public void salvarUsuario(){
        String nome = view.getTxtNomeCadastrar().getText();
        String username = view.getTxtUsernameCadastrar().getText();
        String senha = view.getTxtSenhaCadastrar().getText();
        
        try{
            Connection conn = new Conexao().getConnection();
            UsuarioDAO usuarioDAO = new UsuarioDAO(conn);
            int pessoaId = usuarioDAO.gerarNovoIdPessoa();
            
            Usuario user = new Usuario(nome, pessoaId, username, senha);
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.inserir(user);
            JOptionPane.showMessageDialog(view, "Usuário Cadastrado!",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(view, "Usuário não cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

}
}
