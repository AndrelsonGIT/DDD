package org.salesforce.service;

import org.salesforce.connection.OracleDBConnection;
import org.salesforce.dao.Dao;
import org.salesforce.model.Usuario;
import org.salesforce.model.pedido.Pedido;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class PedidoService {

    private DataRegional dataRegional;

    public PedidoService(DataRegional dataRegional) {
        this.dataRegional = dataRegional;
    }

    public void inserirPedido(Pedido pedido){
        Connection connection = OracleDBConnection.getConnection();
        try {
            Statement statement =  connection.createStatement();


            String query = String.format(
                    "insert into tb_pedido(id_pedido, id_usuario, data_pedido, status) " +
                            "values (%s, %s, to_date(%s, 'DD/MM/YYYY HH24:MI:SS'),%s) ",pedido.getId(),
                    pedido.getIdUsuario(),
                    dataRegional.converterParaFormatoBrasileiro(pedido.getDataPedido()),
                    pedido.getStatusPedido()) ;

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

    public void atualizarUsuario(Usuario usuario){
        Connection connection = OracleDBConnection.getConnection();

        Optional<Usuario> optionalUsuario =  acharUsuario(usuario.getId());

        if(optionalUsuario.isEmpty()){
            return;
        }else{
            try {
                Statement statement =  connection.createStatement();

                String query = String.format("update tb_usuario set values email ",usuario.getNome(),
                        usuario.getSobrenome(),
                        usuario.getEmail(),
                        usuario.getSenha()) ;

                ResultSet resultSet = statement.executeQuery(query);
                statement.executeUpdate(query);

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


    }

    public Optional<Usuario> acharUsuario(int usuarioId){
        String query = String.format("select * from tb_usuario where id=%d", usuarioId);
        ResultSet resultSet=  Dao.selectCommand(query);

        try {
            if(resultSet.next()) {
                int idUsuario = resultSet.getInt("id_usuario");
                String nomeUsuario = resultSet.getString("nome");
                String sobrenomeUsuario = resultSet.getString("sobrenome");
                String emailUsuario = resultSet.getString("email");
                String senhaUsuario = resultSet.getString("senha");

                Usuario usuario = new Usuario(idUsuario, nomeUsuario, sobrenomeUsuario, emailUsuario, senhaUsuario);

                return Optional.of(usuario);
            }else{
                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
