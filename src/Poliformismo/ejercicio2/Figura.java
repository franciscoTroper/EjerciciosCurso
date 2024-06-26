package Poliformismo.ejercicio2;

public class Figura
{
    protected int x;
    protected int y;

    public double calcularArea()
    {
        return 0;
    }
    public String mostrarPosicion()
    {
        return "";
    }

    public Figura() {}

    public Figura(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
