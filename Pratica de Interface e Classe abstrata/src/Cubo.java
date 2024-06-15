class Cubo extends Figura {
    public Cubo(double lado) {
        super(lado, lado, lado);
    }

    @Override
    double area() {
        return 6 * dim1 * dim1;
    }

    @Override
    double volume() {
        return dim1 * dim1 * dim1;
    }

    @Override
    void aumentar(double percentual) {
        dim1 *= (1 + percentual / 100);
        dim2 *= (1 + percentual / 100);
        dim3 *= (1 + percentual / 100);
    }
}
