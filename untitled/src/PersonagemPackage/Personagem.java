package PersonagemPackage;

public class Personagem {

    private String nome;
    private int vida;

    private boolean estaVivo;

    protected Personagem(){

    }

    protected Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.estaVivo = true;
    }

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

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

}
