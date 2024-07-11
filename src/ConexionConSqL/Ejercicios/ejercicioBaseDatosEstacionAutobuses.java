package ConexionConSqL.Ejercicios;

import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicioBaseDatosEstacionAutobuses
{
    private static Conexion c1=new Conexion();
    private static PreparedStatement preparedStatement=null;
    private static String estamento="";
    private static Scanner scanner=new Scanner(System.in);
    private static int respuestaMenu;
    private static int filasAfectadas;
    private static List<String>datos=new ArrayList<>();
    public static void main(String[] args)
    {
        try {
            programaConductores();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<String> obtener(String sentencia,String[] clases,List<Object>datos,String[] nombreColumnas) throws SQLException
    {
        List<String>datosOutLocal=new ArrayList<>();
        c1.abrir("Estacionautobuses");
        preparedStatement=c1.getMiconexion().prepareStatement(sentencia);
        for(int a=0;a< clases.length;a++)
        {
            if (clases[a].equals("String")){preparedStatement.setString(a,String.valueOf(datos.get(a)));}
            else if (clases[a].equals("int")) {preparedStatement.setInt(a,(int)datos.get(a));}
            else if (clases[a].equals("double")) {preparedStatement.setDouble(a,(double)datos.get(a));}
            else if (clases[a].equals("float")) {preparedStatement.setFloat(a,(float)datos.get(a));}
            else if (clases[a].equals("bool")) {preparedStatement.setBoolean(a,(boolean)datos.get(a));}
        }
        ResultSet resultSet= preparedStatement.executeQuery();
        int contador=0;
        while (resultSet.next())
        {
            if (clases[contador].equals("String")){datosOutLocal.add(String.valueOf(resultSet.getString(nombreColumnas[contador])));
                System.out.println(datosOutLocal.get(contador));}
            else if (clases[contador].equals("int")) {datosOutLocal.add(String.valueOf(resultSet.getInt(nombreColumnas[contador])));
                System.out.println(datosOutLocal.get(contador));}
            else if (clases[contador].equals("double")) {datosOutLocal.add(String.valueOf(resultSet.getDouble(nombreColumnas[contador])));
                System.out.println(datosOutLocal.get(contador));}
            else if (clases[contador].equals("float")) {datosOutLocal.add(String.valueOf(resultSet.getFloat(nombreColumnas[contador])));
                System.out.println(datosOutLocal.get(contador));}
            else if (clases[contador].equals("bool")) {datosOutLocal.add(String.valueOf(resultSet.getBoolean(nombreColumnas[contador])));
                System.out.println(datosOutLocal.get(contador));}
           contador++;
        }
        return datosOutLocal;
    }
    public static List<String> obtener() throws SQLException
    {

        c1.abrir("Estacionautobuses");
        System.out.println("introduce el DNI: ");
        String dniLocal=scanner.next();
        String sentencia="select * from conductores where dni = ?";
        preparedStatement=c1.getMiconexion().prepareStatement(sentencia);
        preparedStatement.setString(1,dniLocal);
        ResultSet resultSet= preparedStatement.executeQuery();
        List<String>datos=new ArrayList<>();
        estamento=sentencia;

        while (resultSet.next())
        {
            System.out.println(resultSet.getString("dni"));
            System.out.println(resultSet.getString("nombre"));
        }
        resultSet.close();
        preparedStatement.close();
        c1.cerrar();
        programaConductores();
        return datos;
    }
    public static int ejecutar() throws SQLException
    {
        c1.abrir("Estacionautobuses");

        if (respuestaMenu==1)
        {
            System.out.println("Introducir valores");
            System.out.print("DNI: "); String dniLocal=scanner.next();
            System.out.print("NOMBRE: "); String nombreLocal= scanner.next();
            String estamento="insert into conductores (dni, nombre) values (?,?);";
            preparedStatement=c1.getMiconexion().prepareStatement(estamento);
            preparedStatement.setString(1,dniLocal);
            preparedStatement.setString(2,nombreLocal);
            filasAfectadas= preparedStatement.executeUpdate();
            programaConductores();
            return filasAfectadas;
        }
        else if (respuestaMenu==4)
        {
            System.out.println("Introducir valores");
            System.out.println("Introduce el dni del conductor que quieres modificar");
            String dniconductorAModificar=scanner.next();
            System.out.println("Introduce ahora la modificacion de los siguientes campos");
            System.out.print("DNI: "); String dniLocal=scanner.next();
            System.out.print("NOMBRE: "); String nombreLocal= scanner.next();
            String estamento="update conductores set dni=?, nombre=? where dni=?;";
            preparedStatement=c1.getMiconexion().prepareStatement(estamento);
            preparedStatement.setString(1,dniLocal);
            preparedStatement.setString(2,nombreLocal);
            preparedStatement.setString(3,dniconductorAModificar);
            filasAfectadas= preparedStatement.executeUpdate();
            programaConductores();
            return filasAfectadas;
        }
        else if (respuestaMenu==2)
        {
            System.out.print("Introduce el dni del empleado que quieres borrar: ");
            String dniLocal=scanner.next();
            String sentencia="DELETE FROM conductores WHERE dni = ?;";
            preparedStatement=c1.getMiconexion().prepareStatement(sentencia);
            preparedStatement.setString(1,dniLocal);
            filasAfectadas=preparedStatement.executeUpdate();
            if (filasAfectadas>0){System.out.println("se borro con exito");}
            else {System.out.println("El dni no coincide con ningun conductor");}
            programaConductores();
            return filasAfectadas;
        }
        preparedStatement.close();
        c1.cerrar();
        return filasAfectadas;
    }
    public static void programaConductores() throws SQLException {
        System.out.println("1. Alta conductor");
        System.out.println("2. Baja conductor");
        System.out.println("3. Consulta conductor");
        System.out.println("4. Modificacion conductor");
        System.out.println("5. Salir");
        System.out.println("Escriba la opcion ");
        respuestaMenu=scanner.nextInt();
        if (respuestaMenu==1){ejecutar();}
        else if (respuestaMenu==2) {ejecutar();}
        else if (respuestaMenu==3){datos=obtener();}
        else if (respuestaMenu==4){ejecutar();}
        else {System.exit(1);}

    }
    public static void programaVisitas()
    {
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Consultas");
        System.out.println("2. Nueva alta");
        System.out.println("3. Borrar registro");
        System.out.println("4. Modificar registro");
        System.out.println("5. Salir");
        System.out.print("Escribe aqui tu respuesta: ");
        try
        {
            respuestaMenu=scanner.nextInt();
            if (respuestaMenu==1){consultasVisitas();}
            else if (respuestaMenu==2) {nuevaAltaVisitas();}
            else if (respuestaMenu==3) {borrarAlta();}
            else if (respuestaMenu==4) {modificarAlta();}
            else {System.exit(1);}
        }
        catch (Exception e){System.out.println("No introdujiste un numero");}


    }
    public static void consultasVisitas()
    {
        System.out.println("Que te gustaria consultar: ");
        System.out.println("1. Lugares del autobus");
        System.out.println("2. Numero de autobuses que estuvieron en un lugar");
        System.out.println("3. Autobueses conducidos por el conductor que quieras consultar");
        System.out.println("4. Conductores que han conducido el autobus que elijas");
        System.out.println("5. Numero de conductores que estuvieron en el lugar que quieras consultar");
        System.out.println("6. Lugares donde estubo el conductor que quieras consultar");
        System.out.println("7. Volver atras");
        System.out.print("Escribe aqui tu respuesta: ");

        try
        {
            respuestaMenu=scanner.nextInt();
            if (respuestaMenu==1){consultasVisitas();}
            else if (respuestaMenu==2) {obtener();}
            else if (respuestaMenu==3) {obtener();}
            else if (respuestaMenu==4) {obtener();}
            else if (respuestaMenu==5) {obtener();}
            else if (respuestaMenu==6) {obtener();}
            else if (respuestaMenu==7) {programaVisitas();}
            else {System.out.println("Introdujiste otro numero. Prueba otra vez."); consultasVisitas();}
        }
        catch (Exception e)
        {
            System.out.println("No introduciste un numero");
            consultasVisitas();
        }


    }
    public static void nuevaAltaVisitas()
    {

    }
    public static void borrarAlta()
    {

    }
    public static void modificarAlta()
    {

    }

}
class Conductor
{
    private String dni;
    private String nombre;

    public Conductor() {
    }

    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "dni='" + dni + '\'' +
                ", nombre=" + nombre +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
class Autobus
{

}
class Lugares
{

}
class visitas
{
    private Date fVisita;
    private String matricula;
    private int idLugar;
    private String dni;
    private int idVisita;

    @Override
    public String toString() {
        return "visitas{" +
                "lugaresDelAutobus=" + fVisita +
                ", NumautobuesesEnelDestino=" + matricula +
                ", AutobusesConducidos=" + idLugar +
                ", ConductoresDelautobus=" + dni +
                ", numConductoresEnLugar=" + idVisita +
                ", lugaresDondeEstuvoElConductor=" + '}';
    }

    public visitas() {}

    public visitas(Date lugaresDelAutobus, String matricula, int idLugar,
                   String dni, int idVisita)
    {
        this.fVisita = lugaresDelAutobus;
        this.matricula = matricula;
        this.idLugar = idLugar;
        this.dni = dni;
        this.idVisita = idVisita;

    }

    public Date getfVisita() {return fVisita;}
    public String getMatricula() {return matricula;}
    public int getIdLugar() {return idLugar;}
    public String getDni() {return dni;}
    public int getIdVisita() {return idVisita;}


    public void setfVisita(Date fVisita) {this.fVisita = fVisita;}
    public void setMatricula(String matricula) {
        this.matricula = matricula;}
    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;}
    public void setDni(String dni) {
        this.dni = dni;}
    public void setIdVisita(int idVisita) {this.idVisita = idVisita;}

}



