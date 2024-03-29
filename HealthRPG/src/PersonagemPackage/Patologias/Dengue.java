package PersonagemPackage.Patologias;

import PersonagemPackage.Jogador;
import PersonagemPackage.Personagem;

public class Dengue extends Inimigo{

    public Dengue() {
        super("Mosquito Dengue", 100, 25, 20);
    }

    //Método do inimigo para atacar o jogador
    @Override
    public void ataque(Personagem jogador) throws InterruptedException {
        System.out.println(this.getNome()+" usou o a sua picada no "+jogador.getNome());
        int vidaAposDano = jogador.getVida() - this.getAtaque();
        jogador.setVida(vidaAposDano);
        Thread.sleep(1900);
        System.out.println(jogador.getNome() + " sofreu "+this.getAtaque() +" de dano, sua vida atual é "+jogador.getVida()+"\n");
        Thread.sleep(1900);
    }
    //Método do inimigo para dar um super ataque no jogador, na qual causa um dano extra em relação ao ataque normal
    @Override
    public void superAtaque(Jogador jogador) throws InterruptedException {
        System.out.println(this.getNome()+" usou a sua picada no "+jogador.getNome());
        Thread.sleep(1900);
        this.setVida(this.getVida()+15);
        System.out.println(this.getNome()+" ganhou 15 de vida por sugar o sangue do "+ jogador.getNome());
        int superAtaqueDano = this.getAtaque()*2-jogador.getDefesa();
        int vidaAposDano = jogador.getVida() - superAtaqueDano;
        jogador.setVida(vidaAposDano);
        System.out.println("Jogador "+jogador.getNome()+" sofreu "+superAtaqueDano+" de dano, sua vida atual é "+jogador.getVida());
        Thread.sleep(1900);
    }

}
