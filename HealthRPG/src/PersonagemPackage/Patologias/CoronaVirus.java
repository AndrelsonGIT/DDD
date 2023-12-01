package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public class CoronaVirus extends Inimigo{

    public CoronaVirus() {
        super("Corona Virus", 60, 15, 10);
    }


    //Método do inimigo para atacar o jogador
    @Override
    public void ataque(Personagem personagem) throws InterruptedException  {
        System.out.println("Corona Virus usou o seu Virus Ataque no "+personagem.getNome()+"\n");
        int calculoDano = this.getAtaque()-personagem.getDefesa();
        int vidaAposDano = personagem.getVida() - calculoDano;
        personagem.setVida(vidaAposDano);
        Thread.sleep(1900);
        System.out.println(personagem.getNome() + " sofreu "+ calculoDano+" de dano, sua vida atual é "+personagem.getVida()+"\n");
        Thread.sleep(1900);
    }
    //Método do inimigo para dar um super ataque no jogador, na qual causa um dano extra em relação ao ataque normal
    @Override
    public void superAtaque(Jogador personagem) throws InterruptedException {
        System.out.println("Corona Virus usou o seu Super Virus Ataque no "+personagem.getNome());
        int superDano = this.getAtaque()*2-personagem.getDefesa();
        int vidaAposDano = personagem.getVida() - superDano;
        personagem.setVida(vidaAposDano);
        Thread.sleep(1900);
        System.out.println(personagem.getNome() + " sofreu "+superDano +" de dano, sua vida atual é "+personagem.getVida()+"\n");
        Thread.sleep(1900);
    }
}
