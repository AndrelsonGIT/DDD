package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class ExercicioAula {

    public void exercicio01(){
        Scanner ler = new Scanner(System.in);
        HashMap<Integer, Cliente> map = new HashMap<>();

        System.out.println("CADASTRO CONTA BANCARIA");

        while(true){
            int id = 1;
            System.out.println("Qual o seu nome?");
            String nome = ler.next();
            System.out.println("Qual a sua idade");
            int idade = ler.nextInt();

            System.out.println("Qual o seu email");
            String email = ler.next();

            System.out.println("Possui conta bancaria? (s/n)");
            String opcao = ler.next();
            Cliente cliente = null;

            if(opcao.equalsIgnoreCase("s")){
                System.out.println("Qual a agencia");
                String agencia = ler.next();

                System.out.println("Qual o numero");
                String numero = ler.next();

                System.out.println("Qual o seu saldo?");
                double saldo = ler.nextDouble();
                ContaBancaria contaBancaria = new ContaBancaria(agencia, numero, saldo);
                cliente = new Cliente(id, nome, idade, email, contaBancaria);
                // instancia o objeto pessoa aqui
            }else{
                cliente = new Cliente(id, nome, idade, email);
            }

            map.put(id, cliente);
            System.out.println("Deseja continuar? (s/n)");
            String continuar = ler.next();

            if(continuar.equalsIgnoreCase("n")){
                break;
            }
        }

        System.out.println("Mostrando todos os clientes");
        map.forEach((id, cliente)->{
            System.out.println("-----");
            System.out.println("Cliente numero: " + id);
            System.out.println("Cliente "+cliente.exibirNomeIdade());
            System.out.println("Cliente email: " + cliente.getEmail());


            if(cliente.getContaBancaria() != null){
                System.out.println("Cliente numero agencia: " + cliente.getContaBancaria().getAgencia());
                System.out.println("Cliente número conta: "+cliente.getContaBancaria().getNumero());
                System.out.println("Cliente saldo na conta: "+cliente.getContaBancaria().getSaldo());
            }

            System.out.println("-----");
        });

    }
}
