public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(int id, String nome, String numero, String agencia, double valor) {
        super(id, nome, numero, agencia, valor);
    }

    @Override
    void depositar(double valor) {
        super.valor = valor +(valor*0.05);
    }
}
