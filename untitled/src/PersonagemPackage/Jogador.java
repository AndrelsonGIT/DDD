package PersonagemPackage;

import ItemPackage.Item;
import ItemPackage.ItemAtaque;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Personagem{

    private List<Item> itens;

    private ItemAtaque itemAtaque;

    public Jogador(String nome, int vida) {
        super(nome, vida);
        itens = new ArrayList<>();
    }

    public void atacar(Personagem erqqwerqw){

    }

    public void listarItens(){
        System.out.println("----- Lista Itens ----");
        for(Item item : itens){
            System.out.println("Nome: "+item.getNome()+ "Descrição: "+item.getDescricao());
        }
    }

    public List<Item> getItens() {
        return itens;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public ItemAtaque getItemAtaque() {
        return itemAtaque;
    }

    public void setItemAtaque(ItemAtaque itemAtaque) {
        this.itemAtaque = itemAtaque;
    }
}
