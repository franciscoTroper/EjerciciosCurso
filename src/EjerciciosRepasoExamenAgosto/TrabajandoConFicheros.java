package EjerciciosRepasoExamenAgosto;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TrabajandoConFicheros
{

    private static String ruta;
    private static FileWriter fileWriter;
    private static BufferedWriter bufferedWriter;
    private static PrintWriter printWriter;




    public static void main(String[] args)
    {
       //crearArchivoConFileWriter();
//        try {
//            escribirDatosNuevosEnUnArchivoConFileWriter();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            leerUnArchivoDeCharacteres();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try {
            //escribirDatosEnArchivoConFileOutStreamSinBorrarDatos();
            leerBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
    public static void crearArchivoConFileWriter()
    {
        try {
            ruta=Paths.get("").toAbsolutePath().toString();
            fileWriter=new FileWriter(ruta+"/src/EjerciciosRepasoExamenAgosto/ficheros/FileWriter.txt");
            bufferedWriter=new BufferedWriter(fileWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void escribirDatosNuevosEnUnArchivoConFileWriter() throws IOException {
        ruta=Paths.get("").toAbsolutePath().toString();
        fileWriter=new FileWriter(ruta+"/src/EjerciciosRepasoExamenAgosto/ficheros/FileWriter.txt",true);
        bufferedWriter=new BufferedWriter(fileWriter);
        printWriter=new PrintWriter(bufferedWriter);
        printWriter.println("EsteTexto");
        printWriter.flush();
    }
    public static void leerUnArchivoDeCharacteres() throws IOException {
        ruta=Paths.get("").toAbsolutePath().toString();
        FileReader fileReader=new FileReader(ruta+"/src/EjerciciosRepasoExamenAgosto/ficheros/FileWriter.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String frase="";
        while (frase!=null)
        {
            frase=bufferedReader.readLine();
            if (frase!=null){System.out.println(frase);}
        }
    }
    public static void escribirDatosEnArchivoConFileOutStreamSinBorrarDatos() throws IOException {
                                            ruta=Paths.get("").toAbsolutePath().toString();
        /*Datos a convertir*/               String data="Estos son los datos de salida en bytes";
                                            //char[] datosChar=data.toCharArray();
                                            byte[]datos=new byte[data.length()];
                                            for (int a=0;a<data.toCharArray().length;a++)
                                            {
                                                datos[a]= (byte) Character.getNumericValue(data.charAt(a));
                                            }
        /*Convertir datos a Byte*/

        /*Abrir*/                           FileOutputStream fileOutputStream=new FileOutputStream(ruta+"/src/EjerciciosRepasoExamenAgosto/ficheros/FileOutStream.txt",true);
        /*Escribir bytes en el archivo*/    fileOutputStream.write(datos); fileOutputStream.flush(); fileOutputStream.close();
    }
    public static void probando() throws IOException
    {
        ruta=Paths.get("").toAbsolutePath().toString();
        String data="Estos son los datos de salida en bytes";
        byte[] datos = data.getBytes();
        FileOutputStream fileOutputStream=new FileOutputStream(ruta+"/src/EjerciciosRepasoExamenAgosto/ficheros/FileOutStream.txt",true);
        OutputStream  dataOutputStream=new DataOutputStream (fileOutputStream);
        for (byte elemento:datos){dataOutputStream.write(elemento);}
        dataOutputStream.write(5);
        dataOutputStream.flush();
        dataOutputStream.close();

    }
    public static void leerBytes() throws IOException {
        ruta=Paths.get("").toAbsolutePath().toString();
        FileInputStream fileInputStream=new FileInputStream(ruta+"/src/EjerciciosRepasoExamenAgosto/ficheros/FileOutStream.txt");
        DataInputStream dataInputStream= new DataInputStream(fileInputStream);
        int num = 0;
        while (num!=-1)
        {
            num=dataInputStream.read();
            System.out.println(num);

        }

    }
}
