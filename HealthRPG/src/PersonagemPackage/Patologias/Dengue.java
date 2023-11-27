package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public class Dengue extends Inimigo{

    public Dengue() {
        super("Mosquito Dengue", 120, 25, 20);
    }


    @Override
    public void ataque(Personagem personagem) throws InterruptedException {
        System.out.println(this.getNome()+" usou o a sua picada no "+personagem.getNome());
        int vidaAposDano = personagem.getVida() - this.getAtaque();
        personagem.setVida(vidaAposDano);
        Thread.sleep(1900);
        System.out.println(personagem.getNome() + " sofreu "+this.getAtaque() +" de dano, sua vida atual é "+personagem.getVida()+"\n");
        Thread.sleep(1900);
    }

    @Override
    public void superAtaque(Jogador personagem) throws InterruptedException {
        System.out.println(this.getNome()+" usou o seu Super Ataque no "+personagem.getNome());
        int vidaAposDano = personagem.getVida() - this.getAtaque()*2;
        personagem.setVida(vidaAposDano);
        Thread.sleep(1900);
        System.out.println(personagem.getNome() + " sofreu "+this.getAtaque() +" de dano, sua vida atual é "+personagem.getVida()+"+\n\"");
        Thread.sleep(1900);
    }

}
