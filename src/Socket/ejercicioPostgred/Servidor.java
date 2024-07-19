package Socket.ejercicioPostgred;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args)
    {

        FileWriter fs = null;
        int contadorTransaccion = 0;
        try
        {
            ServerSocket servidor = new ServerSocket(3000);

            fs = new FileWriter("ServerWebCuentasBancarias.txt", true);

            while (true)
            {
                System.out.println("Esoerando consulta de cliente ...");
                Socket s1 = servidor.accept();
                contadorTransaccion++;
                BufferedReader bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                System.out.println(bf.readLine());
                fs.write(bf.readLine() + "\n");
                fs.flush();

                PrintWriter sRespuesta = new PrintWriter(s1.getOutputStream(),true);
                sRespuesta.println("Se han recibido sus datos correctamente id -> " + contadorTransaccion);
            }

        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
