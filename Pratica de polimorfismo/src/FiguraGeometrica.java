public abstract class FiguraGeometrica {
    protected String nome;
    protected double dim1;
    protected double dim2;
    protected double dim3;

    public FiguraGeometrica(String nome, double dim1, double dim2, double dim3) {
        this.nome = nome;
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    public abstract double calcularVolume();

    public abstract double calcularAreaExterna();

    public String getNome() {
        return nome;
    }

    public double getDim1() {
        return dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public double getDim3() {
        return dim3;
    }
}
