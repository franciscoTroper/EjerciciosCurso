import java.util.ArrayList;

public class ejerciciosGeneralJava1
{
    public static void main(String[] args)
    {

        //1. Declara dos variables enteras y haz su suma
             String[] numerosEje1={"3","5"};
            System.out.println( OperarNumeros(numerosEje1,2,1));
        //2. Declara dos variables enteras y haz el resto de los dos números.
            String[]numerosEjer2={"7","5"};
            System.out.println(OperarNumeros(numerosEjer2,2,2));
        //3. Declara dos variables tipo float y haz su división.
            String[]numerosEjer3={"6.5f","5.3f"};
            System.out.println(OperarNumeros(numerosEjer3,3,4));
        //4. Conversión de Euros a Dólares (Asumiendo tasa de cambio de 1 EUR = 1.10 USD):
            System.out.println(ConversionMonedas(1,1.10)+" Dolares");
        //5. Conversión de Euros a Libras Esterlinas (Asumiendo tasa de cambio de 1 EUR = 0.85 GBP):
            System.out.println(ConversionMonedas(1,0.85)+" Libras esterlinas");
        //6. Conversión de Euros a Yen Japonés (Asumiendo tasa de cambio de 1 EUR = 130.00 JPY):
            System.out.println(ConversionMonedas(1,130)+" Yenes japoneses");
        //7. Conversión de Euros a Francos Suizos (Asumiendo tasa de cambio de 1 EUR = 1.05 CHF):
            System.out.println(ConversionMonedas(1,1.05)+" Francos Suizos");
        //8. Conversión de Galones a Litros (1 galón = 3.78541 litros):
            System.out.println(ConversionMonedas(1,3.78541)+" Galones");
        //9. Conversión de Gramos a Libras (1 gramo = 0.00220462 libras):
            System.out.println(ConversionMonedas(1,0.00220462)+" Libras");
        //10. Conversión de Euros a Dólares Australianos (Asumiendo tasa de cambio de 1 EUR = 1.60 AUD):
            System.out.println(ConversionMonedas(1,1.6)+" Dolares Australianos");
        //11. Une en una variable el valor de dos variables de tipo String con el valor de “Buenos” en una “Días” en otra
            String saludo="Buenos ",saludo2="días",union=saludo+saludo2;
        //12. Convierte a Mayúscula y Minúscula una variable que tiene el valor de “Programador de Java”
            String ejer12="Programador de java";
            ejer12.toUpperCase(); ejer12.toLowerCase();
        //13. Muestre la longitud de un texto “Aprendiendo java”
            String ejer13="Aprendiendo java";
            System.out.println("Longitud de aprendiendo java: "+ejer13.length());
        //14. En el siguiente texto “La guerra de las Galaxias” remplazar la letra a por @
            String ejer14="La guerra de las galaxias";
            ejer14=ejer14.replace('a','@');
            System.out.println(ejer14);
        //15. Divida la cadena “Uno, Dos, Tres, Cuatro” en una array de String
            String fraseejer15="Uno, Dos, Tres, cuatro";
            int contadorcomas=0;
            fraseejer15=fraseejer15.replace(" ","");
            for (char elemento:fraseejer15.toCharArray())
            {
                if (elemento!=',')
                {
                    contadorcomas++;
                }
            }
            String[] ejer15=new String[contadorcomas+1];
            for(int a=0;a<ejer15.length;a++)
            {ejer15[a]=" ";}

            int contador=0;
            for (char elemento:fraseejer15.toCharArray())
            {
                if (elemento!=',')
                {ejer15[contador]+=elemento;}
                else {contador++;}
            }

        //16. Obtener la palabra guerra de la frase “La guerra de las Galaxias”
        String ejer16="La guerra de las galaxias";
        System.out.println(ejer16.substring(ejer16.indexOf("guerra"),ejer16.indexOf("guerra")+6));
        //17. Obtener la fecha actual
        //18. Cree una variable con la fecha del examen 18 de Junio de 2024
        //19. Cuantos días faltan para el examen
        //20. A la fecha del examen súmele 1 mes y 5 días
        //21. Compare la fecha del examen con la de su cumpleaños de este año ¿Es anterior?
        //22. Decir si un número entero está entre 18 y 65
        //23. Defina dos variables con el nombre y la edad. Decir si la persona es mayor de edad y su nombre Comienza con C.
        //24. Decir si un número es divisible por 5 y por 3.
        //25. Declarar una variable de tipo string y decir si es no vacía y su longitud es mayor que 5.
        //26. Calcular la suma de los números entre un rango. Solicitando por el teclado el limite inferior y el superior.
        //27. Declarar una variable de tipo String con el valor de “Sistemas de Información” y por medio de un bucle escribirla a la inversa.
        //28. Solicitar un número hasta que cumpla con que esté entre 5 y 10.
        //29. Contar la Frecuencia de un Elemento Específico en un Array int[] numeros = {1, 2, 2, 3, 4, 2, 5};
        //30. Invertir los Elementos de un Array: int[] numeros = {1, 2, 3, 4, 5};
        /*31. Este ejercicio simula un cajero automático donde el usuario puede consultar:
            - saldo,
            - ingresar dinero
            - sacar dinero después de ingresar el número de tarjeta y el PIN correcto.
• Declarar dos arrays:
    Uno de tipo String para almacenar los PINs de las tarjetas.
            Otro de tipo float para almacenar los saldos de las tarjetas.
• Simular un cajero automático que realice las siguientes operaciones:
    Solicitar el número de tarjeta, que será un número entre 1 y 5.
        Solicitar el PIN asociado a la tarjeta. Para verificar si el PIN es correcto, se
        debe comparar con el valor en la posición correspondiente del array de String.
            Mostrar un menú para que el usuario elija entre las siguientes opciones:
    Consultar saldo: Mostrar el saldo correspondiente a la tarjeta.
            Ingresar dinero: Solicitar una cantidad de dinero y sumarla al saldo de la
        tarjeta.
                Sacar dinero: Solicitar una cantidad de dinero y, si es menor o igual al saldo
        de la tarjeta, restarla del saldo.*/
    }

