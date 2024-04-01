package org.example.service;

import org.example.model.Aluno;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoService {

    private OracleConnection oracleConnection;

    public AlunoService(OracleConnection oracleConnection) {
        this.oracleConnection = oracleConnection;
    }

    public void adicionarAluno(Aluno aluno){
        Connection connection = oracleConnection.connectToDatabase();
        try {
            Statement statement = connection.createStatement();

            String query = String.format("insert into tb_aluno(idaluno, nome, ra, curso) values (%s, '%s', '%s','%s')", aluno.getId(), aluno.getNome(), aluno.getRa(), aluno.getCurso());
            ResultSet rs =  statement.executeQuery(query);


            System.out.println("Usuário cadastrado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void listarAlunos(){
        Connection connection = oracleConnection.connectToDatabase();
        try{
            Statement statement = connection.createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
