package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public class CoronaVirus extends Inimigo{

    public CoronaVirus() {
        super("Corona Virus", 200, 30, 10);
    }

    @Override
    public void ataque(Personagem personagem) {
        personagem.getAtaque();
    }

    @Override
    void ataque(Jogador jogador, SuperAtaque superAtaque) {

    }
}
