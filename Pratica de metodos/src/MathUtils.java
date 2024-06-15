import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    public static int MaiorNumero(int[] vU) {
        int max = vU[0];
        for (int i = 1; i < vU.length; i++) {
            if (vU[i] > max) {
                max = vU[i];
            }
        }
        return max;
    }

    public static int Soma(int[] vI, int x) {
        int sum = 0;
        for (int i = 0; i < x && i < vI.length; i++) {
            sum += vI[i];
        }
        return sum;
    }

    public static int Fatorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * Fatorial(x - 1);
        }
    }

    public static int MDC(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static List<Integer> NumerosPrimos(int x) {
        List<Integer> primos = new ArrayList<>();
        int num = 2;
        while (primos.size() < x) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primos.add(num);
            }
            num++;
        }
        return primos;
    }

    public static List<Integer> Fibonacci(int x) {
        List<Integer> fibSeq = new ArrayList<>();
        fibSeq.add(0);
        fibSeq.add(1);
        while (fibSeq.size() < x) {
            int next = fibSeq.get(fibSeq.size() - 1) + fibSeq.get(fibSeq.size() - 2);
            fibSeq.add(next);
        }
        return fibSeq;
    }

    public static int BinToDec(String x) {
        return Integer.parseInt(x, 2);
    }

    public static String DecToBin(int x) {
        return Integer.toBinaryString(x);
    }

    public static List<Integer> FatoracaoNumerosPrimos(int x) {
        List<Integer> fatores = new ArrayList<>();
        int divisor = 2;
        while (x > 1) {
            while (x % divisor == 0) {
                fatores.add(divisor);
                x /= divisor;
            }
            divisor++;
        }
        return fatores;
    }
}
