package EjemploFinal;

class Main
{
    public static  void main(String[] args)
    {
        Producto producto=new Producto();
        producto.calcularPrecioTotal();


    }
}

public class Producto
{
    private final double iva = 0.21;
    private double precio;

    public Producto() {
    }

    public Producto(double precio) {
        this.precio = precio;
    }

    public final double calcularPrecioTotal()
    {
        return precio*iva;
    }

    public double getIva() {
        return iva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
class Lacteos extends Producto
{

}
