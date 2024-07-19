package Socket.EjercicioBanco;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banco
{
    private static Map<Integer,Float> datosBanco;
    private static FileReader fileReader;

    public static void main(String[] args)
    {
        FileWriter fs = null;
        int contadorTransaccion = 0;
        try
        {
            ServerSocket servidor = new ServerSocket(3000);

            fs = new FileWriter("ServerBanco.txt", true);

            while (true)
            {
                System.out.println("Esoerando consulta de cliente ...");
                Socket s1 = servidor.accept();
                contadorTransaccion++;
                BufferedReader bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));

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
    public static BufferedReader getInfo() throws FileNotFoundException {
        fileReader=new FileReader("ServerBanco.txt");
        return new BufferedReader(fileReader);
    }

}

