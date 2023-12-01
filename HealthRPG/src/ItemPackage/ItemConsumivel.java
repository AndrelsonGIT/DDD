package ItemPackage;

import PersonagemPackage.Jogador;

public abstract class ItemConsumivel extends Item {

    public ItemConsumivel(String nome) {
        super(nome);
    }

    public abstract void usarItem(Jogador jogador);
}
