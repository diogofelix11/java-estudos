package entities;

public class Conta {

    private int numeroConta;
    private String name;
    private double saldo;
    private static final double TAXA_SAQUE = 5.0;

    public Conta(int numeroConta, String name, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.name = name;
        deposito(depositoInicial);
    }

    public Conta(int numeroConta, String name) {
        this.numeroConta = numeroConta;
        this.name = name;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo -= (valor + TAXA_SAQUE);
    }

    @Override
    public String toString() {
        return "Dados da conta: \n"
                + "Conta: "
                + numeroConta + ","
                + " Proprietário: "
                + name + ","
                + " Saldo: $ "
                + String.format("%.2f", saldo);
    }
}

