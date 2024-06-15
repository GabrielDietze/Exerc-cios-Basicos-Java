import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Exemplos de uso de StringUtils
        String s1 = "hello";
        String s2 = "olleh";
        System.out.println("Reverso de \"" + s1 + "\": " + StringUtils.Reverso(s1));
        System.out.println("Anagrama de \"" + s1 + "\" e \"" + s2 + "\": " + StringUtils.Anagrama(s1, s2));

        char[] s1Array = s1.toCharArray();
        char[] s2Array = new char[s1Array.length];
        StringUtils.CopiaStrs(s1Array, s2Array);
        System.out.println("Cópia de \"" + s1 + "\": " + new String(s2Array));

        String s3 = " world";
        System.out.println("Concatenação de \"" + s1 + "\" e \"" + s3 + "\": " + StringUtils.Concatenar(s1, s3));

        String s4 = "racecar";
        System.out.println("É \"" + s4 + "\" um palíndromo? " + StringUtils.Palindromo(s4));

        // Exemplos de uso de MatrixUtils
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matriz original:");
        for (int[] row : matriz) {
            System.out.println(Arrays.toString(row));
        }
        int[][] transposta = MatrixUtils.MatrizTransposta(matriz);
        System.out.println("Matriz transposta:");
        for (int[] row : transposta) {
            System.out.println(Arrays.toString(row));
        }

        int[][] matrizIdentidade = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        System.out.println("A matriz é uma matriz identidade? " + MatrixUtils.MatrizIdentidade(matrizIdentidade));

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("A soma das diagonais da matriz é: " + MatrixUtils.SomaDiagonais(matriz2));

        int[][] matriz3 = {
                {1, 2},
                {3, 4}
        };
        int[][] matriz4 = {
                {5, 6},
                {7, 8}
        };
        int[][] somaMatrizes = MatrixUtils.SomaMatrizes(matriz3, matriz4);
        System.out.println("Soma de matrizes:");
        for (int[] row : somaMatrizes) {
            System.out.println(Arrays.toString(row));
        }

        int[][] matriz5 = {
                {1, 2},
                {3, 4}
        };
        int[][] matriz6 = {
                {5, 6},
                {7, 8}
        };
        int[][] multiplicacaoMatrizes = MatrixUtils.MultiplicacaoMatrizes(matriz5, matriz6);
        System.out.println("Multiplicação de matrizes:");
        for (int[] row : multiplicacaoMatrizes) {
            System.out.println(Arrays.toString(row));
        }
    }
    }
