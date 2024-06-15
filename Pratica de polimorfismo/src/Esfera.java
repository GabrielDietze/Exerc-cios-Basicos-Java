public class Esfera extends FiguraGeometrica {
    public Esfera(double raio) {
        super("Esfera", raio, 0, 0);
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim1, 3);
    }

    @Override
    public double calcularAreaExterna() {
        return 4 * Math.PI * Math.pow(dim1, 2);
    }
}