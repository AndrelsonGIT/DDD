package Fase;

import PersonagemPackage.Jogador;
import PersonagemPackage.Patologias.Inimigo;
import PersonagemPackage.Personagem;

public abstract class FaseAbstrata {

    private Jogador jogador;

    private Inimigo inimigo;

    protected FaseAbstrata(){

    }

    protected FaseAbstrata(Jogador usuario, Inimigo inimigo) {
        this.jogador = usuario;
        this.inimigo = inimigo;
    }

    abstract void iniciarFase() throws InterruptedException;

    protected void batalha(){

    }

    public Jogador   getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Inimigo getInimigo() {
        return inimigo;
    }

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }
}
