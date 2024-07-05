package ConexionConSqL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexionPostGred
{
    public static void main(String[] args)
    {
        try {
            abrirConexion();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        AccesoCategoria accesoCategoria=new AccesoCategoria();
        try {
            System.out.println(accesoCategoria.ObtenerTodas());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    protected static Connection miConexion;
    public static void abrirConexion()throws SQLException
    {
        try
        {
         Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("Error");
        }
        miConexion=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/nortwind3","postgres","networkfran4");
        System.out.println("conexion abierta");
    }

}
class Categoria
{
    private int id_category;
    private String nombre;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int id_category, String nombre, String descripcion) {
        this.id_category = id_category;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id_category=" + id_category +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
class AccesoCategoria extends ConexionPostGred
{
    public List<Categoria>ObtenerTodas()throws ClassNotFoundException,Exception
    {
        //1. Declarar variables
        List<Categoria> resultado = new ArrayList<>();
        Statement st;
        ResultSet rs;
        String sql = "select category_id,category_name,description from categories;";
        //2. Abrir la conexion
        abrirConexion();
        //3. Recoger el statement de la conexion
        st = miConexion.createStatement();
        //4. Ejecutar el statement
        rs = st.executeQuery(sql);
        //5. Recorrer el ResultSet
        while (rs.next()) {
//			int id = rs.getInt(1);
//			String nombre = rs.getString(2);
//			String descripcion = rs.getString(3);
//			Categoria c1 = new Categoria(id, nombre, descripcion);
//			resultado.add(c1);
            resultado.add(new Categoria(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        //6. Cerrar todo
        rs.close();
        st.close();
        miConexion.close();
        //7. Devolver la coleccion
        return resultado;
    }
}

