package Poliformismo.ejercicio2;

public class Cuadrado extends Figura
{
    private double lado;

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }

    public Cuadrado() {}

    public Cuadrado(int y, int x, double lado) {
        super(y, x);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
