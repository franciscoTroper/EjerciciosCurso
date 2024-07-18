package Socket.teoria.Modelo;

public class TiendaC
{
    private int id;
    private String nombre;
    private double ventas;

    @Override
    public String toString() {
        return "TiendaC{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ventas=" + ventas +
                '}';
    }
    public TiendaC() {
    }
    public TiendaC(int id, String nombre, double ventas) {
        this.id = id;
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }
    public double getVentas() {
        return ventas;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
}
