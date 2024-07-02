


//Ejercicios de repaso de java
//1. Declara dos variables enteras y haz su suma
//2. Declara dos variables enteras y han el resto de los dos números.
//3. Declara dos variables tipo float y haz su división.
//4. Conversión de Euros a Dólares (Asumiendo tasa de cambio de 1 EUR =1.10 USD):
//5. Conversión de Euros a Libras Esterlinas (Asumiendo tasa de cambio de 1EUR = 0.85 GBP):
//6. Conversión de Euros a Yen Japonés (Asumiendo tasa de cambio de 1 EUR
//        = 130.00 JPY):
//7. Conversión de Euros a Francos Suizos (Asumiendo tasa de cambio de 1
//        EUR = 1.05 CHF):












//31. Este ejercicio simula un cajero automático donde el usuario puede
//consultar su saldo, ingresar dinero o sacar dinero después de ingresar el
//número de tarjeta y el PIN correcto.
//• Declarar dos arrays:
//Uno de tipo String para almacenar los PINs de las tarjetas.
//Otro de tipo float para almacenar los saldos de las tarjetas.
//        • Simular un cajero automático que realice las siguientes operaciones:
//Solicitar el número de tarjeta, que será un número entre 1 y 5.
//Solicitar el PIN asociado a la tarjeta. Para verificar si el PIN es correcto, se
//debe comparar con el valor en la posición correspondiente del array de String.
//Mostrar un menú para que el usuario elija entre las siguientes opciones:
//Consultar saldo: Mostrar el saldo correspondiente a la tarjeta.
//Ingresar dinero: Solicitar una cantidad de dinero y sumarla al saldo de la
//tarjeta.
//Sacar dinero: Solicitar una cantidad de dinero y, si es menor o igual al saldo
//de la tarjeta, restarla del saldo.
package EjercicioRepasoProgramacionEstructurada;


