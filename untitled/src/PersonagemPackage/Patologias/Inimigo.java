package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public abstract class Inimigo extends Personagem {

    protected Inimigo(){

    }

    protected Inimigo(String nome, int vida,int ataque, int defesa) {
        super(nome, vida, ataque,defesa);
    }

    abstract void ataque(Jogador jogador, SuperAtaque superAtaque);
}
