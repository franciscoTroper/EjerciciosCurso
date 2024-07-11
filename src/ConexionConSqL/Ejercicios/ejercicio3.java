package ConexionConSqL.Ejercicios;

import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ejercicio3
{
    private static Conexion c1=new Conexion();
    private static PreparedStatement preparedStatement=null;
    public static void main(String[] args)
    {
        try {
            c1.abrir("nortwind3");
            obtenerDatos("select * from order_details where order_id=? and product_id=? and unit_price=?" +
                    " and quantity=? and discount=?;");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean consultarOrder(int id) throws SQLException {
        c1.abrir("nortwind3");
        String estamento="select order_id from orders where order_id=?";
        PreparedStatement preparedStatement=c1.getMiconexion().prepareStatement(estamento);
        preparedStatement.setInt(1,id);
        ResultSet resultSet=preparedStatement.executeQuery();
        int contador=0;
        while (resultSet.next())
        {
            contador++;
        }
        if (contador>0){return true;}
        else {return false;}
    }
    public static void obtenerDatos(String estamento) throws SQLException
    {
        preparedStatement=c1.getMiconexion().prepareStatement(estamento);
        preparedStatement.setInt(1,10248);
        preparedStatement.setInt(2,70);
        preparedStatement.setDouble(3,356);
        preparedStatement.setInt(4,9);
        preparedStatement.setFloat(5,10);
        ResultSet resultSet= preparedStatement.executeQuery();
        while (resultSet.next())
        {
            System.out.print("[order_id: "+resultSet.getString("Order_id"));
            System.out.print("] [product_id: "+resultSet.getString("product_id"));
            System.out.print("] [unit_price: "+resultSet.getString("unit_price"));
            System.out.print("] [quantity: "+resultSet.getString("quantity"));
            System.out.print("] [discount: "+resultSet.getString("discount"));
            System.out.print("]");
        }

    }
    public static void insertar()
    {
                try{
            if (consultarOrder(10248))
            {
                String estamento="Insert into order_details(order_id,product_id,unit_price,quantity,discount) values" +
                        "(?,?,?,?,?)";
                preparedStatement=c1.getMiconexion().prepareStatement(estamento);
                preparedStatement.setInt(1,10248);
                preparedStatement.setInt(2,70);
                preparedStatement.setDouble(3,356);
                preparedStatement.setInt(4,9);
                preparedStatement.setFloat(5,10);
                int resultado=preparedStatement.executeUpdate();
                System.out.println(resultado);
            }
            else {}
        }catch (Exception e){}
    }

}
