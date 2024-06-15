import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número correspondente à figura geométrica desejada:");
        System.out.println("1 - Esfera");
        System.out.println("2 - Cilindro");
        System.out.println("3 - Paralelepípedo");
        System.out.println("4 - Cone");
        int opcao = scanner.nextInt();

        FiguraGeometrica figura = null;

        switch (opcao) {
            case 1:
                System.out.println("Digite o raio da esfera:");
                double raioEsfera = scanner.nextDouble();
                figura = new Esfera(raioEsfera);
                break;
            case 2:
                System.out.println("Digite o raio da base do cilindro:");
                double raioCilindro = scanner.nextDouble();
                System.out.println("Digite a altura do cilindro:");
                double alturaCilindro = scanner.nextDouble();
                figura = new Cilindro(raioCilindro, alturaCilindro);
                break;
            case 3:
                System.out.println("Digite a base do paralelepípedo:");
                double baseParalelepipedo = scanner.nextDouble();
                System.out.println("Digite a altura do paralelepípedo:");
                double alturaParalelepipedo = scanner.nextDouble();
                System.out.println("Digite a profundidade do paralelepípedo:");
                double profundidadeParalelepipedo = scanner.nextDouble();
                figura = new Paralelepipedo(baseParalelepipedo, alturaParalelepipedo, profundidadeParalelepipedo);
                break;
            case 4:
                System.out.println("Digite o raio da base do cone:");
                double raioCone = scanner.nextDouble();
                System.out.println("Digite a altura do cone:");
                double alturaCone = scanner.nextDouble();
                figura = new Cone(raioCone, alturaCone);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Volume da figura: " + figura.calcularVolume());
        System.out.println("Área externa da figura: " + figura.calcularAreaExterna());
    }
}
