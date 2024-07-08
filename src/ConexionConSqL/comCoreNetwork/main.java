package ConexionConSqL.comCoreNetwork;

import ConexionConSqL.comCoreNetwork.Persistencia.AccesoTablaProducto;
import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.SQLException;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int id;
        AccesoTablaProducto atp1=new AccesoTablaProducto();
//        do
//        {
//            System.out.println("Escriba un numero de id para consultar: ");
//            id=scanner.nextInt();
//            try
//            {
//                System.out.println(atp1.consultarUno(id));
//            }
//            catch (SQLException e)
//            {
//                System.out.println(e.getMessage());
//                throw new RuntimeException(e);
//            }
//        }
//        while (id>0);
        try {
            System.out.println(atp1.consultarTodos());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
