public class Paralelepipedo extends FiguraGeometrica {
    public Paralelepipedo(double base, double altura, double profundidade) {
        super("Paralelepípedo", base, altura, profundidade);
    }

    @Override
    public double calcularVolume() {
        return dim1 * dim2 * dim3;
    }

    @Override
    public double calcularAreaExterna() {
        return (2 * dim1 * dim2) + (2 * dim1 * dim3) + (2 * dim2 * dim3);
    }
}