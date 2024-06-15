abstract class Figura {

    protected double dim1;
    protected double dim2;
    protected double dim3;

    public Figura(double dim1, double dim2, double dim3) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    abstract double area();

    abstract double volume();

    abstract void aumentar(double percentual);

    void meusDados() {
        System.out.println("Dimensão 1: " + dim1);
        System.out.println("Dimensão 2: " + dim2);
        System.out.println("Dimensão 3: " + dim3);
        System.out.println("Área: " + area());
        System.out.println("Volume: " + volume());
    }
}