import java.util.Random;
import java.util.Scanner;

public class MatricesMultidimensionales
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner entradaDatos=new Scanner(System.in);


    //Declarar una matriz de 5 * 5 y que haya 7 premios repartidos en el panel.

      /*  boolean[][] premios=new boolean[5][5];
        int fila=0;
        int columna=0;
        boolean logicaWhile=true;
        int recibirDatosFila=0;
        int recibirDatosColumna=0;

        for (int a=0;a<premios.length;a++)
        {
            for (int b=0; b<premios[a].length;b++)  {premios[a][b]=false;}
        }

        for(int a=0;a<7;a++)
        {
            fila = random.nextInt(0, 5);
            columna = random.nextInt(0, 5);
            if (!premios[fila][columna]) {premios[fila][columna] = true;}
            else {a--;}
        }

        System.out.println("Introduce un Numero de fila entre el 0 y el 4 y un numero de columna entre el 0 y el 4");
        System.out.print("   Num Fila: ");

       while (logicaWhile)
       {
           recibirDatosFila=entradaDatos.nextInt();
           if (recibirDatosFila<5&&recibirDatosFila>0){logicaWhile=false;}

       }
        System.out.print("   Num Columna: ");
       logicaWhile=true;
       while (logicaWhile)
       {
           recibirDatosColumna= entradaDatos.nextInt();
           if (recibirDatosColumna<5&&recibirDatosFila>0){logicaWhile=false;}
       }


        if (premios[recibirDatosFila][recibirDatosColumna])
        {
            System.out.println("La casilla elegida "+ fila+"-"+columna +" tiene premio");
        }
        else
        {
            System.out.println("La casilla elegida" + fila+"-"+columna+ " no tiene premio");
        }

        System.out.print("Las siguientes casillas tenian el premio: ");
        for (int a=0;a<premios.length;a++)
        {
            for (int b=0;b<premios[a].length;b++)
            {
                if (premios[a][b])
                {
                    System.out.println(" Casilla " + a +"-"+b);
                }
            }
        }*/

        //Dado los datos de coches, se le pedira al cliente cual
        //es su presupuesto y el programa indicara a cuantos coches puede optar

        int indice=0;
        String[] preciosCoches= {"Volvo-19_000","Audi-23_450","Seat-15_251","Bmw-30_251","Renault-15_365","Opel-19_251"};

        String [] precios=new String[preciosCoches.length];
        String cadena="";
        for (int a=0;a<preciosCoches.length;a++)
        {
            cadena=preciosCoches[a];

            for (int b=0;b<cadena.length();b++)
            {
                if (cadena.charAt(b)!='_')
                {
                    precios[a]+=cadena.charAt(b);
                }

            }

        }

        System.out.print("¿que presupuesto tienes?: ");
        int presupuestoCliente=entradaDatos.nextInt();
        int contadorCochesPuedeComprar=0;
        int precioReal=0;
        for (String elemento:precios)
        {
            indice=elemento.indexOf("-")+1;
            precioReal=Integer.parseInt(elemento.substring(indice,elemento.length()));
           if(presupuestoCliente>=precioReal)
            {
                contadorCochesPuedeComprar++;
            }

        }
        System.out.println("El cliente puede comprar "+ contadorCochesPuedeComprar + " coches");

    }

}
