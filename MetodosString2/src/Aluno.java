public class Aluno {
    private String nome;
    private int nota;
    private String cidade;

    public Aluno() {
    }

    public Aluno(String nome, int nota, String cidade) {
        this.nome = nome;
        this.nota = nota;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
