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
            int opcaoDesejada = ler.nextInt();

            switch (opcaoDesejada){

                case 1:
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
                    clienteService.adicionar(cliente);
                    System.out.println("Cliente adicionar com sucesso");
                    break;
                case 2:
                    clienteService.exibirClientes();
                case 3:

                    System.out.println("Id da conta a ser alterada");
                    int idClienteParaSerAtualizado = ler.nextInt();
                    Cliente clienteParaSerAtualizado = clienteService.procurarCliente(idClienteParaSerAtualizado);
                    if (cliente == null){
                        System.out.println("Cliente não existe na base de dados");
                    }
                    else{
                        System.out.println("Se pretende mudar o nome, digite o nome, caso contrario pressione enter?");
                        String nomeAtualizado = ler.next();

                        System.out.println("Se pretende mudar a idade digite a idade, caso não queira alterar digite 0");
                        int idadeAtualizada = ler.nextInt();

                        System.out.println("Deseja atualizar a conta registrada? (s/n)" );
                        String alterarConta = ler.next();
                        Conta contaParaSerAtualizada = null;
                        if(alterarConta.equalsIgnoreCase("s")){
                            System.out.println("Sua conta é do tipo Poupança ou Corrente? (p/c)");
                            String tipoContaAtualizado = ler.next();

                            contaParaSerAtualizada = ContaFactory.create(tipoContaAtualizado);

                            System.out.println("Qual o nome do seu banco?");
                            contaParaSerAtualizada.setNome(ler.next());

                            System.out.println("Qual a agencia da sua conta?");
                            contaParaSerAtualizada.setAgencia(ler.next());

                            System.out.println("Qual o número da sua conta?");
                            contaParaSerAtualizada.setNumero(ler.next());

                            System.out.println("Valor inicial a ser depositado");
                            contaParaSerAtualizada.depositar(ler.nextDouble());

                            cliente = new Cliente(nomeAtualizado, idadeAtualizada, contaParaSerAtualizada);
                            clienteService.editarCliente(idClienteParaSerAtualizado, cliente);
                        }
                    }
                case 4:
                    System.out.println("Digite o id do cliente");
                    int idClienteParaSerRemovido = ler.nextInt();
                    clienteService.removerProduto(idClienteParaSerRemovido);
            }

        }

    }
}























