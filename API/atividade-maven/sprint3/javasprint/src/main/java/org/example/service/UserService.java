package org.example.service;

import org.example.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {

    OracleConnection oracleConnection;

    public UserService(OracleConnection oracleConnection) {
        this.oracleConnection = oracleConnection;
    }


    //TODO:
    public void insertUser(User user){
        Connection connection =  oracleConnection.connect();
        try {
            Statement statement =  connection.createStatement();

            String query= String.format("insert into tb_usuario(idusuario, nome, sobrenome, email, senha, deficiencia  values (%s, %s,%s, %s)",
                                                    user.getNome(), user.getSobrenome(), user.getEmail(), user.getSenha(), user.getDeficiencia();
            ResultSet resulsSet =  statement.executeQuery(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
