package ItemPackage;

public class ItemAtaque extends Item{

    private int dano;

    public ItemAtaque(String nome, int dano) {
        super(nome);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
