package ConexionConSqL.Ejercicios;

import java.sql.SQLException;

public class MainEjercicio2
{
    public static void main(String[] args)
    {
        Estadistica estadistica=new Estadistica();
        try {
            estadistica.consultaPorProducto(11);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
