import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Bubles
{
    public static void main(String[] args)
    {
        /*//Mostrar los numeros entre un rangos
        //Pedir estos numeros por la consola
        //Ascendente
        int rango1=3,rango2=10;
        for (int a=rango1+1;a<rango2;a++) {System.out.println(a);}

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
        System.out.println("Tengo presupuesto para " + contadortotalCoches + " coches");*/
        //Pedir por consola una frase
       /* Scanner entradaDatos2=new Scanner(System.in);
        System.out.println("Intoduce una frase");
        String pattern = "^[aeiouAEIOU]{1}[A-Za-z]*";
        String buscar="";
        if (buscar.matches(pattern)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }*/
        
        //Mostrar en la consola del 200 al 100
        for(int a=200;a>=100;a--){System.out.println(a);}

        //Mostrar si un alumno tiene decrecho a examen:
        //Solicitar el numero de horas del curso
        //Solicitar las asistencias
        //Solicitar las faltas 25
        //Solicitar si tiene la documentación
        //En la consola tiene que mostrarse puede presentar el examen o no


        Scanner entradaDatos3=new Scanner(System.in);

        /*System.out.println("¿Cuantas horas tiene el curso?");
        float horasDelCurso=entradaDatos3.nextFloat();
        entradaDatos3.nextLine();

        System.out.println("Faltas de asistencia");
        float faltasDeAsistencia=entradaDatos3.nextFloat();
        entradaDatos3.nextLine();

        System.out.println("Cuantas faltas tienes:");
        float faltas=entradaDatos3.nextFloat();
        entradaDatos3.nextLine();

        System.out.println("Tiene documentacion?");
        String tieneDocumentacion=entradaDatos3.nextLine();

        if(faltasDeAsistencia<=75||!tieneDocumentacion.equals("Si")||faltas<=25)
        {
            System.out.println("El alumno tiene derecho a examen");
        }
        else
        {
            System.out.println("El alumno no tiene derecho a examen");
        }
        entradaDatos3.close();

        //Declarar un array de string con diferentes articulos
        //Pedir por la consola nombre de producto
        //Buscar producto y decir si hay o no.*/

        String[] productos={"zapatos de charol","camisetas","Polos de fresa"};
        System.out.println("Ingresa el producto que quieres mirar");
        String productoElegido=entradaDatos3.nextLine();
        boolean hayproducto=false;
        for(String elemento:productos)
        {
            if (productoElegido.equals(elemento))
            {
                hayproducto=true;
                break;
            }
        }
        if (hayproducto)
        {
            System.out.println("Tenemos el producto que eligió");
        }
        else
        {
            System.out.println("No tenego el producto que eligió");
        }



    }
}
