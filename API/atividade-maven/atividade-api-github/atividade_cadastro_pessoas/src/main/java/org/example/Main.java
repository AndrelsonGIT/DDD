package org.example;

import org.example.model.Endereco;
import org.example.model.User;
import org.example.service.ViaCepService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cria o objeto viacepService
        ViaCepService viaCepService = new ViaCepService();
        //Cria o objeto Scanner
        Scanner ler = new Scanner(System.in);
       try{
           System.out.println("Digite o seu nome");
           String nomeUsuario = ler.next();

           System.out.println("Digite o seu email");
           String emailusuario = ler.next();

           System.out.println("Qual o seu cep?");
           //pega o cep do usuario
           String usuarioCep = ler.next();

           System.out.println("Qual o numero da sua casa?");
           String numeroCasaUsuario = ler.next();

           System.out.println("Qual o seu complemento");
           String usuarioComplemento = ler.next();


           //Executa o metodo do viaCepService findAddress para retornar um objeto do tipo
           //endereco populado de acordo com o cep digitado pelo usuario
           Endereco enderecoUsuario = viaCepService.findAdress(usuarioCep);

           //Cria o objeto user passando parametros como o nome do usuario, email, objeto endereço e afins....
           User user = new User(nomeUsuario,emailusuario, enderecoUsuario, numeroCasaUsuario, usuarioComplemento);
           System.out.println();
       }
       catch (IOException exception){
           System.out.println("opa deu um erro de ioexception");
       }
    }
}