package Socket.ejercicioPostgred;

import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.*;
import java.util.Scanner;

public class CuentaBancaria
{
    private String noTarjeta;
    private double saldo;
    private String pin;
    Conexion conexion=new Conexion();
    Scanner scanner=new Scanner(System.in);

    public double solicitarSaldo() throws SQLException {

        System.out.println("introduce tu numero tarjeta: ");
        String numTarjeta= scanner.next();
        conexion.abrir("nortwind3");
        PreparedStatement statement=conexion.getMiconexion().prepareStatement("select saldo from cuenta_bancaria where no_tarjeta=?");
        statement.setString(1,numTarjeta);
        ResultSet resultSet=statement.executeQuery();
        double saldoOut= resultSet.getDouble("saldo");
        resultSet.close();
        statement.close();
        return saldoOut;
    }
    public String obtenerPin() throws SQLException {
        System.out.println("introduce tu numero tarjeta: ");
        String numTarjeta= scanner.next();
        conexion.abrir("nortwind3");
        PreparedStatement statement=conexion.getMiconexion().prepareStatement("select pin from cuenta_bancaria where no_tarjeta=?");
        statement.setString(1,numTarjeta);
        ResultSet resultSet=statement.executeQuery();
        String pin=resultSet.getString("pin");
        resultSet.close();
        statement.close();
        return pin;
    }
    public String actualizarSaldo() throws SQLException {
        System.out.print("introduce tu numero tarjeta: ");
        String numTarjeta= scanner.next();
        System.out.print("cantidad ingresar: ");
        double nuevaCantidad=scanner.nextDouble();
        conexion.abrir("nortwind3");
        PreparedStatement preparedStatement=conexion.getMiconexion().prepareStatement("INSERT INTO cuenta_bancaria (saldo) VALUES (?) where no_tarjeta=?; ");
        int numfilas= preparedStatement.executeUpdate();
        preparedStatement.close();
        preparedStatement=conexion.getMiconexion().prepareStatement("select saldo from cuenta_bancaria where no_tarjeta=?");
        preparedStatement.setString(1,numTarjeta);
        ResultSet resultSet=preparedStatement.executeQuery();
        double nuevosaldo=resultSet.getDouble("saldo");
        resultSet.close();
        preparedStatement.close();
        conexion.cerrar();

        return numTarjeta+","+ nuevosaldo;


    }

}
