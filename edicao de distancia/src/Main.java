public class Main {

    public static int distanciaEdicao(String palavra1, String palavra2) {
        int m = palavra1.length();
        int n = palavra2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Inicializando a matriz dp
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j; // Precisa de j inserções
                } else if (j == 0) {
                    dp[i][j] = i; // Precisa de i remoções
                } else if (palavra1.charAt(i - 1) == palavra2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Caracteres iguais, não precisa de operação
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], // Substituição
                            Math.min(dp[i - 1][j], // Remoção
                                    dp[i][j - 1])); // Inserção
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String palavra1 = "gato";
        String palavra2 = "cachorro";

        System.out.println("A distância de edição entre '" + palavra1 + "' e '" + palavra2 + "' é: " + distanciaEdicao(palavra1, palavra2));
    }
}
