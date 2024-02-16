package org.example;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearcherCep searcherCep = new SearcherCep();
        System.out.println("Hello world!");
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um cep");
        String enderecoUser = ler.next();

        Endereco endereco = searcherCep.findEnderco(enderecoUser);
        if(endereco == null){
            System.out.println("CEP NÂO ENCONTRADO");
        }
        else{
            System.out.println(endereco.getUf());
            System.out.println(endereco.getBairro());
            System.out.println(endereco.getCep());
            System.out.println(endereco.getGia());
            System.out.println(endereco.getComplemento());
            System.out.println(endereco.getLogradouro());
            System.out.println(endereco.getSiafi());
        }

    }


}