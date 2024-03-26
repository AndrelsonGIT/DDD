package org.salesforce.service;

import org.salesforce.model.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {
    private OracleConnection oracleConnection;

    public UserService(OracleConnection oracleConnection) {
        this.oracleConnection = oracleConnection;
    }

   public void inserirUsuario(Usuario usuario){
       Connection connection = oracleConnection.getConnection();
       try {
           Statement statement =  connection.createStatement();

           String query = String.format("insert into tb_usuario(nome, sobrenome, email, senha) values (%s, %s, %s,%s) ",usuario.getNome(),
                   usuario.getSobrenome(),
                   usuario.getEmail(),
                   usuario.getSenha()) ;

           ResultSet resultSet =  statement.executeQuery(query);
           resultSet.next();
       } catch (SQLException e) {
           System.out.println("Falha ao cadastrar o usuario");
           System.out.println(e);
       }
       finally {
           try {
               connection.close();
           } catch (SQLException e) {
               System.out.println("Falha ao fechar conexão com o banco de dados");
           }
       }
   }

   public void updateUsuario(Usuario usuario){
       Connection connection = oracleConnection.getConnection();
       try {
           Statement statement =  connection.createStatement();

           String query = String.format("update tb_usuario set values email ",usuario.getNome(),
                   usuario.getSobrenome(),
                   usuario.getEmail(),
                   usuario.getSenha()) ;

           ResultSet resultSet = statement.executeQuery(query);
           statement.executeUpdate();

           resultSet.next();
       } catch (SQLException e) {
           System.out.println("Falha ao cadastrar o usuario");
           System.out.println(e);
       }
       finally {
           try {
               connection.close();
           } catch (SQLException e) {
               System.out.println("Falha ao fechar conexão com o banco de dados");
           }
       }
   }
   
   public void acharUsuario(int usuarioId){
        Connection connection = oracleConnection.getConnection();
        try{
           Statement statement = connection.createStatement();
           String query = "";
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }
}
