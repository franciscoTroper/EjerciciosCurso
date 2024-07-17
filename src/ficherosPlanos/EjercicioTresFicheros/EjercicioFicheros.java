package ficherosPlanos.EjercicioTresFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioFicheros
{
    private static FileReader fileReader;
    private static FileReader fileReader2;
    private static BufferedReader bufferedReader;
    private static BufferedReader bufferedReader2;
    private static List<String>datosArchivo1=new ArrayList<>();
    private static List<String>datosArchivo2=new ArrayList<>();
    private static List<String>datosArchivo3=new ArrayList<>();
    private static String linea1="";
    private static String linea2="";
    private static FileWriter fileWriter;

    public static void main(String[] args)
    {

        try {
            ejercicioOrdenarNumeros();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void leyendoArchivos(String ruta1,String ruta2) throws IOException {
        fileReader = new FileReader(ruta1);
        fileReader2 = new FileReader(ruta2);
        bufferedReader = new BufferedReader(fileReader);
        bufferedReader2 = new BufferedReader(fileReader2);
    }
    public static void escribirArchivo() throws IOException {
        fileWriter=new FileWriter("src/ficherosPlanos/EjercicioTresFicheros/ficheroResultado.csv",true);
        for (String elemento:datosArchivo1)
        {
            fileWriter.write(elemento);
            fileWriter.flush();
        }
    }
    public static void ejerciciocopiarArchivosRepetidos() throws IOException {

        while(true)
        {
            linea1=bufferedReader.readLine();
            linea2=bufferedReader2.readLine();
            if (linea1==null){break;}
            else
            {

                if(linea1.equals(linea2))
                {
                    datosArchivo1.add(linea2);
                }
            }
        }
        escribirArchivo();
    }

    public static void ejercicioOrdenarNumeros() throws IOException {
        leyendoArchivos("src/ficherosPlanos/EjercicioTresFicheros/ficheroA.csv",
                        "src/ficherosPlanos/EjercicioTresFicheros/ficheroB.csv");
        while (true)
        {
            linea1=bufferedReader.readLine();
            linea2=bufferedReader2.readLine();
            if (linea1==(null)) {break;}
            else
            {
                datosArchivo1.add(linea1);
                datosArchivo2.add(linea2);
            }
        }
        for (int a=0;a<4;a++)
        {
            for (int b=0;b<4;b++)
            {
                int valor1=Integer.parseInt(datosArchivo1.get(b));
                int valor2=Integer.parseInt(datosArchivo2.get(a));
                if (valor1<valor2)
                {datosArchivo3.add(datosArchivo1.get(b));}
                else
                {
                    datosArchivo3.add(datosArchivo2.get(a));
                    b=4;
                }
            }
        }
        fileWriter=new FileWriter("src/ficherosPlanos/EjercicioTresFicheros/ficheroZ.csv",true);
        for (String elemento:datosArchivo3)
        {
            fileWriter.write(elemento);
            fileWriter.flush();
        }

    }
}
