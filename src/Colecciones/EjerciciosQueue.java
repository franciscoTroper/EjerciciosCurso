package Colecciones;

import herencia.ejercicios.Alumno;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class EjerciciosQueue
{
    public static void main(String[] args) {
//        Queue filaSuper=new ArrayDeque(20);
//        filaSuper.offer(4);
//        filaSuper.offer(5);
//        filaSuper.offer(7);
//        filaSuper.offer(2);
//        System.out.println(filaSuper);
//        System.out.println(filaSuper.poll());
//        System.out.println(filaSuper);
//
//        Queue<Alumno>filaInscripcion=new ArrayDeque<>();
//        filaInscripcion.offer(new Alumno(4,"fram "));
//        filaInscripcion.offer(new Alumno(6,"Ramiro"));
//        System.out.println(filaInscripcion);
        QueueAtenderAlumnos queueAtenderAlumnos=new QueueAtenderAlumnos(32);
        queueAtenderAlumnos.Ejercicio();

    }
}
class QueueAtenderAlumnos
{

    private Queue<QueueAlumno> filaAlumnos;
    private int numMaxAlumnosFila;
    Scanner scanner=new Scanner(System.in);

    public QueueAtenderAlumnos(int numAlumnosFila)
    {
        filaAlumnos=new ArrayDeque<>(numAlumnosFila);
        numMaxAlumnosFila=numAlumnosFila;

    }




    public void Ejercicio()
    {
        System.out.println("¿Que quieres hacer?: ");
        System.out.println("1. agregar alumno a la fila");
        System.out.println("2. Atender alumno");
        System.out.println("3. Atender todos los alumnos");
        System.out.println("4 Marcharte a tu casa para bañarte en tu piscina");
        System.out.println("5 ver cuantos alumnos hay en la fila");
        int respuesta=scanner.nextInt();
        if (respuesta==1)
        {
            if (filaAlumnos.size()>=numMaxAlumnosFila)
            {
                System.out.println("No puedes tener mas alumnos en la cola");
                Ejercicio();
            }
            else {
                System.out.println("Esta bien puedes meter un alumno en la cola de espera");
                System.out.println("");
                scanner.nextLine();
                System.out.println("Introduce su nombre: ");
                String nombrealumno=scanner.nextLine();
                filaAlumnos.offer(new QueueAlumno(nombrealumno));
                Ejercicio();
            }
        }
        else if (respuesta==2)
        {
            if (filaAlumnos.size()==0)
            {
                System.out.println("No puedes atender a nadie. no hay alumnos que atender");
                Ejercicio();
            }
            else
            {
                System.out.println("Muy bien");
                filaAlumnos.poll();
                System.out.println("Quedan " + filaAlumnos.size() +"alumnos");
                Ejercicio();
            }
        }
        else if (respuesta==3)
        {
            if (filaAlumnos.size()==0)
            {
                System.out.println("No puedes atender a nadie. no hay alumnos que atender");
                Ejercicio();
            }
            else
            {
                System.out.println("Muy bien");
                filaAlumnos.removeAll(filaAlumnos);
                System.out.println("Has atendido a todos los alumnos");
                Ejercicio();
            }

        }
        else if (respuesta==4)
        {
            System.exit(1);
        } else if (respuesta==5)
        {
            System.out.println("Quedan "+ filaAlumnos.size()+" alumnos por atender.");
            Ejercicio();
        }


    }
    public void llegaralumno()
    {
        filaAlumnos.offer(new QueueAlumno("Fran"));
    }
    public void atiendealumno()
    {
        filaAlumnos.poll();
    }
    public void AtenderTodosLosAlumnos()
    {
        filaAlumnos.removeAll(filaAlumnos);
    }
    public void salir()
    {
        System.exit(1);
    }
}
class QueueAlumno
{
    private String nombre;

    public QueueAlumno(String nombre) {
        this.nombre = nombre;
    }
}

