package ItemPackage;

import PersonagemPackage.Jogador;

public abstract class ItemConsumivel extends Item {

    public ItemConsumivel(String nome, String descricao) {
        super(nome, descricao);
    }

    public abstract void usarItem(Jogador jogador);
}
