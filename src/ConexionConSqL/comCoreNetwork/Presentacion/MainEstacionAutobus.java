package ConexionConSqL.comCoreNetwork.Presentacion;

import ConexionConSqL.comCoreNetwork.Persistencia.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEstacionAutobus
{
    private static Scanner scanner=new Scanner(System.in);
    private static int resultadoMenu=0;
    private static Conexion conexion=new Conexion();
    private static PreparedStatement preparedStatement=null;
    private static ResultSet resultSet=null;
    private static List<List>datosConsulta=new ArrayList<>();
    private static int filasAfectadas;

    public static void main(String[] args)
    {
        try {
            conexion.abrir("estacionAutobuses");
            programaInicio();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void programaInicio()
    {
        System.out.println("Bienvenidos al AppTransportes. ¿Que quieres hacer?");
        System.out.println("1. Altas");
        System.out.println("2. Bajas");
        System.out.println("3. Modificacion");
        System.out.println("4. Consultas");
        System.out.println("5. Salir");
        System.out.print("Responder aqui: ");

        try
        {
            resultadoMenu=scanner.nextInt();
            if (resultadoMenu==1){altas();}
            else if (resultadoMenu==2) {bajas();}
            else if (resultadoMenu==3) {modificacion();}
            else if (resultadoMenu==4) {consultas();}
            else if (resultadoMenu==5) {System.exit(2);}
        }
        catch (Exception e){}
    }

    public static void altas()
    {
        System.out.println("Bienvenido a las altas. ¿Que quieres dar de alta?");
        System.out.println("1. Un nuevo autobus");
        System.out.println("2. Un nuevo conductor");
        System.out.println("3. Un nuevo destino");
        System.out.println("4. Un nuevo registro de viaje");
        System.out.println("5. Volver atras");
        System.out.print("Responde aquí: ");

        try {
            resultadoMenu= scanner.nextInt();
            if (resultadoMenu==1){altaAutobus();}
            else if (resultadoMenu==2) {altaConductor();}
            else if (resultadoMenu==3) {altaNuevoDestino();}
            else if (resultadoMenu==4) {altaNuevoRegistroDeVisitas();}
            else if (resultadoMenu==5) {programaInicio();}

        }catch (Exception e){}

    }
    public static void bajas()
    {
        System.out.println("Bienvenido a las bajas. ¿Que quieres dar de baja?");
        System.out.println("1. Un autobus");
        System.out.println("2. Un conductor");
        System.out.println("3. Un destino");
        System.out.println("4. Un registro de viaje");
        System.out.println("5. Volver atras");
        System.out.print("Responde aquí: ");

        try {
            resultadoMenu= scanner.nextInt();
            if (resultadoMenu==1){bajaAutobus();}
            else if (resultadoMenu==2) {bajaConductor();}
            else if (resultadoMenu==3) {bajaDestino();}
            else if (resultadoMenu==4) {bajaRegistroDeVisitas();}
            else if (resultadoMenu==5) {programaInicio();}

        }catch (Exception e){}
    }
    public static void modificacion()
    {
        System.out.println("Bienvenido a las modificaciones. ¿Donde quieres modificar?");
        System.out.println("1. En autobuses");
        System.out.println("2. En conductores");
        System.out.println("3. En destinos");
        System.out.println("4. En registros de viajes");
        System.out.println("5. Volver atras");
        System.out.print("Responde aquí: ");

        try {
            resultadoMenu= scanner.nextInt();
            if (resultadoMenu==1){modificarAutobuses();}
            else if (resultadoMenu==2) {
                modificarConductor();}
            else if (resultadoMenu==3) {modificarDestino();}
            else if (resultadoMenu==4) {modificarRegistroVisitas();}
            else if (resultadoMenu==5) {programaInicio();}

        }catch (Exception e){}
    }
    public static void consultas()
    {
        System.out.println("Bienvenido a las consultas. ¿Que quieres consultar?");
        System.out.println("1. consultar autobus");
        System.out.println("2. consultar conductores");
        System.out.println("3. consultar destinos");
        System.out.println("4. consultar registros de viaje");
        System.out.println("5. Volver atras");
        System.out.print("Responde aquí: ");

        try {
            resultadoMenu= scanner.nextInt();
            if (resultadoMenu==1){consultarAutobuses();}
            else if (resultadoMenu==2) {consultarConductores();}
            else if (resultadoMenu==3) {consultarDestinos();}
            else if (resultadoMenu==4) {consultarResgistrosDeVisitas();}
            else if (resultadoMenu==5) {programaInicio();}

        }catch (Exception e){}
    }
    public static void altaAutobus() throws SQLException
    {
        System.out.println("Demos de alta un nuevo autobus");
        System.out.print("Matricula: ");
        String matricula=scanner.next();
        System.out.print("Año de fabricacion");
        int añoFabricacion=scanner.nextInt();
        preparedStatement=conexion.getMiconexion().prepareStatement("insert into autobuses values (?,?)");
        filasAfectadas= preparedStatement.executeUpdate();
        preparedStatement.setString(1,matricula);
        preparedStatement.setInt(2,añoFabricacion);
        preparedStatement.close();

    }
    public static void altaConductor() throws SQLException {

        System.out.println("Demos de alta un nuevo conductor");
        System.out.print("DNI: ");
        String dni=scanner.next();
        System.out.print("Año de Nombre: ");
        String nombre=scanner.next();
        preparedStatement=conexion.getMiconexion().prepareStatement("insert into conductores values (?,?)");
        filasAfectadas= preparedStatement.executeUpdate();
        preparedStatement.setString(1,dni);
        preparedStatement.setString(2,nombre);
        preparedStatement.close();

    }
    public static void altaNuevoDestino() throws SQLException {

        System.out.println("Demos de alta un nuevo destino");
        System.out.print("idLugar: ");
        int idLugar=scanner.nextInt();
        preparedStatement=conexion.getMiconexion().prepareStatement("insert into conductores values (?)");
        filasAfectadas= preparedStatement.executeUpdate();
        preparedStatement.setInt(1,idLugar);
        preparedStatement.close();
    }
    public static void altaNuevoRegistroDeVisitas() throws SQLException {

        System.out.println("Demos de alta un nuevo registro de visitas");
        System.out.println("fechaVisita ");
        System.out.print("   Año: ");
        int añoLocal= scanner.nextInt();
        System.out.print("   Mes: ");
        int mesLocal=scanner.nextInt();
        System.out.print("   Dia: ");
        int diaLocal=scanner.nextInt();

        System.out.println("Ahora elije la matricula del autobus que quieres que haga la visita o el viaje: ");
        List<String>matriculasLocal=getMatriculasQueTengo();
        for (int a=0,b=1;a<matriculasLocal.size();a++,b++)
        {
            System.out.println(b+". "+matriculasLocal.get(a));
        }
        resultadoMenu= scanner.nextInt();
        String matriculaElegida=matriculasLocal.get(resultadoMenu);

        System.out.println("Ahora elige el lugar: ");
        List<Integer>lugares=consultarDestinos();
        for (int a=0,b=1;a< lugares.size();a++,b++)
        {
            System.out.println(b+". "+lugares.get(a));
        }
        resultadoMenu=scanner.nextInt();
        int lugarElegidoLocal=lugares.get(resultadoMenu);

        System.out.println("Ahora elije al conductor que quieres que haga el viaje");
        List<String> conductorLocal=consultarConductores();
        for (int a=0,b=1;a< conductorLocal.size();a++,b++)
        {
            System.out.println(b+". "+conductorLocal.get(a));
        }
        resultadoMenu=scanner.nextInt();
        String conductorElegido=conductorLocal.get(resultadoMenu);

        preparedStatement=conexion.getMiconexion().prepareStatement("insert into conductores values (?,?,?,?,?)");
        preparedStatement.setInt(1,getUltimoResgistroDeVisitas());
        preparedStatement.setDate(2,new Date(añoLocal,mesLocal,diaLocal));
        preparedStatement.setString(3,matriculaElegida);
        preparedStatement.setInt(4,lugarElegidoLocal);
        preparedStatement.setString(5,conductorElegido);
        filasAfectadas= preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    public static int bajaAutobus() throws SQLException {

        List<String>matriculasLocal=getMatriculasQueTengo();
        System.out.println("Elige el autobus que quieres dar de baja por el numero de matriculo");

        for (int a=0,b=1;a<matriculasLocal.size();a++,b++)
        {
            System.out.println(b+". "+matriculasLocal.get(a));
        }
        resultadoMenu=scanner.nextInt();
        String autbusElegido=matriculasLocal.get(resultadoMenu);
        preparedStatement=conexion.getMiconexion().prepareStatement("delete matricula,a_fabricacion from autobuses where matricula=?");
        preparedStatement.setString(1,autbusElegido);
        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;
    }
    public static int bajaConductor() throws SQLException {
        List<String>conductorLocal=consultarConductores();
        System.out.println("Elige al conductor que quieres dar de baja:");

        for (int a=0,b=1;a<conductorLocal.size();a++,b++)
        {
            System.out.println(b+". "+conductorLocal.get(a));
        }
        resultadoMenu=scanner.nextInt();
        String conductorElegidoLocal=conductorLocal.get(resultadoMenu);
        preparedStatement=conexion.getMiconexion().prepareStatement("delete dni,nombre from conductores where nombre=?");
        preparedStatement.setString(1,conductorElegidoLocal);
        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;
    }
    public static int bajaDestino() throws SQLException {
        List<Integer>lugares=consultarDestinos();
        System.out.println("Elige el lugar que quieres dar de baja");

        for (int a=0,b=1;a<lugares.size();a++,b++)
        {
            System.out.println(b+". "+lugares.get(a));
        }
        resultadoMenu=scanner.nextInt();
        int lugarElegidoLocal=lugares.get(resultadoMenu);
        preparedStatement=conexion.getMiconexion().prepareStatement("delete id_lugar from lugares where id_lugar=?");
        preparedStatement.setInt(1,lugarElegidoLocal);
        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;
    }
    public static int bajaRegistroDeVisitas() throws SQLException {
        List<Integer>idVisitasLocal=getRegistrosDeVisitasPorId();
        System.out.println("Elige el autobus que quieres dar de baja por el numero de matriculo");

        for (int a=0,b=1;a<idVisitasLocal.size();a++,b++)
        {
            System.out.println(b+". "+idVisitasLocal.get(a));
        }
        resultadoMenu=scanner.nextInt();
        int lugarElegido=idVisitasLocal.get(resultadoMenu);
        preparedStatement=conexion.getMiconexion().prepareStatement("delete matricula,a_fabricacion from autobuses where id_lugar=?");
        preparedStatement.setInt(1,lugarElegido);
        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;
    }
    public static int modificarAutobuses() throws SQLException {
        List<String>matriculasLocal=getMatriculasQueTengo();
        System.out.println("Elige el autobus que quieres modificar");

        for (int a=0,b=1;a<matriculasLocal.size();a++,b++)
        {
            System.out.println(b+". "+matriculasLocal.get(a));
        }
        resultadoMenu=scanner.nextInt();
        String autobusElegido=matriculasLocal.get(resultadoMenu);
        System.out.println("Modifica los siguientes campos.");
        System.out.print("Matricula: ");
        String matriculaLocal=scanner.next();
        System.out.println("Año de fabricacion: ");
        int añoFabricacionLocal=scanner.nextInt();

        preparedStatement=conexion.getMiconexion().prepareStatement("update autobuses value(?,?) where matricula=?");
        preparedStatement.setString(1,matriculaLocal);
        preparedStatement.setInt(2,añoFabricacionLocal);
        preparedStatement.setString(3,autobusElegido);
        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;
    }
    public static int modificarConductor() throws SQLException {
        List<String>conductoresLocal=consultarConductores();
        System.out.println("Elige el conductor que quieres modificar");

        for (int a=0,b=1;a<conductoresLocal.size();a++,b++)
        {
            System.out.println(b+". "+conductoresLocal.get(a));
        }

        resultadoMenu=scanner.nextInt();
        String conductorElegidoLocal=conductoresLocal.get(resultadoMenu);
        System.out.println("Modifica los siguientes campos.");
        System.out.print("DNI: ");
        String dniLocal=scanner.next();
        System.out.println("Nombre: ");
        String nombreLocal=scanner.next();

        preparedStatement=conexion.getMiconexion().prepareStatement("update conductores value(?,?) where dni=?");
        preparedStatement.setString(1,dniLocal);
        preparedStatement.setString(2,nombreLocal);
        preparedStatement.setString(3,dniLocal);
        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;
    }
    public static int modificarDestino() throws SQLException {
        List<Integer>destinosLocal=consultarDestinos();
        System.out.println("Elige el destino que quieres modificar");

        for (int a=0,b=1;a<destinosLocal.size();a++,b++)
        {
            System.out.println(b+". "+destinosLocal.get(a));
        }

        resultadoMenu=scanner.nextInt();
        int idLocalACambiar=destinosLocal.get(resultadoMenu);
        System.out.println("Modifica los siguientes campos.");
        System.out.print("idLugar: ");
        int idLugarElegido=scanner.nextInt();

        preparedStatement=conexion.getMiconexion().prepareStatement("update lugares value(?) where id_lugar=?");
        preparedStatement.setInt(1,idLugarElegido);
        preparedStatement.setInt(2,idLocalACambiar);

        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;

    }
    public static int modificarRegistroVisitas() throws SQLException {
        List<Integer>destinosLocal=getRegistrosDeVisitasPorId();
        System.out.println("Elige la visita o el viaje que quieres modificar");

        for (int a=0,b=1;a<destinosLocal.size();a++,b++)
        {
            System.out.println(b+". "+destinosLocal.get(a));
        }

        int contadorInterrogacionesquitadas=4;
        resultadoMenu=scanner.nextInt();
        int datosdeVisitasACambiar=destinosLocal.get(resultadoMenu);
        System.out.println("¿Que dato quieres modificar?");
        System.out.println("1. Fecha");
        System.out.println("2. bus");
        System.out.println("3. Lugar");
        System.out.println("4. Conductor");
        System.out.println("5. Volver atras");
        resultadoMenu= scanner.nextInt();
        if (resultadoMenu==1)
        {

            System.out.print("fecha de visita: ");
            System.out.print("  Año: ");
            int anoLocal= scanner.nextInt();
            System.out.print("  Mes: ");
            int mesLocal=scanner.nextInt();
            System.out.print("  Dia: ");
            int diaLocal=scanner.nextInt();

            preparedStatement=conexion.getMiconexion().prepareStatement("update visitas values(?) where id_visita=? and ");
            preparedStatement.setDate(1,new Date(anoLocal,mesLocal,diaLocal));
            preparedStatement.setInt(2,datosdeVisitasACambiar);
            filasAfectadas= preparedStatement.executeUpdate();
            modificarRegistroVisitas();
        }
        else if (resultadoMenu==2)
        {
            String autobusACambiarLocal;
            String matriculaNuevaElegida;

            List<String>buses=getMatriculasQueTengo();
            System.out.print("Elije la matricula: ");
            for (int a=0,b=1;a<buses.size();a++,b++)
            {
                System.out.println(b+". "+buses.get(a));
            }
            int matriculaElegida=scanner.nextInt();
            autobusACambiarLocal=buses.get(matriculaElegida);
            System.out.println("Elige la otra matricula");

            for (int a=0,b=1;a<buses.size();a++,b++)
            {
                System.out.println(b+". "+buses.get(a));
            }
            matriculaElegida=scanner.nextInt();
            matriculaNuevaElegida=buses.get(matriculaElegida);

            preparedStatement=conexion.getMiconexion().prepareStatement("update visitas values(?) where id_visita=?");

        }







        System.out.println("Quieres cambiar el viaje de destino para este viaje");
        boolean logicaDestino=scanner.nextBoolean();
        int destinoACambiar;
        int destinoNuevo;
        if (logicaDestino)
        {
            List<Integer>destinos=consultarDestinos();
            System.out.print("Elije el destino a cambiar: ");
            for (int a=0,b=1;a<destinos.size();a++,b++)
            {
                System.out.println(b+". "+destinos.get(a));
            }
            resultadoMenu=scanner.nextInt();
            destinoACambiar=destinos.get(resultadoMenu);

            System.out.println("Modifica que lugar quieres ir");
            for (int a=0,b=1;a<destinos.size();a++,b++)
            {
                System.out.println(b+". "+destinos.get(a));
            }
            resultadoMenu=scanner.nextInt();
            destinoNuevo=destinos.get(resultadoMenu);
        }else {contadorInterrogacionesquitadas--;}
        System.out.println("Quieres cambiar de conductor para este viaje");
        boolean logicaConductor=scanner.nextBoolean();
        String conductorSustituido;
        String nuevoConductor;
        if (logicaConductor)
        {
            List<String> conductoresQueHay=consultarConductores();
            System.out.println("Elije el conductor a cambiar");
            for (int a=0,b=1;a<conductoresQueHay.size();a++,b++)
            {
                System.out.println(b+". "+conductoresQueHay.get(a));
            }
            resultadoMenu=scanner.nextInt();
            conductorSustituido=conductoresQueHay.get(resultadoMenu);
            System.out.println("Elije el nuevo conductor");
            for (int a=0,b=1;a<conductoresQueHay.size();a++,b++)
            {
                System.out.println(b+". "+conductoresQueHay.get(a));
            }
            resultadoMenu=scanner.nextInt();
            nuevoConductor=conductoresQueHay.get(resultadoMenu);
        }else {contadorInterrogacionesquitadas--;}
        String interrogaciones="";
        for(int a=0;a<contadorInterrogacionesquitadas;a++)
        {
            if (a==contadorInterrogacionesquitadas-1){interrogaciones+="?";}
            else {interrogaciones+="?,";}
        }
        if (contadorInterrogacionesquitadas>0)
        {
            preparedStatement=conexion.getMiconexion().prepareStatement("update visitas value("+interrogaciones+") where id_visita=?");
            preparedStatement.
        }






        filasAfectadas= preparedStatement.executeUpdate();
        return filasAfectadas;
    }
    public static void consultarAutobuses()
    {

    }
    public static List<String> consultarConductores() throws SQLException {
        Statement statement=conexion.getMiconexion().createStatement();
        resultSet=statement.executeQuery("select nombre from conductores order by dni; ");
        List<String>nombres=new ArrayList<>();
        while (resultSet.next())
        {
            nombres.add(resultSet.getString("nombre"));
        }
        return nombres;
    }
    public static List<Integer> consultarDestinos() throws SQLException {
        Statement statement=conexion.getMiconexion().createStatement();
        resultSet=statement.executeQuery("select id_lugar from lugares group by id_lugar;");
        List<Integer>idLugaresLocal=new ArrayList<>();
        while (resultSet.next())
        {
            idLugaresLocal.add(resultSet.getInt("id_lugar"));
        }
        return idLugaresLocal;
    }
    public static List<Object> consultarResgistrosDeVisitas() throws SQLException {

        List<Object>datos=new ArrayList<>();
        datos.add(resultSet.getInt("id_visita"));
        datos.add(resultSet.getDate("f-visita"));
        datos.add( resultSet.getString("matricula"));
        datos.add(resultSet.getInt("id_lugar"));
        datos.add(resultSet.getString("dni"));
        datosConsulta.add(datos);
        return datos;

    }
    public static int getUltimoResgistroDeVisitas() throws SQLException {
        Statement statement=conexion.getMiconexion().createStatement();
        resultSet= statement.executeQuery("select id_visita from visitas order by id_visita");
        int resultado=0;
        while (resultSet.next())
        {
            resultado=resultSet.getInt("id_visita");
        }
        resultSet.close();
        statement.close();
        return resultado+1;
    }
    public static List<String> getMatriculasQueTengo() throws SQLException {
        List<String>matriculasQueHay=new ArrayList<>();
        Statement statement=conexion.getMiconexion().createStatement();
        resultSet= statement.executeQuery("select * from autobuses");
        while (resultSet.next())
        {
            matriculasQueHay.add(resultSet.getString("matricula"));
        }
        resultSet.close();
        statement.close();
        return matriculasQueHay;
    }
    public static List<Integer> getRegistrosDeVisitasPorId() throws SQLException {
        List<Integer>datosLocal=new ArrayList<>();
        Statement statement=conexion.getMiconexion().createStatement();
        resultSet=statement.executeQuery("select id_visita from visitas");
        while (resultSet.next());
        {
            datosLocal.add(resultSet.getInt("id_visita"));
        }
        return datosLocal;
    }




}
