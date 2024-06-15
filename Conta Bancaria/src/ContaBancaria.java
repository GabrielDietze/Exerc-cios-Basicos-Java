public class ContaBancaria {
    private String nomeCliente;
    private int numeroConta;
    private char tipoConta;
    private double saldo;

    // Construtor padrão
    public ContaBancaria() {
    }

    // Construtor sobrecarregado
    public ContaBancaria(String nomeCliente, int numeroConta, char tipoConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    // Getters e setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public char getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(char tipoConta) {
        // Verifica se o tipo de conta é 'C' ou 'P'
        if (tipoConta == 'C' || tipoConta == 'P') {
            this.tipoConta = tipoConta;
        } else {
            System.out.println("Tipo de conta inválido. Por favor, insira 'C' para conta corrente ou 'P' para poupança.");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Conta Bancária [Nome do Cliente: " + nomeCliente +
                ", Número da Conta: " + numeroConta +
                ", Tipo da Conta: " + tipoConta +
                ", Saldo: R$ " + saldo + "]";
    }
}
