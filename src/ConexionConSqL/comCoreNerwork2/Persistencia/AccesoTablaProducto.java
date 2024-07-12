package ConexionConSqL.comCoreNerwork2.Persistencia;

import ConexionConSqL.comCoreNetwork.Modelo.Producto;
import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoTablaProducto extends Conexion
{

//    public static List<String> consultarUno(int id_tabla /*clasePadre. Esta tiene que ser una interfaz que implemente metodos comunes*/) throws SQLException {
//        Conexion conexion=new Conexion();
//        PreparedStatement preparedStatement;
//        ResultSet resultSet;
//        String sqlSentencia="Select * from products where product_id= ?; ";
//        List<String>datos=new ArrayList<>();
//
//        conexion.abrir("EstacionAutobus");
//        preparedStatement=conexion.getMiconexion().prepareStatement(sqlSentencia);
//        preparedStatement.setInt(id_tabla);
//        resultSet= preparedStatement.executeQuery();
//        int contador=0;
//        while (resultSet.next())
//        {
//            for (int a=0;a<column_name.length;a++)
//            {
//                datos.add(resultSet.get(column_name[contador]));
//            }
//
//        }
//
//
//
//        if (resultSet.next()){
//            //Se pudo leer la fila.
//            int idProducto=resultSet.getInt("product_id");
//            String Nombre_Producto=resultSet.getString("product_name");
//            double precio=resultSet.getDouble("unit_price");
//            double cantidad_en_existencia=resultSet.getDouble("units_in_stock");
//            p1=new Producto(id_tabla, Nombre_Producto,precio,cantidad_en_existencia);
//
//        }
//        else
//        {
//            //Cuando no leyo una fila
//            p1=new Producto();
//
//        }
//        //6 Devolevr el resultado.
//        resultSet.close();
//        preparedStatement.close();
//        cerrar();
//        return p1;
//    }
    public List<Producto> consultarTodos() throws SQLException {
        Statement comando;
        ResultSet rejilla;
        String sqlSentencia="Select * from products;";
        List<Producto> resultado=new ArrayList<>();
        //1.Abrir la conexion
        abrir("nortwind3");
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
        rejilla.close();
        comando.close();
        cerrar();
        return resultado;

    }
    public int insertaProducto(Producto productoP) throws SQLException {
     //1. Declarar variables
        Statement comando;
        int resultado;
        String sql="insert into products (product_id,product_name,discontinued) values("+ productoP.getId_producto()+ ", '"+ productoP.getNombre_producto() +"',1)";
        //2. Abrir conexion
        abrir("nortwind3");
        //3. Obtener statement
        comando=miconexion.createStatement();
        resultado=comando.executeUpdate(sql);
        comando.close();
        cerrar();
        //4. Devolver resultado
        return resultado;
    }
    public int actualizarProducto(Producto productoP) throws SQLException {
        //1. Declarar variables
        Statement comando;
        int resultado;
        String sql="update products set product_name='"+ productoP.getNombre_producto()+"' where product_id= " +
        productoP.getId_producto();
        //2. Abrir conexion
        abrir("nortwind3");
        //3. Obtener statement
        comando=miconexion.createStatement();
        resultado=comando.executeUpdate(sql);
        comando.close();
        cerrar();
        //4. Devolver resultado
        return resultado;
    }
    public int BorrarProducto(int id_productoP) throws SQLException {
        //1. Declarar variables
        Statement comando;
        int resultado;
        String sql = "delete from products where product_id = " + id_productoP;
        //2. Abrir conexion
        abrir("nortwind3");
        //3. Obtener statement
        comando = miconexion.createStatement();
        resultado = comando.executeUpdate(sql);
        comando.close();
        cerrar();
        //4. Devolver resultado
        return resultado;
    }


}
