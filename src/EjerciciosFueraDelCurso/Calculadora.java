package EjerciciosFueraDelCurso;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class Calculadora
{
    private static String[]numeros;
    private static int contadorNumero;
    private static Scanner entradaDatos;
    private static boolean salir;
    private static String operacion;
    private static String resultado;

    public Calculadora()
    {
        numeros=new String[100];
        contadorNumero=0;
        entradaDatos=new Scanner(System.in);
        salir=false;
        operacion="sumar";
        resultado="0";
    }
    public static void main(String[] args)
    {
        Operacion();
    }
    public static void Operacion()
    {
        System.out.print("Introduce número");
        numeros[contadorNumero]=entradaDatos.nextLine();
        System.out.print("¿Operacion?");
        operacion=entradaDatos.nextLine();
        if (operacion=="sumar"){Sumar();}
        else if (operacion=="restar") {Restar();}
        else if (operacion=="multiplicar") {Multiplicar();}
        else if (operacion=="dividir") {Dividir();}
    }
    public static void Sumar()
    {
        int contadorNumerosArriba=0,contadoresNumerosAbajo=0;
        String resultadoLocal="";
        char[]numArriba;
        char[]numabajo;
        char[]total= resultado.toCharArray();
        char[]numero= numeros[contadorNumero].toCharArray();
        if (total.length>numero.length)
        {
            numArriba=new char[total.length];numabajo=new char[numero.length];
        }
        else
        {
            numArriba=new char[numero.length];numabajo=new char[total.length];
        }

        for (int a=0;a<numArriba.length;a++)
        {
            resultadoLocal+=Character.getNumericValue(numArriba[contadorNumerosArriba]) + Character.getNumericValue(numabajo[contadoresNumerosAbajo]);
            if (resultadoLocal>10)
            {

            }
        }
    }
    public static void Restar()
    {

    }
    public static void Multiplicar()
    {

    }
    public static void Dividir()
    {

    }
}
