//        EJERCICIO 6
//    Construir una aplicación que muestre por pantalla el nombre de alumno y su nota final.
//    Para ello construir una clase Alumno que contenga:
//         Un campo que sea una matriz para almacenar las calificaciones de los parciales.
// El constructor deberá inicializar las variables de NombreCompleto y dimensionar
//    el array de Parciales.
//         Una propiedad de escritura para asignar los valores de los parciales.
// Un método para calcular el promedio de los parciales.
// Un método para mostrar las calificaciones de los parciales.

package herencia.ejercicios;

import java.util.Arrays;

public class Alumno
{
    private double[] notasParciales;
    private double notaPromedio;
    private String nombreCompleto;
    private double sumaTotal;
    private int numNotasIntoducidas;

    public Alumno(int numeroNotas,String nombreCompleto)
    {
        this.nombreCompleto=nombreCompleto;
        notasParciales=new double[numeroNotas];
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "notasParciales=" + Arrays.toString(notasParciales) +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }

    //Asignar notas parciales
    public void setNotasParciales(double[] notas)
    {
        numNotasIntoducidas=notas.length;
        for (int a=0;a<notas.length;a++)
        {
            try
            {
                notasParciales[a]=notas[a];
                sumaTotal+=notasParciales[a];
            }
            catch (IndexOutOfBoundsException e){}
        }
    }

    //Mostrar calificaciones parciales

    public double[] getNotasParciales() {
        return notasParciales;
    }

    //CalcularPromedio


    public void NotaPromedio()
    {

        notaPromedio = sumaTotal/numNotasIntoducidas;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }
}
