package ejercicios.leeBaseDeDatosYcrearArchicoConEso.Presentacion;

import ejercicios.leeBaseDeDatosYcrearArchicoConEso.Modelo.Proveedor;
import ejercicios.leeBaseDeDatosYcrearArchicoConEso.Modelo.RangoComisiones;
import ejercicios.leeBaseDeDatosYcrearArchicoConEso.Persistencia.AccesoAProductos;

import java.io.*;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainPresentacion
{
    public static void main(String[] args)
    {

        try {

            leyendoArchivoYsubiendoDatosASQLPOSTGRED();

        } catch (IOException | SQLException e) {
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
    public static void leyendoArchivoYsubiendoDatosASQLPOSTGRED() throws IOException, SQLException {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal1;
        List<String> datos=leerDatosDearchivotxtYGuardarEnBaseDatosPostgred();
        RangoComisiones rangoComisiones;
        String letras="";
        for (int a=0;a< datos.size()-1;a++)
        {
            List<String>data=new ArrayList<>();
            for (char elemento:datos.get(a).toCharArray())
            {

                if(elemento!=','){letras+=elemento;}
                else {data.add(letras); letras="";}
            }
            data.add(letras); letras="";
            rangoComisiones=new RangoComisiones();
            rangoComisiones.setLimiteInferior(Double.parseDouble(data.get(0)));
            bigDecimal=new BigDecimal(rangoComisiones.getLimiteInferior());
            rangoComisiones.setLimiteSuperior(Double.parseDouble(data.get(1)));
            bigDecimal1=new BigDecimal(rangoComisiones.getLimiteSuperior());
            rangoComisiones.setPorcentae(Double.parseDouble(data.get(2)));
            AccesoAProductos accesoAProductos=new AccesoAProductos();
            accesoAProductos.insertarDatos(rangoComisiones);
        }

    }
}
