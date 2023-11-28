import Fase.FaseCoronaVirus;
import ItemPackage.ItemAtaque;
import ItemPackage.Mascara;
import PersonagemPackage.Jogador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o seu primeiro nome?");
        String nome = ler.next();
        ItemAtaque tesoura = new ItemAtaque("Tesoura", "Item cortante",20);
        Jogador jogador = new Jogador(nome, 100,tesoura) ;

        while(true){
           System.out.println("===> Seja bem vindo "+jogador.getNome() +" ao Health RPG!!! <===\n");
           System.out.println("1. Start");
           System.out.println("2. Desenvolvedores");
           System.out.println("3. Exit");

           int opcao = ler.nextInt();

           if(opcao == 1){
               FaseCoronaVirus faseCoronaVirus = new FaseCoronaVirus(jogador);
               System.out.println("Iniciando o jogo...");
//               Thread.sleep(1500);
               faseCoronaVirus.iniciarFase();
           }
           else if(opcao == 2){
               System.out.println("\nEsse game foi desenvolvido pelos seguinte desenvolvedores: ");
               System.out.println("Kayque Ferreira dos Santos - RM: 552605");
               System.out.println("Marco Aurélio Morais Ennes - RM: 553201");
               System.out.println("André Alves da Silva - RM: 552639");
               System.out.println("....");
           }
           else{
               System.out.println("Saindo do jogo...");
//               Thread.sleep(2000);
               break;
           }
       }
    }
}
























