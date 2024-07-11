package ConexionConSqL.Ejercicios;

import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2
{

    public static void main(String[] args)
    {
        Conexion c1=new Conexion();
        try {
            c1.abrir("nortwind3");
            Statement statement=c1.getMiconexion().createStatement();
            //String consulta="select * from order_details where product_id = 11";
            String consulta="select sum(unit_price) as precio,sum(quantity) as cantidades from order_details where product_id=11";
            ResultSet resultSet=statement.executeQuery(consulta);
            while (resultSet.next())
            {
//                System.out.print("Order_id: "+resultSet.getInt("order_id"));
//                System.out.print (" ");
//                System.out.print("product_id: "+resultSet.getInt("product_id"));
//                System.out.print (" ");
                System.out.print("id11:"+"unit_price: "+resultSet.getDouble("precio"));
                System.out.print (" ");
                System.out.print("id11: "+"quantity: "+resultSet.getInt("cantidades"));
                System.out.print (" ");
//                System.out.println("discount: "+resultSet.getDouble("discount"));
//                System.out.print (" ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }
}
