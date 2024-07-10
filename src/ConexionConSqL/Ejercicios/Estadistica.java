package ConexionConSqL.Ejercicios;

import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Estadistica
{
    private int product_id;
    private double venta;
    private int totalCantidad;

    @Override
    public String toString() {
        return "Estadistica{" +
                "product_id=" + product_id +
                ", venta=" + venta +
                ", totalCantidad=" + totalCantidad +
                '}';
    }

    public Estadistica() {}

    public Estadistica(int product_id, double venta, int totalCantidad) {
        this.product_id = product_id;
        this.venta = venta;
        this.totalCantidad = totalCantidad;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public int getTotalCantidad() {
        return totalCantidad;
    }

    public void setTotalCantidad(int totalCantidad) {
        this.totalCantidad = totalCantidad;
    }

    public void consultaPorProducto(int idProducto)throws SQLException
    {
        Conexion c1=new Conexion();
        c1.abrirConexion();
        String sentencia="select sum(unit_price) as precio,sum(quantity) as cantidades from order_details where product_id=?";
        PreparedStatement preparedStatementstatement=c1.getMiconexion().prepareStatement(sentencia);
        preparedStatementstatement.setInt(1,idProducto);
        ResultSet resultSet=preparedStatementstatement.executeQuery();
        while (resultSet.next())
        {
            System.out.println(resultSet.getDouble("precio"));
            System.out.println(resultSet.getInt("cantidades"));
        }

    }
}
