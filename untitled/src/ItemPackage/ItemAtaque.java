package ItemPackage;

import PersonagemPackage.Jogador;

public abstract class ItemAtaque extends Item{

    private int dano;

    protected ItemAtaque(String nome, String descricao, int dano) {
        super(nome, descricao);
        this.dano = dano;

    }

    abstract void atacar();

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
