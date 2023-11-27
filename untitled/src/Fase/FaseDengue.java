package Fase;

import PersonagemPackage.Jogador;
import PersonagemPackage.Patologias.Dengue;
import PersonagemPackage.Patologias.Inimigo;

public class FaseDengue extends FaseAbstrata {

    public FaseDengue(Jogador usuario) {
        super(usuario, new Dengue());
    }

    @Override
    void iniciarFase() throws InterruptedException {
        System.out.println("Fase iniciada");
    }

    @Override
    protected void batalha() throws InterruptedException {

    }

    @Override
    void proximaFase() {

    }
}
