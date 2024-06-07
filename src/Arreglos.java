import java.util.Scanner;

public class Arreglos
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int numeroMasPequeno=999999999;
        int[] numeros = new int [3];
         numeros[0]=5;
         numeros[1]=6;
         numeros[2]=7;
        //Obtener el numero mas pequeño del array

        int[]numerosCopia=new int[numeros.length];
        int[]numerosMenosAMas=new int[numeros.length];
        for (int c=0;c<numeros.length;c++)
        {
            for(int d=0;d<numeros.length;d++)
            {
                if(numeros[d]<numeroMasPequeno)
                {
                    numeroMasPequeno=numeros[d];
                }
            }
            numerosCopia=numeros;
            numeros=new int[numeros.length-1];
            numerosMenosAMas[c]=numeroMasPequeno;
            for (int a=0;a<numeros.length;a++)
            {
                if()
            }
        }
        for (int c=0;c<numerosMenosAMas.length;c++)
        {
            System.out.println(numerosMenosAMas[c]);
        }

    }

}
