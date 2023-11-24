package ItemPackage;

import PersonagemPackage.Jogador;

public abstract class ItemAtaque extends Item{

    private int dano;

    protected ItemAtaque(String nome, String descricao) {
        super(nome, descricao);
    }

    abstract void atacar();

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
