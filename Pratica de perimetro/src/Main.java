import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double raio, perim, area;

        // Obtenha o raio da circunferência
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o valor do raio: ");
        raio = scanner.nextDouble();

        // Calcula o perímetro do círculo
        perim = 2 * PI * raio;

        // Calcula a área da circunferência
        area = PI * Math.pow(raio, 2);

        // Exibe os resultados
        System.out.println("O perímetro da circunferência de raio " + raio + " é " + perim);
        System.out.println("A área é " + area);

        // Término do programa
        scanner.close();
    }
}
