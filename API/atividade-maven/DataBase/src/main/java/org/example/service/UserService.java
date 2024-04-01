package org.example.service;

import org.example.model.User;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {

    private OracleConnection oracleConnection;

    public UserService(OracleConnection oracleConnection) {
        this.oracleConnection = oracleConnection;
    }

    public void addUser(User user){
        Connection conn = oracleConnection.connectToDatabase();

        try {

            String query = String.format("insert into tb_usuario(id, nome) values (%s, '%s')", user.getId(), user.getNome());

            Statement statement = conn.createStatement();
            statement.executeQuery(query);

            System.out.println("Usuário criado com sucesso");

        } catch (SQLException e) {
            System.out.println(e);
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void listarUsuario(){

        Connection conn = oracleConnection.connectToDatabase();

        try{
            String query = "select * from tb_usuario";

            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                System.out.println("--------------");
                System.out.println("Id usuario: "+rs.getString("id"));
                System.out.println("Nome usuario" + rs.getString("nome"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void update(User user){
        Connection conn = null;
        try{
            conn = oracleConnection.connectToDatabase();

            Statement statement = conn.createStatement();

            String query =  String.format("select nome from tb_usuario where id=%s", user.getId());
            ResultSet rs = statement.executeQuery(query);
            if(!rs.isBeforeFirst()){
                System.out.println("Nenhum usuário com o id encontrado");
            } else{
                query = String.format("UPDATE tb_usuario SET nome = '%s' where id=%s", user.getNome(), user.getId());
                statement.executeQuery(query);
                System.out.println("Query de atualização executada com sucesso");
            }

        } catch (SQLException e) {
            System.out.println("Ocorreu um erro: "+e);
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void remove(User user){
        Connection conn = null;
        try{
            conn = oracleConnection.connectToDatabase();
            Statement statement = conn.createStatement();

            String query = String.format("delete from tb_usuario where id=%s", user.getId());
            System.out.println("Uma linha antes de executa a query");
            statement.executeQuery(query);
            System.out.println("Uma linha depois de executar a query");

            System.out.println("Usuário removido com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
