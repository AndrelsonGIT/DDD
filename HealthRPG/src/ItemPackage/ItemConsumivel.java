package ItemPackage;

import PersonagemPackage.Jogador;

public abstract class ItemConsumivel extends Item {

    public ItemConsumivel(String nome) {
        super(nome);
    }
    // metodo responsavel pra quando o jogador queira consumir o item
    public abstract void usarItem(Jogador jogador);
}
