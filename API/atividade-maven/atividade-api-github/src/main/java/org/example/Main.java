package org.example;

import org.example.model.GitHubUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GitHubFetcher gitHubFetcher = new GitHubFetcher();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do usuario do github");
        String username = ler.next();

        GitHubUser gitHubUser =  gitHubFetcher.searchUser(username);
        if(gitHubUser!= null){
            System.out.println("Usuário: "+gitHubUser.getName());
            System.out.println("Qtd seguidores: "+gitHubUser.getFollowers());
            System.out.println("Qtd repositorios: "+gitHubUser.getPublic_repos());
        }
        else{
            System.out.println("Usuário não encontrado!");
            System.out.println("potato");
        }
    }
}