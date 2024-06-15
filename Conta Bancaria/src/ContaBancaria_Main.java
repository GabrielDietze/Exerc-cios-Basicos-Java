public class ContaBancaria_Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNomeCliente("João");
        conta1.setNumeroConta(123456);
        conta1.setTipoConta('a');
        conta1.setSaldo(1000.0);

        // Criando objeto ContaBancaria usando o construtor sobrecarregado
        ContaBancaria conta2 = new ContaBancaria("Maria", 654321, 'P', 500.0);

        // Imprimindo informações das contas bancárias usando o método toString()
        System.out.println(conta1);
        System.out.println(conta2);
    }
}
