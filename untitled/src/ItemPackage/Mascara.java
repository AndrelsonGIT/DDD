package ItemPackage;

import PersonagemPackage.Jogador;

public class Mascara extends Item{

    private int defesa;

    public Mascara() {
        super("Bisturi", "");
        this.defesa = 30;
    }

    public void usarItem(Jogador jogador){
        jogador.setDefesa(30);
        System.out.println("jogador "+jogador.getNome()+" usou Mascara e ganhou 30 de defesa");
    }
}
