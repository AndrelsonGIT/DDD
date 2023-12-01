package ItemPackage;

import PersonagemPackage.Jogador;

public abstract class Item{

    private String nome;
    
    protected Item(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
