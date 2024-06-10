import java.util.Scanner;

public class Variables
{
    public static void main(String[] args)
    {
        // Ejemplo 1: Cálculo de edad
        int edad= Math.abs(1983-2024);
        System.out.println("Edad: " + edad);

        // Ejemplo 2: Conversión de temperatura (Celsius a Fahrenheit)
        float gradosFarenheit= (40*1.8f) +32 ;
        System.out.println("Grados Farenheit: "+ gradosFarenheit);

        // Ejemplo 3: Cálculo de área de un círculo
        double areaCirculo=Math.PI * Math.pow(7.5f,2);
        System.out.println("AreaCirculo: " + Math.round(areaCirculo));

        // Ejemplo 4: Conversión de minutos a horas y minutos
        float horas= 135f/60;
        System.out.println("Horas: " + horas);

        // Ejemplo 5: Cálculo del interés compuesto
        double interesCompuesto= 1000* Math.pow(1+0.05,10);
        System.out.println("InteresCompuesto: " +  Math.round(interesCompuesto));

        // Ejemplo 6: Cálculo de promedio de calificaciones
        float promedio= (8.5f + 7.6f+6)/3;
        System.out.println("Promedio notas: " + promedio);

        // Ejemplo 7: Operaciones con cadenas y caracteres
        String cadena="Hola";
        System.out.println("Primer caracter: " + cadena.charAt(0));
        System.out.println("Longitud de cadena:" + cadena.length());

        // Ejemplo 8: Conversión de peso (kilogramos a libras)
        float libras= Math.round(90*2.20462262f);
        System.out.println("Conversion a libras: " + libras);

        // Ejemplo 9: Cálculo de pago mensual de un préstamo
        float pagoMensual= Math.round(15000/(12f*5) + (0.035f/(12*5)));
        System.out.println("Pago mensual: " + pagoMensual);

        // Ejemplo 10: Conversión de millas a kilómetros
        float kilometros = Math.round(100*1.609344f) ;
        System.out.println("Kilometros: " + kilometros);

        //VARIABLES DE TIPO
        //Declarar una variable de tipo entero y de tipo decimal
        int entero;
        float decimal;
        //Declarar una variable de tipo char con valor v
        char uve='v';

        //VARIABLES DE REFERENCIA En el monton y no en la pila
        Scanner entradaDatos=new Scanner(System.in);
        String cadena2="viaje";
    }
}
