package org.example;

import java.util.HashMap;

public class ProdutoService {
    private HashMap<Integer, Produto> listaProdutos;

    private static int qtdProdutos = 1;

    public ProdutoService() {
        listaProdutos = new HashMap<>();
    }

    public void adicionar(Produto produto){
        listaProdutos.put(qtdProdutos, produto);
        qtdProdutos++;
    }

    public void exibirProdutos(){
        listaProdutos.forEach((key, value)->{
            System.out.println("------");
            System.out.println("Produto id: "+value.getId());
            System.out.println("Produto nome: "+value.getNome());
            System.out.println("Produto preco: "+value.getPreco());
            System.out.println("Produto quantidade: "+value.getQuantidade());
            if(value.getCategoria() != null){
                System.out.println("Produto categoria "+value.getCategoria().getNome());
            }
            System.out.println("------");
        });
    }

    public void editarProduto(int id, Produto produto) {
        Produto produtoNaLista = procurarProduto(id);
        if (produtoNaLista == null){
            System.out.println("Produto não encontrado na lista");
        }
        if( !(produto.getNome().equals("")) || produto.getNome() != null){
            procurarProduto(id).setNome(produto.getNome());
        }
        if(produto.getPreco() >= 0){
            produtoNaLista.setPreco(produto.getPreco());
        }
        if(produto.getQuantidade() >=0){
            produto.setQuantidade(produto.getQuantidade());
        }
        if(produto.getCategoria() != null){
            produto.setCategoria(produto.getCategoria());
        }
        System.out.println("Produto atualizado com sucesso!");
    }

    public void removerProduto(int id){
        if(listaProdutos.containsKey(id)){
            System.out.println("Produto não existe na lista");
        }else{
            listaProdutos.remove(id);
            System.out.println("Produto removido com sucesso!");
        }

    }


    public Produto procurarProduto(int id){
        return listaProdutos.get(id);
    }

}
