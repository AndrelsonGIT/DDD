package Fase;

import ItemPackage.ItemAtaque;
import PersonagemPackage.Jogador;
import PersonagemPackage.Patologias.Dengue;
import PersonagemPackage.Personagem;

import java.util.Scanner;

public class FaseDengue extends FaseAbstrata {

    public FaseDengue(Jogador usuario) {
        super(usuario, new Dengue());
    }

    @Override
    void iniciarFase() throws InterruptedException {
        System.out.println("==> FASE 2: Epidemia de Dengue <==\n");
        System.out.println("Uma atmosfera tensa envolve a cidade, trazendo consigo a temida Dengue. O mosquito Aedes aegypti está causando estragos, e as pessoas estão apreensivas.\n");
        Thread.sleep(4000);
        System.out.println("A Dengue é uma doença transmitida pelo mosquito Aedes aegypti. Ela é endêmica em várias regiões tropicais do mundo, causando surtos periódicos e afetando milhões de pessoas anualmente.\n");
        Thread.sleep(3000);
        System.out.println("Sintomas comuns incluem febre alta, dor de cabeça, dores no corpo e nas articulações, além de náuseas. A transmissão ocorre através da picada do mosquito infectado.\n");
        System.out.println("Sua missão é utilizar os recursos certos para combater o mosquito e se proteger dessa ameaça silenciosa. O destino da cidade está em suas mãos! Boa sorte!\n");
        System.out.println("Começando a batalha!!!\n");
        System.out.println("--- Inimigo: Mosquito da Dengue ---\n");
        batalha();
        Personagem vencedor = batalha();

        if(vencedor instanceof Jogador){
            System.out.println("Num épico combate, a Dengue, personificada como " + this.getInimigo().getNome() + ", foi derrotada, caindo perante sua incrível destreza e imunidade elevada!\n");
            ItemAtaque laminaSerra = new ItemAtaque("Lamina de Serra", "Item mto louco", 90);
            this.getJogador().setAtaque(laminaSerra);
            System.out.println("Sua arma evoluiu por derrotar o "+this.getInimigo().getNome());
            System.out.println("O item "+laminaSerra.getNome()+"agora é a sua arma principal e possui "+laminaSerra.getDano()+" de valor de ataque");
            System.out.println("Iniciando próxima fase...");
            Thread.sleep(1300);
            proximaFase();
        }
        else {
            System.out.println("Você perdeu a batalha");
            Thread.sleep(1500);
            System.out.println("--- Game Over ---");
        }
    }

    @Override
    void proximaFase() throws InterruptedException {

    }
}
