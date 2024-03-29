package PersonagemPackage;

import ItemPackage.ItemConsumivel;
import ItemPackage.ItemAtaque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador extends Personagem{

    private List<ItemConsumivel> itens;

    private ItemAtaque ataque;

    public Jogador(String nome, int vida, ItemAtaque itemAtaque) {
        super(nome, vida, itemAtaque.getDano(),0);
        this.itens = new ArrayList<>();
    }
    //metodo responsável por jogador fazer o ataque e tirar dano do inimigo
    @Override
    public void ataque(Personagem inimigo) throws InterruptedException{
        System.out.println("Você atacou "+inimigo.getNome());
        Thread.sleep(1900);
        int calculoDano = (this.getAtaque()-inimigo.getDefesa());
        int vidaAposDano = inimigo.getVida() - calculoDano;
        inimigo.setVida(vidaAposDano);
        System.out.println(inimigo.getNome() + " sofreu "+ calculoDano+" de dano\n");
        Thread.sleep(1900);
    }
    //metodo para o jogador consumir um item
    public void usarItem(ItemConsumivel item){
        item.usarItem(this);
    }

    //metodo para listar todos os itens que o jogador tem no inventário
    public void listarItens(){
        Scanner ler = new Scanner(System.in);
        System.out.println("----- Lista Itens ----");
        for(int i =0; i<itens.size(); i++){
            System.out.println("-- -- --");
            System.out.println("Item nº: "+i);
            System.out.println("Nome: "+itens.get(i).getNome()+ " ");
        }
        while(true){
            System.out.println("Qual item deseja usar?");
            int nItemUsuario = ler.nextInt();
            if(nItemUsuario+1 <0 || nItemUsuario+1>itens.size()){
                System.out.println("Valor digitado inválido!!");
            }
            else{
                itens.get(nItemUsuario).usarItem(this);
                itens.remove(nItemUsuario);
                break;
            }
        }

    }
    public void addItem(ItemConsumivel item) {
        this.itens.add(item);
    }
    public List<ItemConsumivel> getItens() {
        return itens;
    }
    //metodo para adicionar um novo Item ao inventário do jogador


}