import JavaOrientadoObjetos.Clase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class EjerciciosRepasoProgramacion
{
    static int num=2,num2=5;
    static double galones=15,litros=0,gramos=2075,libras=0;
    static float num3=6.5f,num4=8.5f;



    public static void main(String[] args)
    {
        System.out.println(num+num2);//Ejercicio1
        System.out.println(num-num2);//Ejercicio2
        System.out.println(num3/num4);//Ejercicio3
        System.out.println(conversionMonedas("dolares",5,1.10));//Ejercicio4
        System.out.println(conversionMonedas("libras esterlinas",20,0.85));//Ejercicio5
        System.out.println(conversionMonedas("Yenes japoneses",30,130));//Ejercicio6
        System.out.println(conversionMonedas("Francos suizos",23,1.05));
        //8. Conversión de Galones a Litros (1 galón = 3.78541 litros):
        litros=galones*3.78541;
        System.out.println(litros);
        //9. Conversión de Gramos a Libras (1 gramo = 0.00220462 libras):
        litros=gramos*0.00220462;
        System.out.println(libras);
        //10. Conversión de Euros a Dólares Australianos (Asumiendo tasa de cambio de 1 EUR = 1.60 AUD):
        System.out.println(conversionMonedas("dolares australianos",20,1.6));
        //11. Une en una variable el valor de dos variables de tipo String con el valor de
        //“Buenos” en una “Días” en otra
        String resultado,cadena1="Buenos",cadena2="Dias";
        resultado=cadena1+" "+cadena2;
        System.out.println(resultado);
        //12. Convierte a Mayúscula y Minúscula una variable que tiene el valor de “Programador de Java”
        String cadena3="Programador de Java";
        cadena3=cadena3.toUpperCase(); cadena3=cadena3.toLowerCase();
        //13. Muestre la longitud de un texto “Aprendiendo java”
        String cadena4="Aprendiendo java";
        System.out.println(cadena4.length());
        //14. En el siguiente texto “La guerra de las Galaxias” remplazar la letra a por @
        String cadena5="La guerra de las galaxias";
        String cadena6="";
        for (char elemento:cadena5.toCharArray())
        {
            if (elemento!='a'){cadena6+=elemento;}
            else {cadena6+='@';}
        }
        System.out.println(cadena6);
        //15. Divida la cadena “Uno, Dos, Tres, Cuatro” en una array de String
        String[]cadenaArray = new String[4];
        String cadena7="Uno, Dos, Tres, Cuatro";
        int contador=0;
        for (char elemento: cadena7.toCharArray())
        {
            if (elemento!=','||elemento!=' ') {cadenaArray[contador]+=elemento;}
            else
            {
                System.out.println(cadenaArray[contador]);
                contador++;
            }
        }
        //16. Obtener la palabra guerra de la frase “La guerra de las Galaxias”
        String frase16="La guerra de las galaxias";
        String palabraAObtener="guerra";
        int indiceBegin=frase16.indexOf(palabraAObtener);
        int indiceFin= indiceBegin+ palabraAObtener.length();
        System.out.println(frase16.substring(indiceBegin,indiceFin));
        //17. Obtener la fecha actual
        LocalDate fechaActual=LocalDate.of(2024,6,2);
        System.out.println(fechaActual.toString());
        //18. Cree una variable con la fecha del examen 18 de Junio de 2024
        LocalDate fechaExamen=LocalDate.of(2024,6,18);
        //19. Cuantos días faltan para el examen
        System.out.println("Faltan " + String.valueOf(fechaExamen.getDayOfYear()-fechaActual.getDayOfYear()));
        //20. A la fecha del examen súmele 1 mes y 5 días
        System.out.println(fechaExamen.plusMonths(1).plusDays(5));
        //21. Compare la fecha del examen con la de su cumpleaños de este año ¿Es
        //anterior?
        int resultadoComparacion; boolean anterior;
        resultadoComparacion=fechaExamen.compareTo(LocalDate.of(2024,12,17));
        if (resultadoComparacion<0){System.out.println("Es menor");}
        else {System.out.println("Es mayor");}
        //22. Decir si un número entero está entre 18 y 65
        int num5=67;
        if(num5>18&&num5<65) {System.out.println("No esta en rango");}
        else                 {System.out.println("No esta en rango");}

        //23. Defina dos variables con el nombre y la edad. Decir si la persona es mayor
        //de edad y su nombre Comienza con C.
        int edad=23;String nombre="Carlos";
        if (edad>=18){System.out.println("Es mayor de edad");}
        else {System.out.println("Es menor de edad");}
        if (nombre.indexOf(0)=='C'){System.out.println("Empieza por C");}
        else {System.out.println("No empieza por C");}
        //24. Decir si un número es divisible por 5 y por 3.
        double numDivisible=15;
        if (numDivisible%5==0&&numDivisible%3==0){System.out.println("es divisible entre 5 y 3");}
        else {System.out.println("No es divisible entre 5 y 3");}
        //25. Declarar una variable de tipo string y decir si es no vacía y su longitud es
        //mayor que 5.
        String cadena8="";
        if(!cadena8.isEmpty()){System.out.println("No esta vacia");}
        else {System.out.println("Esta vacia");}
        if (cadena8.length()>5){System.out.println("Es mayor a 5");}
        else {System.out.println("Es menor o igual a 5");}
        //26. Calcular la suma de los números entre un rango. Solicitando por el teclado
        //el limite inferior y el superior.

        //27. Declarar una variable de tipo String con el valor de “Sistemas de
        //Información” y por medio de un bucle escribirla a la inversa.

        String cadena9="Sistemas de informacion";
        for (int a=cadena9.length()-1;a>=0;a--)
        {
            System.out.print(cadena9.toCharArray()[a]);

            //System.out.print(cadena9.indexOf(a));
        }
        System.out.println("");
        //28. Solicitar un número hasta que cumpla con que esté entre 5 y 10.

        //29. Contar la Frecuencia de un Elemento Específico en un Array int[] numeros= {1, 2, 2, 3, 4, 2, 5};
        int[] numeros= {1, 2, 2, 3, 4, 2, 5};
        for (int elemento:numeros)
        {
            System.out.print(elemento);
        }
        //30. Invertir los Elementos de un Array: int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("");
        for (int a=numeros.length-1;a>=0;a--)
        {
            System.out.print(numeros[a]);
        }
    }

    public static String conversionMonedas(String nombreMoneda,double cantidad, double tasa)
    {
        double resultadoLocal=cantidad*tasa;
        String valueOut=String.valueOf(resultadoLocal);
        return String.valueOf(cantidad)+ "euros son " + valueOut+" "+ nombreMoneda;
    }

}
//        Implemente las siguientes clases en Java:
//        a) Clase Nota. Una nota contiene un identificador numérico y una línea de texto. Defina
//        constructores, getters y setter y toString.
//
class nota
{
    private int id;
    private String lineaDeTexto;

