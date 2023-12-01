package Fase;

import ItemPackage.ItemAtaque;
import ItemPackage.Mascara;
import ItemPackage.Medicamento;
import PersonagemPackage.Jogador;
import PersonagemPackage.Patologias.CoronaVirus;
import PersonagemPackage.Personagem;

import java.util.Scanner;

public class FaseCoronaVirus extends FaseAbstrata {

    public FaseCoronaVirus(Jogador usuario) {
        super(usuario, new CoronaVirus());
    }

    //Metodo para inciar a fase do Corona Virus
    @Override
    public void iniciarFase() throws InterruptedException {
        System.out.println("==> FASE 1: Epidemia Covid <==\n");
        //ver aqui futuramente se vai ter item ou não
        System.out.println("Uma névoa sinistra paira sobre a cidade, trazendo consigo a temida Covid 19, conhecido como corona virus. O vírus se espalhou, e as pessoas estão em pânico.\n");
        Thread.sleep(4000);
        System.out.println("A COVID-19 é uma doença respiratória causada pelo coronavírus SARS-CoV-2. Ela foi identificada pela primeira vez na cidade de Wuhan, na China, em dezembro de 2019, e desde então se espalhou globalmente, tornando-se uma pandemia.\n");
        Thread.sleep(3000);
        System.out.println("Sintomas comuns incluem febre, tosse, dificuldade respiratória, fadiga e perda de olfato e paladar. A transmissão ocorre principalmente por gotículas respiratórias durante a fala, tosse ou espirro de uma pessoa infectada, além do contato próximo.\n");
        System.out.println("Sua missão é utilizar os itens corretos para combater e se proteger dessa ameaça invisível. O destino da cidade está em suas mãos! Boa sorte!\n");
        System.out.println("Começando a batalha!!!\n");
        Mascara mascara = new Mascara();
        Medicamento medicamento = new Medicamento();
        this.getJogador().addItem(mascara);
        this.getJogador().addItem(medicamento);
        ItemAtaque tesoura = new ItemAtaque("Tesoura", 30);
        this.getJogador().setAtaque(tesoura);
        System.out.println("--- Inimigo: Corona Virus ---\n");
        Personagem vencedor = batalha();

        if (vencedor instanceof Jogador) {
            System.out.println("O temível inimigo " + this.getInimigo().getNome() + " foi implacavelmente derrotado, sucumbindo diante da sua habilidade avassaladora!\n");
            ItemAtaque bisturi = new ItemAtaque("Bisturi",  60);
            this.getJogador().setAtaque(bisturi);
            System.out.println("Sua arma evoluiu por derrotar o " + this.getInimigo().getNome());
            System.out.println("O item " + bisturi.getNome() + "agora é a sua arma principal e possui " + bisturi.getDano() + " de valor de ataque");
            System.out.println("Iniciando próxima fase...");
            Thread.sleep(1300);
            proximaFase();
        } else {
            System.out.println("Você perdeu a batalha");
            Thread.sleep(1500);
            System.out.println("--- Game Over ---\n\n");
        }
    }

    //Metodo para quando o jogador terminar essa fase, ele avança para a próxima
    @Override
    public void proximaFase() throws InterruptedException {
        FaseDengue faseDengue = new FaseDengue(getJogador());
        faseDengue.iniciarFase();
    }
}
