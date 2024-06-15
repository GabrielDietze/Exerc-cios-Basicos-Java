public class Cilindro extends FiguraGeometrica {
    public Cilindro(double raioBase, double altura) {
        super("Cilindro", raioBase, altura, 0);
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(dim1, 2) * dim2;
    }

    @Override
    public double calcularAreaExterna() {
        return (2 * Math.PI * dim1 * dim2) + (2 * Math.PI * Math.pow(dim1, 2));
    }
}