    public nota() {}

    public nota(int id, String lineaDeTexto) {
        this.id = id;
        this.lineaDeTexto = lineaDeTexto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLineaDeTexto() {
        return lineaDeTexto;
    }

    public void setLineaDeTexto(String lineaDeTexto) {
        this.lineaDeTexto = lineaDeTexto;
    }

    @Override
    public String toString() {
        return "nota{" +
                "id=" + id +
                ", lineaDeTexto='" + lineaDeTexto + '\'' +
                '}';
    }
}
//        b) Clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma.
//        Defina constructores, getters y setter y toString.

class notaalarma
{
    private int horaQueSonara;
    private String notaAlarma;

    public notaalarma() {
    }

    public notaalarma(int horaQueSonara, String notaAlarma) {
        this.horaQueSonara = horaQueSonara;
        this.notaAlarma = notaAlarma;
    }

    public int getHoraQueSonara() {
        return horaQueSonara;
    }

    public void setHoraQueSonara(int horaQueSonara) {
        this.horaQueSonara = horaQueSonara;
    }

    @Override
    public String toString() {
        return "notaalarma{" +
                "horaQueSonara=" + horaQueSonara +
                ", notaAlarma='" + notaAlarma + '\'' +
                '}';
    }
}
//        c) Clase BlocNotas. Modela un bloc de notas en el que se pueden introducir notas, listar
//        todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuántas
//        notas contiene el bloc de notas. Debe utilizar la clase Array.

class blockNotas
{
    private ArrayList<String>notas;

    public blockNotas()
    {notas=new ArrayList<>();}

    public void AddNote(String nota) {notas.add(nota);}
    public void ListarNotas() {for (int a=0,b=1;a< notas.size();a++,b++) {System.out.println("Nota "+b+": "+ notas.get(a));}}
    public int getNotasTotales() {return notas.size();}
    public boolean EliminarNota(String nota)
    {
        boolean valueOut;
        if (notas.contains(nota)){notas.remove(nota); return true;}
        else {valueOut=false;return false;}

    }
    public boolean EliminarNota(int indice)
    {
        int indiceNotasLocal=0;
        try
        {
            notas.remove(indice);
            return true;
        }
        catch (IndexOutOfBoundsException e){return false;}
    }

}
//d) Clase Prueba. Cree un bloc de Notas de ejemplo y pruebe las operaciones que soporta
class prueba
{
    public static void main(String[] args) {
        blockNotas b1=new blockNotas();
        b1.AddNote("Es mi primera nota de este block. Hoy he ido a la biblioteca a estudiar hasta mediodia");
        b1.AddNote("Por la tarde he dormido la siesta y me he comprado una piruleta");
        System.out.println(b1.getNotasTotales());
        b1.ListarNotas();
        b1.EliminarNota(0);
        b1.ListarNotas();
    }
}
