public class Main {

    public static int msc(String seq1, String seq2) {
        int m = seq1.length();
        int n = seq2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (seq1.charAt(i - 1) == seq2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String seq1 = "GABRIEL";
        String seq2 = "GABRIELA";

        System.out.println("O comprimento da maior subsequência comum é: " + msc(seq1, seq2));
    }
}
