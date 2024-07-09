package ConexionConSqL.comCoreNetwork;

import ConexionConSqL.comCoreNetwork.Modelo.Producto;
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
//        try {
//            System.out.println(atp1.consultarTodos());
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

        Producto p=new Producto();
        System.out.println("Escriba el id del producto");
        int id1=scanner.nextInt();
//        System.out.println("Escriba el nombre del producto");
//        String nombreDelProducto=scanner.next();
        p.setId_producto(id1);
//        p.setNombre_producto(nombreDelProducto);
        try {
            System.out.println(atp1.BorrarProducto(id1));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

}
