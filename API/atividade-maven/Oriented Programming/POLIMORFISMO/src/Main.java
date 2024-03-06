import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CADASTRO DE CLIENTES");
        Scanner ler = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();

        int contador = 1;
        while(true){
            Cliente cliente = null;
            Conta conta = null;
            System.out.println("Escolha a opção desejada");
            //TODO: TERMINAR A IMPLEMENTAÇÃO DO CRUD
            System.out.println("1. Adicionar\n" +
                    "2. Mostrar todos os clientes\n" +
                    "3. Atualizar cliente\n" +
                    "4. Remover cliente");
            System.out.println("");
            System.out.println("Qual o seu nome?");
            String nome = ler.next();

            System.out.println("Qual a sua idade");
            int idade = ler.nextInt();
            System.out.println("Sua conta é do tipo Poupança ou Corrente? (p/c)");
            String tipoConta = ler.next();

            conta = ContaFactory.create(tipoConta);

            System.out.println("Qual o nome do seu banco?");
            conta.setNome(ler.next());

            System.out.println("Qual a agencia da sua conta?");
            conta.setAgencia(ler.next());

            System.out.println("Qual o número da sua conta?");
            conta.setNumero(ler.next());

            System.out.println("Valor inicial a ser depositado");
            conta.depositar(ler.nextDouble());

            cliente = new Cliente(nome, idade, conta);
            clienteServicewer
        }

    }
}























