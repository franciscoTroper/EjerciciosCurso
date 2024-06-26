package Poliformismo.ejercicio2;

public class Triangulo extends Figura
{
    private double base;
    private double altura;

    public Triangulo() {}

    public Triangulo(int y, int x, double base, double altura) {
        super(y, x);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return base*altura/2;



    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
