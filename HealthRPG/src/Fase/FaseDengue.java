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
    public void iniciarFase() throws InterruptedException {
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
    public void proximaFase() throws InterruptedException {
        System.out.println("==> VITÓRIA TOTAL! <==\n");
        System.out.println("Parabéns, "+this.getJogador().getNome() +"! Com sua coragem e sabedoria, você enfrentou todas as epidemias, protegendo a cidade do caos e devolvendo a paz aos seus habitantes.\n");
        Thread.sleep(2000);
        System.out.println("Seu compromisso incansável em combater as doenças, do Coronavírus à Dengue e à Malária, salvou vidas e inspirou esperança em todos os cantos da cidade.\n");
        Thread.sleep(2000);
        System.out.println("Graças a você, a população pode agora se recuperar e reconstruir. Sua jornada foi árdua, mas sua determinação triunfou sobre as adversidades.\n");
        Thread.sleep(2000);
        System.out.println("A cidade está em débito com você, herói, e seu nome será lembrado nas páginas da história como aquele que trouxe cura e paz em tempos difíceis.\n");
        System.out.println("Obrigado por sua bravura e dedicação. Você é verdadeiramente um guardião da saúde e um exemplo de coragem para todos!\n");
        System.out.println("FIM DO JOGO. Esperamos que tenha se divertido e, mais importante, que tenha aprendido um pouco mais sobre a importância da saúde pública!\n");
    }
}
