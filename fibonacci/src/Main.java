import java.util.HashMap;

public class Main {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int resultado = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6)); // Saída: 55
    }
}
