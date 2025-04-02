public class ContaBancaria {
    String numeroConta;
    String nomeTitular;
    double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("deposito feito");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("saque feito");
        } else {
            System.out.println("nao tem dinheiro suficiente");
        }
    }

    public void mostrarSaldo() {
        System.out.println("voce tem R$ " + saldo + " na sua conta");
    }

    public void mostrarDados() {
        System.out.println("sua conta é: " + numeroConta);
        System.out.println("seu nome é: " + nomeTitular);
        System.out.println("seu dinheiro: R$ " + saldo);
    }
}