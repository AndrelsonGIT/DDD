package Fase;

import ItemPackage.ItemAtaque;
import PersonagemPackage.Jogador;
import PersonagemPackage.Patologias.Inimigo;
import PersonagemPackage.Personagem;

import java.util.Scanner;

public abstract class FaseAbstrata {

    private Jogador jogador;

    private Inimigo inimigo;

    protected FaseAbstrata(){

    }

    protected FaseAbstrata(Jogador usuario, Inimigo inimigo) {
        this.jogador = usuario;
        this.inimigo = inimigo;
    }


    // metodo para iniciar a fase do jogo
    public abstract void iniciarFase() throws InterruptedException;

    //retorna o vencedor da batalha
    protected Personagem batalha() throws InterruptedException {
        int contadorSuperAtaque = 1;
        while(this.getJogador().getVida()>0){
            Scanner ler = new Scanner(System.in);
            System.out.println("Informações Game: ");
            System.out.println("Jogador: " +this.getJogador().getNome()+" | Vida: "+this.getJogador().getVida() +" | Ataque: "+this.getJogador().getAtaque()+" | Defesa: "+this.getJogador().getDefesa());
            System.out.println("Inimigo: "+this.getInimigo().getNome()+" | Vida: "+this.getInimigo().getVida()+" | Ataque: "+this.getInimigo().getAtaque()+" | Defesa: "+this.getInimigo().getDefesa()+"\n");
            System.out.println("--- SEU TURNO ---");
            System.out.println("Escolha qual opção deseja");
            System.out.println("1. Atacar");
            System.out.println("2. Abrir inventário");
            int opcao = ler.nextInt();
            if(opcao ==1){
                this.getJogador().ataque(this.getInimigo());
            }
            else if(opcao == 2){
                this.getJogador().listarItens();
                //TODO: resolver o problema de o inimigo não atacar aqui
            }
            else{
                System.out.println("Opção inválida! Digite uma opção válida");
            }
            contadorSuperAtaque++;
            if(getInimigo().getVida()<=0){
                break;
            }
            System.out.println("--- TURNO DO INIMIGO: "+this.getInimigo().getNome()+" ---");
            Thread.sleep(1900);
            //verifica se o resto da divisão é igual a zero, se sim usa um superAtaque
            if(contadorSuperAtaque%2==0){
                this.getInimigo().superAtaque(this.getJogador());
            }
            else{
                this.getInimigo().ataque(this.getJogador());
            }
            if(this.getJogador().getVida()<=0){
                break;
            }

        }

        if(this.getJogador().getVida()>0){
          return this.getJogador();
        }
        else{
            return this.getInimigo();
        }
    }

    public abstract void proximaFase() throws InterruptedException;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Inimigo getInimigo() {
        return inimigo;
    }

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }
}
