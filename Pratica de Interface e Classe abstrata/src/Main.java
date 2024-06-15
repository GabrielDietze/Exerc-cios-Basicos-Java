public class Main {
    public static void main(String[] args) {
        Cubo cubo = new Cubo(10);

        System.out.println("Dados iniciais do cubo:");
        cubo.meusDados();

        // Aumentando as dimensões do cubo em 10%
        cubo.aumentar(10);

        // Chamando o método meusDados() novamente para exibir os novos dados
        System.out.println("\nDados após aumento de 10%:");
        cubo.meusDados();
    }
}