    public static String OperarNumeros (String[] numerosP,int ConversionP,int operacion)
    {
        byte resultadoByte=0;
        int resultadoInt=0;
        float resultadoFloat=Float.valueOf(numerosP[0]);
        double resultadoDouble=Double.valueOf(numerosP[0]);
        try {resultadoByte=Byte.valueOf(numerosP[0]);}
            catch (NumberFormatException e){}
        try {resultadoInt=Integer.valueOf(numerosP[0]);}
            catch (NumberFormatException e){}
        String resultadoFinal="";
        if (operacion==1) //Sumar
        {
            for (int a=1;a<numerosP.length;a++)
            {
                switch (ConversionP)
                {
                    case 1:
                        resultadoByte+=Byte.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoByte);
                        break;
                    case 2:
                        resultadoInt+=Integer.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoInt);
                        break;
                    case 3:
                        resultadoFloat+=Float.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoFloat);
                        break;
                    default:resultadoDouble+=Double.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoDouble);

                }

            }
            return resultadoFinal;
        }
        else if (operacion==2) //Restar
        {
            for (int a=1;a<numerosP.length;a++)
            {
                switch (ConversionP)
                {
                    case 1:
                        resultadoByte-=Byte.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoByte);
                        break;
                    case 2:
                        resultadoInt-=Integer.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoInt);
                        break;
                    case 3:
                        resultadoFloat-=Float.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoFloat);
                        break;
                    default:resultadoDouble-=Double.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoDouble);

                }

            }
        }
        else if (operacion==3) //Dividir
        {
            for (int a=1;a<numerosP.length;a++)
            {
                switch (ConversionP)
                {
                    case 1:
                        resultadoByte*=Byte.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoByte);
                        break;
                    case 2:
                        resultadoInt*=Integer.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoInt);
                        break;
                    case 3:
                        resultadoFloat*=Float.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoFloat);
                        break;
                    default:resultadoDouble*=Double.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoDouble);

                }

            }
        }
        else //Multiplicar
        {
            for (int a=1;a<numerosP.length;a++)
            {
                switch (ConversionP)
                {
                    case 1:
                        resultadoByte/=Byte.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoByte);
                        break;
                    case 2:
                        resultadoInt/=Integer.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoInt);
                        break;
                    case 3:
                        resultadoFloat/=Float.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoFloat);
                        break;
                    default:resultadoDouble/=Double.valueOf(numerosP[a]);
                        resultadoFinal=String.valueOf(resultadoDouble);

                }

            }
        }

        return resultadoFinal;
    }

    public static double ConversionMonedas( double valorMoneda,double tasaDeCambio)
    {
       double conversion=valorMoneda*tasaDeCambio;
       return conversion;
    }

}
