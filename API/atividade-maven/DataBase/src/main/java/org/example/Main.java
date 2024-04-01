package org.example;

import org.example.model.Aluno;
import org.example.model.User;
import org.example.service.AlunoService;
import org.example.service.OracleConnection;
import org.example.service.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OracleConnection oracleConnection = new OracleConnection();

        UserService userService = new UserService(oracleConnection);
        AlunoService alunoService = new AlunoService(oracleConnection);
//        User user = new User(3, "Joseffe 3");

//        userService.addUser(user);
//        userService.listarUsuario();
//
//        user.setNome("Josué");
//        userService.update(user);
//        userService.listarUsuario();
//
//        userService.remove(user);

        Aluno aluno = new Aluno(1, "andrelson", "434343", "ciência da computação");
        alunoService.adicionarAluno(aluno);
    }
}