package EjerciciosRepasoExamenAgosto.ConexionConSocket;

import Socket.teoria.Modelo.TiendaC;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ParteCliente
{
    public static void main(String[] args) {

      try {pcliente();}catch (IOException e){}

    }
    public static void pcliente() throws IOException {
        // 1. Solicitar los datos de las tiendas
        Cliente c1 = new Cliente("Fran","Dominguez Leiva", 40);
        // 2. Crear la conexion con el servidor
        Socket peticion = new Socket("localhost", 3000);
        // 3. Escribir en el outputStream
        PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
        sSalida.println(c1.toString());
        sSalida.flush();
        // 4. Leer que ha llegado las ventas
        BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
        System.out.println(bf.readLine());

    }
}
class Cliente
{
    private String Nombre;
    private String Apellidos;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, int edad) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
    }
}
class servidorSocket
{
     static long contadorTransaccion=0;
     private static FileWriter fs;
    public static void main(String[] args) {
        try {server();} catch (IOException e) {throw new RuntimeException(e);}
    }
    public static void server() throws IOException {
        //1. Instanciar el ServerSocket
        ServerSocket servidor = new ServerSocket(3000);
        fs = new FileWriter("Ventas.txt", true);
        //2. Ponerlo a la escucha
        while (true)
        {
            System.out.println("En espera de registrar ventas ...");
            //3. Obtener el socket
            Socket s1 = servidor.accept();
            //4. Leer el Stream
            contadorTransaccion++;
            BufferedReader bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            fs.write(bf.readLine() + "\n");
            fs.flush();
            //5. Escribir la confirmación de recibido
            PrintWriter sRespuesta = new PrintWriter(s1.getOutputStream(), true);
            sRespuesta.println("Se han recibido sus datos correctamente id -> " + contadorTransaccion);

        }
    }


}


