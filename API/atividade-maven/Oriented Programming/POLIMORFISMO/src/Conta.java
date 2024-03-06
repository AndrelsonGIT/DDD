public abstract class Conta {

    protected String nome;

    protected String numero;

    protected String agencia;

    protected double valor;

    public Conta() {}

    public Conta(int id, String nome, String numero, String agencia, double valor) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        depositar(valor);
    }

    abstract void depositar(double valor);

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
