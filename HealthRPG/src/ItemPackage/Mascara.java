package ItemPackage;

import PersonagemPackage.Jogador;

public class Mascara extends ItemConsumivel {

    private final int defesa;

    public Mascara() {
        super("Mascara");
        this.defesa = 10;
    }
    @Override
    public void usarItem(Jogador jogador){
        jogador.setDefesa(this.defesa);
        System.out.println("jogador "+jogador.getNome()+" usou "+ this.getNome() +" e ganhou "+this.defesa+ " de defesa");
    }

    public int getDefesa() {
        return defesa;
    }
}
