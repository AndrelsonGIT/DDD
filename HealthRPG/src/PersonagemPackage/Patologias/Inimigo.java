package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public abstract class Inimigo extends Personagem {

    protected Inimigo(){

    }

    protected Inimigo(String nome, int vida,int ataque, int defesa) {
        super(nome, vida, ataque,defesa);
    }

    //Metodo na qual o inimigo usa um Super Ataque, que seria um ataque mas que causa um maior dano no Jogador
    public abstract void superAtaque(Jogador personagem) throws InterruptedException;
}
