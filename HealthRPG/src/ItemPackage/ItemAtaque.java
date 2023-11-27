package ItemPackage;

public class ItemAtaque extends Item{

    private int dano;

    public ItemAtaque(String nome, String descricao, int dano) {
        super(nome, descricao);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
