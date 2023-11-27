package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public class CoronaVirus extends Inimigo{

    public CoronaVirus() {
        super("Corona Virus", 90, 15, 10);
    }

    @Override
    public void ataque(Personagem personagem) throws InterruptedException  {
        System.out.println("Corona Virus usou o seu Virus Ataque no "+personagem.getNome());
        int vidaAposDano = personagem.getVida() - this.getAtaque();
        personagem.setVida(vidaAposDano);
        Thread.sleep(1900);
        System.out.println(personagem.getNome() + " sofreu "+this.getAtaque() +" de dano, sua vida atual é "+personagem.getVida()+"\n");
        Thread.sleep(1900);
    }

    @Override
    public void superAtaque(Jogador personagem) throws InterruptedException {
        System.out.println("Corona Virus usou o seu Super Virus Ataque no "+personagem.getNome());
        int vidaAposDano = personagem.getVida() - this.getAtaque()*2;
        personagem.setVida(vidaAposDano);
        Thread.sleep(1900);
        System.out.println(personagem.getNome() + " sofreu "+this.getAtaque() +" de dano, sua vida atual é "+personagem.getVida()+"+\n\"");
        Thread.sleep(1900);
    }
}
