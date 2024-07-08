package ConexionConSqL.comCoreNetwork.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    protected Connection miconexion;

    public void abrirConexion() throws SQLException {
        //1 Decir el driver que vamos a usar.

        try
        {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("Error");
        }
        //2 Obtener la conexion
        miconexion= DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/nortwind3","postgres","networkfran4");
        System.out.println("conexion abierta");

    }
    public void cerrarconexion() throws SQLException {
        miconexion.close();
    }

    public Conexion() {
    }

    public Connection getMiconexion() {
        return miconexion;
    }

    public void setMiconexion(Connection miconexion) {
        this.miconexion = miconexion;
    }
}
