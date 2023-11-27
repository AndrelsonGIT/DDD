package PersonagemPackage;

import ItemPackage.ItemAtaque;

public abstract class Personagem {

    private String nome;
    private int vida;

    private int ataque;

    private int defesa;


    protected Personagem(){

    }

    protected Personagem(String nome, int vida,int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public abstract void ataque(Personagem personagem) throws InterruptedException;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }


    public void setAtaque(ItemAtaque itemAtaque) {
        this.ataque = itemAtaque.getDano();
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

}
