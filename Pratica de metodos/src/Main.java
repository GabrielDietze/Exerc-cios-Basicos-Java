import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        System.out.println("Maior número: " + MathUtils.MaiorNumero(vetor));
        System.out.println("Soma dos 5 primeiros números: " + MathUtils.Soma(vetor, 5));
        System.out.println("Fatorial de 5: " + MathUtils.Fatorial(5));
        System.out.println("MDC de 48 e 18: " + MathUtils.MDC(48, 18));
        System.out.println("10 primeiros números primos: " + MathUtils.NumerosPrimos(10));
        System.out.println("10 primeiros números da sequência de Fibonacci: " + MathUtils.Fibonacci(10));
        System.out.println("Binário 1011 para decimal: " + MathUtils.BinToDec("1011"));
        System.out.println("Decimal 11 para binário: " + MathUtils.DecToBin(11));
        System.out.println("Fatoração de 60 em números primos: " + MathUtils.FatoracaoNumerosPrimos(60));
    }
}
