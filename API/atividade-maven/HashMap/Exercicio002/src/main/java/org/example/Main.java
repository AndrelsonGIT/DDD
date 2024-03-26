package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int contadorId = 1;
        Scanner ler = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();
        while(true){
            System.out.println("Digite a proxima opção\n" +
                    "1. Adicionar novo produto\n"+
                    "2. Atualizar produto\n"+
                    "3. Mostrar todos os produtos\n"+
                    "4. Remover produto\n");
            int opcaoUsuario = ler.nextInt();
            switch (opcaoUsuario) {

                case 1:
                    System.out.println("Nome produto");
                    String produtoNome =  ler.next();

                    System.out.println("Digite o preco do produto");
                    double produtoPreco = ler.nextInt();

                    System.out.println("Quantidade produtos");
                    double quantidadeProduto = ler.nextInt();

                    System.out.println("Quantidade do produto");

                    System.out.println("O produto possui categoria? (s/n)");
                    String produtoTemCategoria = ler.next();
                    Categoria categoria = null;
                    if(produtoTemCategoria.equalsIgnoreCase("s")){
                        System.out.println("Qual o nome da categoria do produto");
                        String categoriaNome = ler.next();
                        categoria = new Categoria(contadorId,categoriaNome);
                    }

                    Produto produto = new Produto(contadorId, produtoNome, produtoPreco, quantidadeProduto, categoria);
                    produtoService.adicionar(produto);
                    break;
                case 2:
                    System.out.println("Digite o id do produto que deseja editar");
                    int id = ler.nextInt();

                    System.out.println("Digite o nome a ser atualizado");
                    String nomeAtualizado = ler.next();

                    System.out.println("Digite o preco do produto");
                    double precoAtualizado = ler.nextInt();

                    System.out.println("Quantidade produtos");
                    double quantidadeAtualizada = ler.nextInt();

                    System.out.println("Quantidade do produto");

                    System.out.println("O produto possui categoria? (s/n)");
                    String produtoAtualizadoPossuiCategoria = ler.next();
                    Categoria categoriaAtualizada = null;

                    if(produtoAtualizadoPossuiCategoria.equalsIgnoreCase("s")){
                        System.out.println("Qual o nome da categoria do produto");
                        String categoriaNome = ler.next();
                        categoria = new Categoria(contadorId,categoriaNome);
                    }
                    Produto produtoAtualizado =  new Produto(0 , nomeAtualizado, precoAtualizado, quantidadeAtualizada, categoriaAtualizada);
                    produtoService.editarProduto(id, produtoAtualizado);
                case 3:
                    produtoService.exibirProdutos();
                case 4:
                    produtoservice
                    System.out.println("Digite o id do produto a ser removido");
                    int idProduto = ler.nextInt()+1;
                    produtoService.removerProduto(idProduto);
            }

            contadorId++;

            System.out.println("Deseja continuar? (s/n)");
            String respostaUsuario = ler.next();

            if(respostaUsuario.equalsIgnoreCase("n")){
                break;
            }

        }

        produtoService.exibirProdutos();



    }
}