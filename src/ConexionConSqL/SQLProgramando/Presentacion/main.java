package ConexionConSqL.SQLProgramando.Presentacion;

import ConexionConSqL.SQLProgramando.Modelo.AccesoTablaProducto;

import java.sql.SQLException;

public class main
{
    private static AccesoTablaProducto accesoTablaProducto= new AccesoTablaProducto();
    public static void main(String[] args)
    {
        try {
            //System.out.println(accesoTablaProducto.consulProductoTerminan());
            System.out.println(accesoTablaProducto.consultarResumenCategoria(3));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
