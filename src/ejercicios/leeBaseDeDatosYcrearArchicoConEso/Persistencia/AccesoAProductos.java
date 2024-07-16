package ejercicios.leeBaseDeDatosYcrearArchicoConEso.Persistencia;

import ejercicios.leeBaseDeDatosYcrearArchicoConEso.Modelo.Proveedor;
import ejercicios.leeBaseDeDatosYcrearArchicoConEso.Modelo.RangoComisiones;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoAProductos
{
    private Conexion conexion=new Conexion();
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public List<Proveedor>getDatos() throws SQLException {
        List<Proveedor>outDatos=new ArrayList<>();
        Proveedor proveedor;
        conexion.abrir("nortwind3");
        statement=conexion.getMiconexion().createStatement();
        resultSet=statement.executeQuery("select supplier_id, company_name, contact_name, phone from suppliers");
        while (resultSet.next())
        {
            proveedor=new Proveedor();
            proveedor.setIdProveedor(resultSet.getInt("supplier_id"));
            proveedor.setNombreCompañia(resultSet.getString("company_name"));
            proveedor.setNombrecontacto(resultSet.getString("contact_name"));
            proveedor.setTelefono(resultSet.getString("phone"));
            outDatos.add(proveedor);

        }
        resultSet.close();
        statement.close();
        conexion.cerrar();
        return outDatos;
    }
    public int insertarDatos(RangoComisiones rangoComisiones) throws SQLException
    {
        int valueout=0;
        conexion.abrir("Darthwind");

            preparedStatement=conexion.getMiconexion().prepareStatement("insert into rango_comisiones (limite_inferior,limite_superior,porcentaje) values (?,?,?)");
            preparedStatement.setBigDecimal(1,new BigDecimal(rangoComisiones.getLimiteInferior()));
            preparedStatement.setBigDecimal(2,new BigDecimal(rangoComisiones.getLimiteSuperior()));
            preparedStatement.setDouble(3,rangoComisiones.getPorcentae());
            valueout=preparedStatement.executeUpdate();
            preparedStatement.close();
            conexion.cerrar();


        return valueout;
    }
}
