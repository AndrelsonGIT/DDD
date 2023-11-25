package Fase;

import PersonagemPackage.Jogador;
import PersonagemPackage.Patologias.CoronaVirus;

import java.util.Scanner;

public class FaseCoronaVirus extends FaseAbstrata{

    public FaseCoronaVirus(Jogador usuario){
        super(usuario, new CoronaVirus());
    }

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
        System.out.println("Começando a batalha!!!");
        batalha();
    }

    @Override
    protected void batalha() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Inimigo Corona Virus");
        while(this.getJogador().getVida()>0 && this.getInimigo().getVida()>0){
            System.out.println("Informações Game: ");
            System.out.println("Jogador: " +this.getJogador().getNome()+" Vida: "+this.getJogador().getVida()+"\n");
            System.out.println("Inimigo: "+this.getInimigo().getNome()+" Vida: "+this.getInimigo().getVida()+"\n");
            System.out.println("--- SEU TURNO ---");
            while(true){
                System.out.println("Escolha qual opção deseja");
                System.out.println("1. Atacar");
                System.out.println("2. Abrir inventário");
                int opcao = ler.nextInt();
                if(opcao ==1){
                    //fazer a parte de ataque
                }
                if(opcao == 2){
                    this.getJogador().listarItens();
                }
                else{
                    System.out.println("Opção inválida! Digite uma opção válida");
                }
            }

        }
    }
}
