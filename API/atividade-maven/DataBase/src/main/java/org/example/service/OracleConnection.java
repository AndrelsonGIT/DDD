package org.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

    public Connection connectToDatabase(){

        Connection conn = null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager
                    .getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                            "rm552639",
                            "241104");
            if(conn != null)
                System.out.println("Conexão efetuadada com sucesso");
            else
                System.out.println("Falha na conexão com o Banco de Dados");


        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return conn;
    }
}
