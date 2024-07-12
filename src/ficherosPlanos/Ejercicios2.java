package ficherosPlanos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

//Crear un ficher
//Hacer copia de ficher
//Mover un fichero
//Borrar u fichero
//Salir

//En todos los casos solicita el nombre del fichero y en caso de hacer copia o mover hay que solicitar una ruta, y sino te la dan,
//quiere decir que es en la misma carpeta.
public class Ejercicios2
{
    private static Scanner scanner=new Scanner(System.in);
    private static int respuestaMenu=0;
    private static File file;
    private static Path path;
    public static void main(String[] args)
    {

        try {
            programa();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void programa() throws IOException {
        System.out.println("Elije la opcion");
        System.out.println("1. Crear fichero");
        System.out.println("2. Copiar fichero");
        System.out.println("3. Mover fichero");
        System.out.println("4. Borrar fichero");
        System.out.println("5. salir");
        respuestaMenu=scanner.nextInt();
        if (respuestaMenu==1){crearFichero();}
        else if (respuestaMenu==2) {copiarFichero();}
        else if (respuestaMenu==3) {moverFichero();}
        else if (respuestaMenu==4) {borrarFichero();}
    }
    public static void crearFichero() throws IOException {
        System.out.print("Escribe el nombre del fichero: ");
        String nuevoArchivo= scanner.next();
        path=Path.of(nuevoArchivo);
        Files.createFile(path);
        programa();
    }
    public static void copiarFichero() throws IOException {
       System.out.println("introduce el nombre que quieres copiar");
       String archivoCopiar=scanner.next()+"_copia";
       path=Path.of(archivoCopiar);
       Files.createFile(path);
       programa();
    }
    public static void moverFichero() throws IOException {
        System.out.println("Escribe la nueva ruta: ");
        String nuevaruta=scanner.next();
        path=Path.of(nuevaruta);
        Files.createFile(path);
        Files.delete(Path.of("prueba.txt"));
        programa();
    }
    public static void borrarFichero() throws IOException {


        Files.delete(Path.of("prueba.txt"));
        programa();
    }

}

