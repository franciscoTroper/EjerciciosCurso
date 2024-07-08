package ConexionConSqL.comCoreNetwork.Persistencia;

import ConexionConSqL.comCoreNetwork.Modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoTablaProducto extends Conexion
{
    public Producto consultarUno(int id_producto) throws SQLException {
        Statement comando;
        ResultSet rejilla;
        String sqlSentencia="Select * from products where product_id= "+id_producto;
        Producto p1;
        //1.Abrir la conexion
        abrirConexion();
        //2. Crear el statement - se obtiene de la conexion.
        comando=miconexion.createStatement();
        //3 Ejecutar la sentencia
        rejilla=comando.executeQuery(sqlSentencia);
        //4 Verifico si ha habido resultado

        //5 Obetener cada una de las columnas.
        if (rejilla.next()){
            //Se pudo leer la fila.
            int idProducto=rejilla.getInt("product_id");
            String Nombre_Producto=rejilla.getString("product_name");
            double precio=rejilla.getDouble("unit_price");
            double cantidad_en_existencia=rejilla.getDouble("units_in_stock");
            p1=new Producto(id_producto, Nombre_Producto,precio,cantidad_en_existencia);

        }
        else
        {
            //Cuando no leyo una fila
            p1=new Producto();

        }
        //6 Devolevr el resultado.
        return p1;
    }
    public List<Producto> consultarTodos() throws SQLException {
        Statement comando;
        ResultSet rejilla;
        String sqlSentencia="Select * from products;";
        List<Producto> resultado=new ArrayList<>();
        //1.Abrir la conexion
        abrirConexion();
        //2. Crear el statement - se obtiene de la conexion.
        comando=miconexion.createStatement();
        //3 Ejecutar la sentencia
        rejilla=comando.executeQuery(sqlSentencia);
        //4 Verifico si ha habido resultado

        //5 Obetener cada una de las columnas.
        while (rejilla.next())
        {
           Producto p1=new Producto(rejilla.getInt("product_id"),
                                    rejilla.getString("product_name"),
                                    rejilla.getDouble("unit_price"),
                                    rejilla.getDouble("units_in_stock"));
           resultado.add(p1);
        }
        //6 Devolevr el resultado.
        return resultado;

    }

}
