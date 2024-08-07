package Socket.teoria.presentacion.clienteServidor;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class servidorTienda
{
    public static void main(String[] args) {
        FileWriter fs = null;
        int contadorTransaccion = 0;
        try {
            //1. Instanciar el ServerSocket
            ServerSocket servidor = new ServerSocket(3000);
            fs = new FileWriter("Ventas.txt", true);
            //2. Ponerlo a la escucha
            while (true) {
                System.out.println("En espera de registrar ventas ...");
                //3. Obtener el socket
                Socket s1 = servidor.accept();
                //4. Leer el Stream
                contadorTransaccion++;
                BufferedReader bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                fs.write(bf.readLine()+"\n");
                fs.flush();
                //5. Escribir la confirmación de recibido
                PrintWriter sRespuesta = new PrintWriter(s1.getOutputStream(),true);
                sRespuesta.println("Se han recibido sus datos correctamente id -> " + contadorTransaccion);

            }

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }finally{
            try {
                fs.close();
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }

    }
    public void copia()
    {
        {
            BufferedReader bf;
            PrintWriter sRespuesta;
            String respuesta = "";
            try (ServerSocket servidor = new ServerSocket(3000);){
                while (true){
                    System.out.println("En espera de peticiones ...");
                    Socket s1 = servidor.accept();
                    bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                    System.out.println(bf.readLine());
                    sRespuesta = new PrintWriter(s1.getOutputStream(),true);
                    sRespuesta.println("Se ha recibido su Hola mundo!!");
                }

            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

    }
}
