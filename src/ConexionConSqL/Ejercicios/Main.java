package ConexionConSqL.Ejercicios;

import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Ejercicio de practica de acceso a BBDD
//Ejercitando el Statement
//
//1. Insertar un empleado
//2. Modificar un empleado
//3. Consultar todos los empleado
//4. Obtener el total de empleados
//5. Consultar un empleado por nombre (consultar todo el nombre o parte del nombre)
//6. Salir.
public class Main
{
    private static Conexion c1;
    private static Statement comando;
    private static Scanner scanner=new Scanner(System.in);
    private static int idEmpleado;
    private static String nombre;
    private static String apellido;
    private static int resultado=0;
    private static ResultSet resultSet;

    public static void main(String[] args)
    {
        c1=new Conexion();
        try {c1.abrirConexion();}
        catch (SQLException e) {e.getMessage(); throw new RuntimeException(e);}
        try {
            ProgramaScanner();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ProgramaScanner() throws SQLException {
        System.out.println("¿que quieres hacer?");
        System.out.println("1. Insertar empleado");
        System.out.println("2. Modificar empleado");
        System.out.println("3. Consultar todos los empleados");
        System.out.println("4. Consultar numero total de empleados");
        System.out.println("5. Consultar empleado por nombre");
        System.out.println("6. Salir");
        int result= scanner.nextInt();
        if (result==1){insertarEmpleado("insert into employees ("+idEmpleado+","+nombre+","+apellido+")");}
        else if (result==2) {modificarEmpleado();}
        else if (result==3) {consultarTodosLosEmpleados();}
        else if (result==4) {consultarNumTotalEmpleados();}
        else if (result==5) {consultarEmpleadoPorNombre();}
        else if (result==6) {salir();}

    }
    public static void insertarEmpleado(String sentencia) throws SQLException
    {
        //Guardo los datos
        System.out.println("Inserta un empleado");
        System.out.print("Id: ");
        idEmpleado=scanner.nextInt();
        System.out.print("Nombre: ");
        nombre= scanner.next();
        System.out.print("Apellido: ");
        apellido= scanner.next();

        comando=c1.getMiconexion().createStatement();
        resultado=comando.executeUpdate("insert into employees (employee_id, first_name, last_name) values ("+idEmpleado+", '"+nombre+"','"+apellido+"')");
        if (resultado>0)
        {
            System.out.println("Has insertado el empleado con exito");
            comando.close();
        }
        else
        {
            System.out.println("No has insertado ningun empleado");
            comando.close();

        }

        ProgramaScanner();

    }
//    public static void insertarEmpleado(String sentencia) throws SQLException
//    {
//        //Guardo los datos
//        System.out.println("Inserta un empleado");
//        System.out.print("Id: ");
//        idEmpleado=scanner.nextInt();
//        System.out.print("Nombre: ");
//        nombre= scanner.next();
//        System.out.print("Apellido: ");
//        apellido= scanner.next();
//
//        comando=c1.getMiconexion().createStatement();
//        resultado=comando.executeUpdate("insert into employees (employee_id, first_name, last_name) values ("+idEmpleado+", '"+nombre+"','"+apellido+"')");
//        if (resultado>0)
//        {
//            System.out.println("Has insertado el empleado con exito");
//            comando.close();
//        }
//        else
//        {
//            System.out.println("No has insertado ningun empleado");
//            comando.close();
//
//        }
//
//        ProgramaScanner();
//
//    }

    public static void modificarEmpleado() throws SQLException {
        System.out.print("Introduce el id del empleado: ");
        idEmpleado=scanner.nextInt();
        System.out.print("Introduce el nombre nuevo: ");
        nombre= scanner.next();
        System.out.print("Introduce el apellido nuevo: ");
        apellido= scanner.next();
        comando=c1.getMiconexion().createStatement();
        resultado=comando.executeUpdate("update employees set first_name='"+nombre+"',last_name='"+apellido+"' where employee_id ="+idEmpleado+";");
        if (resultado>0)
        {
            System.out.println("Has modifica el empleado con exito");
            comando.close();
        }
        else
        {
            System.out.println("No has modificad ningun empleado");
            comando.close();
            ProgramaScanner();
        }
    }
    public static void consultarTodosLosEmpleados() throws SQLException {
       String sentencia="Select employee_id,first_name,last_name from employees";
        comando=c1.getMiconexion().createStatement();
        resultSet= comando.executeQuery(sentencia);
       while (resultSet.next())
       {
           System.out.println(resultSet.getInt("employee_id"));
           System.out.println(resultSet.getString("first_name"));
           System.out.println(resultSet.getString("last_name"));
       }
       resultSet.close();
       comando.close();
       ProgramaScanner();
    }
    public static void consultarNumTotalEmpleados() throws SQLException {
        String sentencia= "select employee_id from employees;";
        comando=c1.getMiconexion().createStatement();
        resultSet=comando.executeQuery(sentencia);
        resultado=0;
        while (resultSet.next())
        {
            resultado++;
        }

        System.out.println(resultado);
        comando.close();
        resultSet.close();
        ProgramaScanner();

    }
    public static void consultarEmpleadoPorNombre() throws SQLException {
        System.out.print("Introduce el nombre que quieres consultar: ");
        String nombrel=scanner.next();
        String sentencial="select first_name from employees where first_name like '"+nombrel+"'";
        comando=c1.getMiconexion().createStatement();
        resultSet=comando.executeQuery(sentencial);
        resultSet.next();
        System.out.println(resultSet.getString("first_name"));
        comando.close();
        resultSet.close();
        ProgramaScanner();

    }
    public static void salir()
    {
        System.exit(1);
    }
}
