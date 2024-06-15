import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Criar um quadrado padrão de lado = 1");
            System.out.println("2 - Criar um quadrado que receba o valor do atributo lado");
            System.out.println("3 - Criar um quadrado dado o valor do perímetro");
            System.out.println("4 - Criar um quadrado dado o valor da área");
            System.out.println("5 - Criar um quadrado dado o valor da diagonal");
            System.out.println("6 - Imprimir o valor dos atributos: lado, perímetro, área e diagonal");
            System.out.println("9 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    quadrado = new Quadrado();
                    System.out.println("Quadrado padrão criado.");
                    voltarOuEncerrar(scanner);
                    break;
                case 2:
                    System.out.print("Informe o valor do lado: ");
                    double lado = scanner.nextDouble();
                    quadrado = new Quadrado(lado);
                    System.out.println("Quadrado criado com lado = " + lado);
                    voltarOuEncerrar(scanner);
                    break;
                case 3:
                    System.out.print("Informe o valor do perímetro: ");
                    double perimetro = scanner.nextDouble();
                    quadrado = new Quadrado(perimetro, 1);
                    System.out.println("Quadrado criado com lado calculado a partir do perímetro = " + quadrado.getLado());
                    voltarOuEncerrar(scanner);
                    break;
                case 4:
                    System.out.print("Informe o valor da área: ");
                    double area = scanner.nextDouble();
                    quadrado = new Quadrado(area, 2);
                    System.out.println("Quadrado criado com lado calculado a partir da área = " + quadrado.getLado());
                    voltarOuEncerrar(scanner);
                    break;
                case 5:
                    System.out.print("Informe o valor da diagonal: ");
                    double diagonal = scanner.nextDouble();
                    quadrado = new Quadrado(diagonal, 3);
                    System.out.println("Quadrado criado com lado calculado a partir da diagonal = " + quadrado.getLado());
                    voltarOuEncerrar(scanner);
                    break;
                case 6:
                    if (quadrado != null) {
                        System.out.println("Lado: " + quadrado.getLado());
                        System.out.println("Perímetro: " + quadrado.calcularPerimetro());
                        System.out.println("Área: " + quadrado.calcularArea());
                        System.out.println("Diagonal: " + quadrado.calcularDiagonal());
                    } else {
                        System.out.println("Nenhum quadrado foi criado ainda.");
                    }
                    voltarOuEncerrar(scanner);
                    break;
                case 9:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    voltarOuEncerrar(scanner);
            }
        }
    }
    private static void voltarOuEncerrar(Scanner scanner) {
        while (true) {
            System.out.println("1 - Continuar para o menu");
            System.out.println("2 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            int subOpcao = scanner.nextInt();
            if (subOpcao == 1) {
                return; // Volta para a interface
            } else if (subOpcao == 2) {
                System.out.println("Encerrando o programa.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
}}