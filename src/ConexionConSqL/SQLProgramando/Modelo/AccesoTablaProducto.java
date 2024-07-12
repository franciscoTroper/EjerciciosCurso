package ConexionConSqL.SQLProgramando.Modelo;

import ConexionConSqL.Ejercicios.Estadistica;
import ConexionConSqL.comCoreNetwork.Modelo.Producto;
import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesoTablaProducto
{
    Conexion c1=new Conexion();

    public List<Producto> consulProductoTerminan() throws SQLException {
        CallableStatement comando;
        ResultSet rejilla;
        String sqlSentencia="select * from productos_terminen_n();";
        List<Producto> resultado=new ArrayList<>();

       c1.abrir("nortwind3");

        comando=c1.getMiconexion().prepareCall(sqlSentencia);
        rejilla=comando.executeQuery();

        if (rejilla.next()){
            //Se pudo leer la fila.
            int idProducto=rejilla.getInt("productid");
            String Nombre_Producto=rejilla.getString("productname");
            double precio=rejilla.getDouble("unitprice");
            double cantidad_en_existencia=rejilla.getDouble("unitsinstock");
            Producto p1=new Producto(idProducto, Nombre_Producto,precio,cantidad_en_existencia);
            resultado.add(p1);
        }
        rejilla.close();
        comando.close();
        c1.cerrar();
        return resultado;
    }
    public Estadistica consultarResumenCategoria(int idcategoria) throws SQLException {
        CallableStatement comando;
        ResultSet rejilla;
        String sqlSentencia="select * from public.estadistica_categoria(?)";
        Estadistica resultado=null;

        c1.abrir("nortwind3");

        comando=c1.getMiconexion().prepareCall(sqlSentencia);
        comando.setInt(1,idcategoria);

        rejilla=comando.executeQuery();

        if (rejilla.next()){
            //Se pudo leer la fila.


            double precioPromedio=rejilla.getDouble("promedio");
            int cantidad_en_existencia=rejilla.getInt("inventario");
            resultado=new Estadistica(idcategoria,precioPromedio,cantidad_en_existencia);
        }
        rejilla.close();
        comando.close();
        c1.cerrar();
        return resultado;
    }


}
