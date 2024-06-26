package BaseDeDatosPostgreSQL;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearArchivos
{
    public static void main(String[] args)
    {
        crearArchivo();
    }
    public static void crearArchivo()
    {
        String url = "jdbc:postgresql://localhost:5432/DesdeJava";
        String user = "postgres";
        String password = "networkfran4";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE archivos (id serial PRIMARY KEY, nombre_archivo text)";
            statement.executeUpdate(createTableSQL);
            System.out.println("Tabla 'archivos' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
