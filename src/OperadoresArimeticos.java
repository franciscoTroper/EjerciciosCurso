import java.util.Random;
import java.util.Scanner;

public class OperadoresArimeticos
{
    public static void main(String[] args)
    {
        //Calcular el perimetro de un rectangulo
        double lado=5,weight=7;
        double perimetroRectangulo= Math.pow(lado,2)*(Math.pow(weight,2));

        //Calcular area de cuadrado usando clase math
        double lado1=5,lado2=6;
        double areacuadrado=Math.pow(lado1*lado2,2);

        //Declarar variable  y luego incializarla incrementar en uno.
        int variable2=1;
        variable2++;

        //Simular un dado
        //Lanzarlo 100 veces
        //Calcular el porcentaje que ha salido cada número
        {
            Random random = new Random();
            int numaleatorio;

            float[] contadorDado = new float[6];
            for (int a = 0; a < 100; a++)
            {
                numaleatorio = random.nextInt( 6);
                contadorDado[numaleatorio]+=1;
            }
            int contador = 0;
            for (int a = 1; a < 7; a++)
            {
                System.out.println("Porcentaje de " + a + " es: " + contadorDado[contador] + " %");
                contador++;
            }
        }

        //Dado una serie de precios de 10 coches, se le pedira al cliente cual es su presupuesto y el programa indicara
        // a cuantos coches puede optar.

        Random randomPreciosCoches=new Random();
        int[]preciosCoches=new int[10];
        int presupuesto;
        for (int a=1,b=0;a<=10;a++,b++)
        {
            preciosCoches[b]=randomPreciosCoches.nextInt(10000,30000);
        }
        Scanner entradaDatos=new Scanner(System.in);
        System.out.println("¿Que presupuesto tienes?");
        presupuesto=entradaDatos.nextInt();
        int contador=0;
        int contadortotalCoches=0;
        for(int a:preciosCoches)
        {
            if (a< presupuesto)
            {
                contador++;
                contadortotalCoches++;
            }
            else
            {
                contador++;
            }
        }
        System.out.println("Tengo presupuesto para " + contadortotalCoches + " coches");


        //Ejemplo de tirar el dado y que salg un numero random de 1 al 6
        //lanzaremos el dado 10000 y después mostraremos los porcentajes de cada numero.

        {
            Random random = new Random();
            int numaleatorio;

            float[] contadorDado = new float[6];
            for (int a = 0; a < 10000; a++)
            {
                numaleatorio = random.nextInt( 6);
                contadorDado[numaleatorio]+=1;
            }
            contador = 0;
            for (int a = 1; a < 7; a++)
            {
                System.out.println("Porcentaje de " + a + " es: " + contadorDado[contador]/1001 + " %");
                contador++;
            }
        }

    }
}
