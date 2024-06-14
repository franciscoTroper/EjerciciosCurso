import java.util.Scanner;

public class CrearMetodos
{
    public static void main(String[] args)
    {
        System.out.print("Has sacado "+Cajero()+" €");
    }

    public static double Cajero()
    {
        Scanner entradaDatos=new Scanner(System.in);
        System.out.print("¿Cuanto dinero quieres sacar?: ");
        double dinero=entradaDatos.nextFloat();

        return dinero;
    }
}
