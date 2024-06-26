package herencia.ejercicios.Mains;

import herencia.ejercicios.Alumno;

public class MainAlumno
{
    public static void main(String[] args)
    {

        Alumno alumno=new Alumno(4,"Frak Domínguez Leiva");
        //         Una propiedad de escritura para asignar los valores de los parciales.
        double [] notasParciales={6.7,5.8,8.5};
        alumno.setNotasParciales(notasParciales);
// Un método para calcular el promedio de los parciales.
        alumno.NotaPromedio();
// Un método para mostrar las calificaciones de los parciales.
        System.out.println(alumno.getNotaPromedio());
    }
}
