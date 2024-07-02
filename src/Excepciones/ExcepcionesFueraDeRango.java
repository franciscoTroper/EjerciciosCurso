package Excepciones;

import herencia.ejercicios.Alumno;

import java.util.Arrays;
import java.util.Scanner;

public class ExcepcionesFueraDeRango extends Exception
{
    public ExcepcionesFueraDeRango(int indice, int longitudArray)
    {

        super("Indice fuera de rango su valor es "+ indice+" el valor maximo deberia ser " + longitudArray);
    }
}
class ExcepcionNotaInvalida extends Exception
{
    public ExcepcionNotaInvalida(int nota)
    {
        super("La nota debe estar en un rango de 0 a 10 y el numero enviado es ..." + nota);
    }
}

class EAlumno
{
    private String nombre;
    private int[] notas;

    public void asignarNota(int nota, int periodo) throws ExcepcionNotaInvalida, ExcepcionesFueraDeRango//Actualizar notas en periodos
    {
        //Validar nota
        if(nota>=0&&nota<=10)
        {
            //Todo bien
            if (periodo>=1&&periodo<=notas.length)
            {
                //Nota y periodo correcto.
                notas[periodo-1]=nota;
            }
            else
            {
                throw new ExcepcionesFueraDeRango(periodo,notas.length);
            }
        }
        else
        {
            //Si entra aqui no es un valor valido
            throw new ExcepcionNotaInvalida(nota);
        }

    }


    public EAlumno(int numNotas)
    {
        notas=new int[numNotas];
    }

    public EAlumno(String nombre,int numNotas) {
        this(numNotas);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EAlumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}

class MainEAlumno
{
    public static void main(String[] args)
    {
        EAlumno a1=new EAlumno("Juan Lopez",4);
        Scanner s1=new Scanner(System.in);
        int nota,periodo;
        System.out.println("Escribe la nota");
        nota= s1.nextInt();
        System.out.println("Escribe el periodo");
        periodo=s1.nextInt();
        try
        {
            a1.asignarNota(nota,periodo);
        }
        catch (ExcepcionNotaInvalida e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        catch (ExcepcionesFueraDeRango e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }
}

