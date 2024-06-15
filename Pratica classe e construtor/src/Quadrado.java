import java.util.Scanner;

public class Quadrado {
    private double lado;

    public Quadrado() {
        this.lado = 1;
    }

    // Método construtor que recebe o atributo lado
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Método construtor que executa três ações diferentes
    // 1 = calcula o lado dado o perímetro
    // 2 = calcula o lado dado a área
    // 3 = calcula o lado dado a diagonal
    public Quadrado(double valor, int tipo) {
        switch (tipo) {
            case 1:
                this.lado = valor / 4; // Calcula o lado dado o perímetro
                break;
            case 2:
                this.lado = Math.sqrt(valor); // Calcula o lado dado a área
                break;
            case 3:
                this.lado = valor / Math.sqrt(2); // Calcula o lado dado a diagonal
                break;
            default:
                throw new IllegalArgumentException("Tipo inválido. Use 1 para perímetro, 2 para área, 3 para diagonal.");
        }
    }

    // Método público que testa se lado > 0 (válido) ou lado <= 0 (inválido)
    public boolean isLadoValido() {
        return this.lado > 0;
    }

    // Método público para calcular o perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }

    // Método público para calcular a área
    public double calcularArea() {
        return lado * lado;
    }

    // Método público para calcular a diagonal
    public double calcularDiagonal() {
        return lado * Math.sqrt(2);
    }

    // Getters e Setters para o atributo lado, se necessário
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Método destrutor
    @Override
    protected void finalize() throws Throwable {
        try {
            // Código de limpeza, se necessário
            System.out.println("O objeto Quadrado está sendo destruído.");
        } finally {
            super.finalize();
        }
    }
}
