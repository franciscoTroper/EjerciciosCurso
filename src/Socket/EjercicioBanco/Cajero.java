package Socket.EjercicioBanco;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Cajero
{
    private byte opcion;
    private Scanner scanner;
    private int cuentaCliente;

    public Cajero() {
        opcion=0;
        scanner=new Scanner(System.in);
        cuentaCliente =0;
    }

    public void crearCuenta() {

    }
    public void borrarCuenta() {

    }
    public void consultarDinero() {

    }
    public void ingresarDinero() {

    }
    public void retirarDinero() {

    }
    public boolean existeCuenta(int cuenta) throws IOException
    {
        BufferedReader bf=Banco.getInfo();
        boolean existeOut=false;
        int contador=0;
        while (true)
        {
            String linea=bf.readLine();
            String[] valores=new String[3];
            for (int a=0;a<linea.length();a++)
            {
                if (linea.charAt(a) != ',')
                {
                    valores[contador] += linea.charAt(a);
                }
                else
                {
                    contador++;
                }
            }

            if (valores[1].equals(cuenta)){existeOut=true;}
            contador=0;
        }
    }


    public void cajeroCliente() throws IOException {
        System.out.println("Ingresa tu numero de cuenta");
        cuentaCliente =scanner.nextInt();
        if (existeCuenta(cuentaCliente)){
            System.out.println("Que quierees hacer: ");
            System.out.println("1. Borrar cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Consultar dinero");
            System.out.println("5. Salir");
            int numeroIntroducido=scanner.nextInt();
            if (numeroIntroducido==1){
                borrarCuenta();
                cajeroCliente();
            }
            else if (numeroIntroducido==2) {
                ingresarDinero();
                cajeroCliente();
            }
            else if (numeroIntroducido==3) {
                retirarDinero();
                cajeroCliente();
            }
            else if (numeroIntroducido==4) {
                consultarDinero();
                cajeroCliente();
            }
            else if (numeroIntroducido==5) {}
        }
        else {
            System.out.println("Que quieres hacer: ");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Salir");
            int numeroIntroducido=scanner.nextInt();
            if (numeroIntroducido==1){crearCuenta();}
        }
    }
}
