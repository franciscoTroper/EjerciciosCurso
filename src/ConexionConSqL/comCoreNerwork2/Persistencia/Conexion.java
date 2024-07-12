package ConexionConSqL.comCoreNerwork2.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    protected Connection miconexion;

    public void abrir(String baseDedatos) throws SQLException
    {
        //1 Decir el driver que vamos a usar.

        try
        {Class.forName("org.postgresql.Driver");}
        catch (ClassNotFoundException e){System.out.println("Error");}
        //2 Obtener la conexion
        miconexion= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+baseDedatos,"postgres","networkfran4");
        System.out.println("conexion abierta");

    }
    public void cerrar() throws SQLException {miconexion.close();}
    public Conexion() {}
    public Connection getMiconexion() {return miconexion;}
    public void setMiconexion(Connection miconexion) {this.miconexion = miconexion;}
}
