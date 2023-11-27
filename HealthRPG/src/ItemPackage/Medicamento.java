package ItemPackage;

import PersonagemPackage.Jogador;

public class Medicamento extends ItemConsumivel {

    private final int vidaRecuperacao;

    public Medicamento(){
        super("Medicamento", "Descrição");
        this.vidaRecuperacao = 50;
    }

    @Override
    public void usarItem(Jogador jogador) {
        System.out.println(jogador.getNome()+" usou o item "+this.getNome()+ " e ganhou "+this.getVidaRecuperacao());
        int aumentoVida = jogador.getVida()+this.vidaRecuperacao;
        jogador.setVida(aumentoVida);
    }

    public int getVidaRecuperacao() {
        return vidaRecuperacao;
    }
}