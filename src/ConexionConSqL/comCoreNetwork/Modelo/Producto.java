package ConexionConSqL.comCoreNetwork.Modelo;

public class Producto
{
    private int id_producto;
    private String nombre_producto;
    private double precio;
    private double cantidades_en_existencia;

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto=" + id_producto +
                ", nombre_producto='" + nombre_producto + '\'' +
                ", precio=" + precio +
                ", cantidades_en_existencia=" + cantidades_en_existencia +
                '}'+"\n";
    }

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, double precio, double cantidades_en_existencia) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.cantidades_en_existencia = cantidades_en_existencia;
    }
    public int getId_producto() {
        return id_producto;
    }
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getCantidades_en_existencia() {
        return cantidades_en_existencia;
    }
    public void setCantidades_en_existencia(double cantidades_en_existencia) {
        this.cantidades_en_existencia = cantidades_en_existencia;
    }
}
