public class ContaCorrente extends Conta{
    public ContaCorrente() {
    }

    public ContaCorrente(int id, String nome, String numero, String agencia, double valor) {
        super(id, nome, numero, agencia, valor);
    }

    @Override
    void depositar(double valor) {
         super.valor = valor - (valor*0.05);

    }
}
