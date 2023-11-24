package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public abstract class Inimigo extends Personagem {

    private int ataque;
    private int defesa;

    protected Inimigo(){

    }

    protected Inimigo(String nome, int vida, int defesa) {
        super(nome, vida);
        this.defesa = defesa;
    }

    abstract void ataque(Jogador jogador);

    abstract void ataque(Jogador jogador, SuperAtaque superAtaque);
}
