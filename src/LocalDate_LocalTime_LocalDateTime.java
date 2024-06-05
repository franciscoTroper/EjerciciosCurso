import java.time.*;


public class LocalDate_LocalTime_LocalDateTime
{

 /*1. Ejercicios
    a. //Declarar la fecha de inicio del curso y le sumamos 10 días
    b. //Declarar la fecha de hoy con la zona horaria por defecto
    c. //Declarar la fecha de hoy con la zona horaria de “Australia/Sydney”
    d. //Cual es el día 100 de 2024
    e. //Definir una fecha para navidad y otra para noche vieja y compararlas con los métodos isBefore isAfter
    f. Calcular la fecha resultante sumando 35 semanas al 15 de marzo de 2024.
    g. Calcular los años trabajados en una empresa de un empleado que inició a trabajar el 6 de Julio de 2012
    h. Calcular la edad de una persona que nació el 7 de agosto de 2007
    i. Calcular la fecha en que se tiene que iniciar un proyecto si su duración
    es 200 días y se tiene que entregar el 2 de octubre de 2024
    j. Si un proyecto inicia el 15 de marzo y termina el 20 de octubre cuál es su periodo.*/

    public static void main(String[] args)
    {
       /*a*/ LocalDate resultadoA= LocalDate.of(2024,6,3);
        resultadoA=resultadoA.plusDays(10);
        System.out.println("Resultado de sumar 10 dias a la fecha; 03/06/2024:  " + resultadoA);

        /*b*/ ZonedDateTime zonaHorariaPorDefecto= ZonedDateTime.now();
        System.out.println("Zona horaria por defecto: " + zonaHorariaPorDefecto);

        /*c*/ ZonedDateTime zonaHorariaAustralia=ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Zona horaria de Australia, Sydney: " + zonaHorariaAustralia);

        /*d*/ LocalDate resultadoD=LocalDate.of(2024,1,1);
        resultadoD=resultadoD.plusDays(100);
        System.out.println("El dia 100 del 2024 es: " + resultadoD);

        /*e*/LocalDate diaDeNavidad=LocalDate.of(2024,12,25);
        LocalDate diaDeNocheVieja=LocalDate.of(2024,12,31);
        System.out.println("¿Dia de navidad es después de noche vieja? " + diaDeNavidad.isAfter(diaDeNocheVieja));
        System.out.println("¿Día de navidad es antes de noche vieja? " + diaDeNavidad.isBefore(diaDeNocheVieja));

        /*f*/LocalDate fechaResultante= LocalDate.of(2024,3,15);
        System.out.println("Fecha resultante de sumar 35 semanas a la fecha 15/03/2024: " + fechaResultante.plusWeeks(35));

        /*g*/int anosTrabajados=LocalDate.now().compareTo(LocalDate.of(2012,7,6));
        System.out.println("Años trabajados: " + anosTrabajados);

        /*h*/int edadPersona= LocalDate.now().compareTo(LocalDate.of(2007,8,7));
        System.out.println("Edad de la persona: " + edadPersona);

        /*i*/LocalDate fechaInicioDeProyecto=LocalDate.of(2024,10,2).minusDays(200);
        System.out.println("El proyecto se debe de iniciar en la fecha: " + fechaInicioDeProyecto);

        /*j*/LocalDate fechaA = LocalDate.of(2024,10,20);
        LocalDate fechaB=LocalDate.of(2024,3,15);
        System.out.println("Periodo: " + Period.between(fechaA,fechaB));

    }
}
