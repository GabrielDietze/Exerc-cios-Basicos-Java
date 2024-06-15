public class Main {

    public static int mochila(int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        int[][] dp = new int[n + 1][capacidade + 1];

        // Construindo a tabela dp de baixo para cima
        for (int i = 0; i <= n; i++) {
            for (int c = 0; c <= capacidade; c++) {
                if (i == 0 || c == 0) {
                    dp[i][c] = 0;
                } else if (pesos[i - 1] <= c) {
                    dp[i][c] = Math.max(valores[i - 1] + dp[i - 1][c - pesos[i - 1]], dp[i - 1][c]);
                } else {
                    dp[i][c] = dp[i - 1][c];
                }
            }
        }

        return dp[n][capacidade];
    }

    public static void main(String[] args) {
        int[] pesos = {2, 3, 4, 5};
        int[] valores = {3, 4, 5, 6};
        int capacidade = 5;

        System.out.println("Valor máximo que pode ser colocado na mochila: " + mochila(pesos, valores, capacidade));
    }
}
