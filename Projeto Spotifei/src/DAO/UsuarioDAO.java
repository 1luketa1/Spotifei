/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import Model.Usuario;

/**
 *
 * @author Lucas
 */
public class UsuarioDAO {
    private Connection conn;
    
    public UsuarioDAO(Connection conn){
        this.conn = conn;
    }
        public ResultSet consultar(Usuario user) throws SQLException{
            String sql = "select * from usuario where pessoa_id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, user.getPessoaId());
            statement.execute();
            ResultSet resultado = statement.getResultSet();
            return resultado;
        }
        
        public void inserir(Usuario user) throws SQLException{
            String sqlPessoa = "insert into pessoa (id, nome) values (?, ?)";
            String sqlUsuario = "insert into user (pessoa_id, username, senha)" +
                                " values (?, ?, ?)";
            try{
                PreparedStatement statemPessoa = conn.prepareStatement(sqlPessoa);
                statemPessoa.setInt(1, user.getPessoaId());
                statemPessoa.setString(2, user.getNome());
                statemPessoa.executeUpdate();
                
                PreparedStatement statemUsuario = conn.prepareStatement(sqlUsuario);
                statemUsuario.setInt(1,user.getPessoaId());
                statemUsuario.setString(2,user.getUsername());
                statemUsuario.setString(3,user.getSenha());
                statemUsuario.executeUpdate();
            } finally {
                conn.close();
            }
        }
    public void atualizar(Usuario user) throws SQLException{
        String sqlPessoa = "update pessoa set (id, nome) where values (?, ?)";
        String sqlUsuario = "update usuario set (pessoa_id, username, senha)" +
                             " where values (?, ?, ?)";
        try{
            PreparedStatement statemPessoa = conn.prepareStatement(sqlPessoa);
            statemPessoa.setInt(1, user.getPessoaId());
            statemPessoa.setString(2, user.getNome());
            statemPessoa.executeUpdate();
        
            PreparedStatement statemUsuario = conn.prepareStatement(sqlUsuario);
            statemUsuario.setInt(1, user.getPessoaId());
            statemUsuario.setString(2, user.getUsername());
            statemUsuario.setString(3, user.getSenha());
            statemUsuario.executeUpdate();
        } finally{
            conn.close();
        }
    }
    
    public int gerarNovoIdPessoa() throws SQLException {
        String sql = "select max(id) as max_id from pessoa";
        PreparedStatement statem = conn.prepareStatement(sql);
        ResultSet rs = statem.executeQuery();
        if (rs.next()) {
            return rs.getInt("max_id") + 1;
        } else {
            return 1;
        }
    }
        
}
