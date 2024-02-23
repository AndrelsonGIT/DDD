package org.example;

import org.example.model.GitHubUser;
import org.example.service.DataBase;
import org.example.service.GitHubFetcher;
import org.json.JSONObject;

import java.util.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        GitHubFetcher gitService = new GitHubFetcher();
        List<GitHubUser> userList = new ArrayList<>();
        DataBase database = new DataBase(userList);

        System.out.println("Bem vindo ao programa github");
        System.out.println("Digite a opção desejada");
        System.out.println("1. Inserir");
        System.out.println("2. Editar");
        System.out.println("3. Excluir");
        System.out.println("4. Consultar");

        System.out.println("Digite a opção desejada: ");
        int userOption = ler.nextInt();
        //TODO: FAZER ISSO TUDO AQUI
        if(userOption == 1){
            System.out.println("Qual o nome do github do usuário?");

            gitService.findGitHubUser()

        }
        else if(userOption == 2){
            System.out.println("Digite o nome do usuario ");
            String userToBeEdited = ler.next();
            userList.stream().filter(user-> user.getName().equals(userToBeEdited)).findFirst();
        }
    }
}