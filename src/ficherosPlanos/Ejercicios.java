package ficherosPlanos;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Ejercicios
{
    //Solicitar por consola 5 frases y escribirlas en un fichero con el nombre de Diciembre27.txt

    /*
    * Solicitar por consola el nombre y la edad de una persona (Cinco veces)
    * En el fichero de salida deberá salir
    * NOMBRE    EDAD
    * xxxxx     xxx
    * xxxxx     xxx
    * */

    private static Scanner scanner=new Scanner(System.in);
    private static FileWriter fileWriter;


    private static String filaFormateada;
    private static String nombres="";
    private static String edades="";
   // private static String formato = "%-15s %-10s",nombres,edades;
    //
    public static void main(String[] args) {

        for(int a=0;a<5;a++)
        {
            System.out.print("Escribe un nombre: ");
            nombres+=" "+scanner.next();
            System.out.print("Escribe su edad: ");
            edades+=" "+scanner.next();
        }
        filaFormateada=String.format("formato", nombres, edades);
        try {
            escritura(filaFormateada);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escritura(String parametroP) throws IOException {
        fileWriter=new FileWriter("ArchivoEjercicio.txt",true);
        fileWriter.write(String.format(parametroP));
        fileWriter.flush();
        fileWriter.close();
    }






}
