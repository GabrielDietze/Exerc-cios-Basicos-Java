public class Cone extends FiguraGeometrica {
    public Cone(double raioBase, double altura) {
        super("Cone", raioBase, altura, 0);
    }

    @Override
    public double calcularVolume() {
        return (Math.PI * Math.pow(dim1, 2) * dim2) / 3;
    }

    @Override
    public double calcularAreaExterna() {
        double lado = Math.sqrt(Math.pow(dim1, 2) + Math.pow(dim2, 2));
        return Math.PI * dim1 * (dim1 + lado);
    }
}