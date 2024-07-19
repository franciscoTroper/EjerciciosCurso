package Socket.ejercicioPostgred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Scanner;

public class Main
{
    private static Scanner scanner=new Scanner(System.in);
    private static byte respuestaMenu=0;
    private static CuentaBancaria cuentaBancaria=new CuentaBancaria();

    public static void main(String[] args) {
        System.out.println("Elije una opcion");
        System.out.println("1. solicitarSaldo");
        System.out.println("2. obtenerPin");
        System.out.println("3. actualizarSaldo");
        respuestaMenu=scanner.nextByte();
        if (respuestaMenu==1){
            try {
                double saldo=cuentaBancaria.solicitarSaldo();
                enviarSocket(saldo);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        else if (respuestaMenu==2){
            String pin= null;
            try {pin = cuentaBancaria.obtenerPin();enviarSocket(pin);}
            catch (SQLException e) {throw new RuntimeException(e);}
        }
        else if (respuestaMenu==3) {
            try {
                enviarSocket(cuentaBancaria.actualizarSaldo());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
    public static void enviarSocket(Object o)
    {
        try {

            Socket peticion = new Socket("localhost", 3000);

            PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
            sSalida.println(String.valueOf(o));
            sSalida.flush();

            BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
            System.out.println(bf.readLine());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
