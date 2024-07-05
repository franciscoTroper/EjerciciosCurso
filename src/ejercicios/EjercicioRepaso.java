package ejercicios;

import java.util.ArrayList;
import java.util.Collection;

public class EjercicioRepaso
{
    public static void main(String[] args)
    {
        //Ejercicio 0
        System.out.println(Math.sqrt(225));
        //Ejercicio 1
        float[]datos={45,78,34,87,76};
        float promedio=0;
        for (float elemento:datos)
        {
           promedio+=elemento;
        }
        System.out.println(promedio/datos.length);
        //Ejercicio 2
         String[]arraycadena1={"Hola ","nombre ","Fran"};
         String[]arrayCadena2={"Adios ","apellidos","Gustavo"};

         int longitudBucle;
         if (arraycadena1.length>=arrayCadena2.length){longitudBucle=arraycadena1.length;}
         else {longitudBucle=arrayCadena2.length;}
        String[]ArrayResultados=new String[longitudBucle];
         for(int a=0;a<longitudBucle;a++)
         {
             String localFor="null";
             String localFor2="null";
             try {localFor=arraycadena1[a];}
             catch (IndexOutOfBoundsException e){}

             try {localFor2=arrayCadena2[a];}
             catch (IndexOutOfBoundsException e){}

             if (!localFor.equals("null")&&!localFor2.equals("null"))
             {
                 ArrayResultados[a]=localFor+localFor2;
             }
             else if (!localFor.equals("null"))
             {
                 ArrayResultados[a]=localFor;
             }
             else {ArrayResultados[a]=localFor2;}


         }
        for (String elemento:ArrayResultados)
        {
            System.out.println(elemento);
        }
         //ejercicio 3

        int[] numeros=new int[23];
        String[]letras= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        for (int a=0;a<23;a++)
        {numeros[a]=a;}
        int numDNI=47518481;
        int numero= numDNI%23;
        String letraDni="";
        for (int a=0;a<numeros.length;a++)
        {
            if (numero==numeros[a]){letraDni=letras[a];}
        }
        System.out.println(numDNI+letraDni);




    }
}
//Ejercicio 0. Realizar la raíz cuadrada de 225 en un procedimiento main.
//Ejercicio 1. Realizar un procedimiento main que realice el promedio de 5 números que se almacene en un array de números float y se muestren sus datos.
//Ejercicio 2. Realizar un procedimiento main que realice la suma de dos matrices, se inicializan las matrices en el procedimiento y se muestra el resultado.
//Ejercicio 3. Realizar un procedimiento main que realice el cálculo de la letra del DNI cuyo algoritmo es el siguiente:
//La letra del NIF se obtiene a partir de un algoritmo conocido como módulo 23. El algoritmo consiste en aplicar la operación aritmética de módulo 23 al número del DNI. El módulo 23 es el número entero obtenido como resto de la división entera del número del DNI entre 23. El resultado es un número comprendido entre el 0 y el 22. En base a una tabla conocida se asigna una letra. La combinación del DNI con esa letra es el NIF.
//i.	Tabla de asignación
//0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
//T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E
//No se utilizan las letras: I, Ñ, O, U
