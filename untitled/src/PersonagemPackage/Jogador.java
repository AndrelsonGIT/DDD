package PersonagemPackage;

import ItemPackage.Item;
import ItemPackage.ItemAtaque;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Personagem{

    private List<Item> itens;

    private ItemAtaque itemAtaque;

    public Jogador(String nome, int vida, ItemAtaque itemAtaque) {
        super(nome, vida, itemAtaque.getDano(),0);
        itens = new ArrayList<>();
    }

    @Override
    public void ataque(Personagem personagem){
        int vidaAposDano = personagem.getVida() - this.getAtaque();
        personagem.setVida(vidaAposDano);
        System.out.println(personagem.getNome() + "sofreu "+this.getAtaque() +" de dano");
    }

    public void listarItens(){
        System.out.println("----- Lista Itens ----");
        for(int i =0; i<itens.size(); i++){
            System.out.println("-- -- --");
            System.out.println("Item "+itens.get(i));
            System.out.println("Nome: "+itens.get(i).getNome()+ "Descrição: "+itens.get(i).getDescricao());
        }
    }

    public List<Item> getItens() {
        return itens;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

}
