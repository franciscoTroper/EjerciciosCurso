package ejercicios.leeBaseDeDatosYcrearArchicoConEso.Presentacion;

import ejercicios.leeBaseDeDatosYcrearArchicoConEso.Modelo.Proveedor;
import ejercicios.leeBaseDeDatosYcrearArchicoConEso.Persistencia.AccesoAProductos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainPresentacion
{
    public static void main(String[] args)
    {

        try {
            List<String> datos=leerDatosDearchivotxtYGuardarEnBaseDatosPostgred();
            for (String elemento:datos){System.out.println(elemento);}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void descargarDatosDePostgredYGuardarEnArchivoTxt() throws SQLException, IOException {
        AccesoAProductos accesoAProductos=new AccesoAProductos();

            List<Proveedor> proveedors= accesoAProductos.getDatos();
            FileWriter fileWriter=new FileWriter(new File("informe.Proveedores.txt"),true);
            fileWriter.write(  String.format("%5s %-40s %-30s %-15s","id","Nombre Compañia","NombreProveedor","Telefono")+"\n");
            fileWriter.write(  String.format("%5s %-40s %-30s %-15s","","","","")+"\n");
            for (int a=0;a<proveedors.size();a++)
            {
                fileWriter.write(  String.format("%5d %-40s %-30s %-15s",
                        proveedors.get(a).getIdProveedor(),proveedors.get(a).getNombreCompañia(),
                        proveedors.get(a).getNombrecontacto(),proveedors.get(a).getTelefono())+"\n");
            }
            fileWriter.flush();
            fileWriter.close();


    }
    public static List<String> leerDatosDearchivotxtYGuardarEnBaseDatosPostgred() throws IOException
    {
        FileReader fileReader=new FileReader("Rangocomisiones.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        List<String>datosOut=new ArrayList<>();
        String linea="0";
        while(true)
        {
            if (linea==null){break;}
            else {linea= bufferedReader.readLine(); datosOut.add(linea);}

        }
        return datosOut;
    }
}
