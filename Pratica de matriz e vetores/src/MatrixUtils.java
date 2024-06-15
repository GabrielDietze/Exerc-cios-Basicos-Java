import java.util.Arrays;

public class MatrixUtils {

    public static int[][] MatrizTransposta(int[][] matriz) {
        int rows = matriz.length;
        int cols = matriz[0].length;
        int[][] transposta = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }

    public static boolean MatrizIdentidade(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int SomaDiagonais(int[][] matriz) {
        int sum = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            sum += matriz[i][i]; // soma diagonal principal
            sum += matriz[i][n - i - 1]; // soma diagonal secundária
        }
        return sum;
    }

    public static int[][] SomaMatrizes(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] MultiplicacaoMatrizes(int[][] m1, int[][] m2) {
        int m1Rows = m1.length;
        int m1Cols = m1[0].length;
        int m2Cols = m2[0].length;
        int[][] result = new int[m1Rows][m2Cols];
        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                for (int k = 0; k < m1Cols; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
}
