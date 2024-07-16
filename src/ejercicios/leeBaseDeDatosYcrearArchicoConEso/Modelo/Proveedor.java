package ejercicios.leeBaseDeDatosYcrearArchicoConEso.Modelo;

public class Proveedor
{
    private int idProveedor;
    private String nombreCompañia;
    private String nombrecontacto;
    private String telefono;

    public Proveedor() {
    }
    public Proveedor(int idProveedor, String nombreCompañia, String nombrecontacto, String telefono) {
        this.idProveedor = idProveedor;
        this.nombreCompañia = nombreCompañia;
        this.nombrecontacto = nombrecontacto;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }
    public String getNombreCompañia() {
        return nombreCompañia;
    }
    public String getNombrecontacto() {
        return nombrecontacto;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public void setNombreCompañia(String nombreCompañia) {
        this.nombreCompañia = nombreCompañia;
    }
    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor=" + idProveedor +
                ", nombreCompañia='" + nombreCompañia + '\'' +
                ", nombrecontacto='" + nombrecontacto + '\'' +
                ", telegono='" + telefono + '\'' +
                '}';
    }
}
