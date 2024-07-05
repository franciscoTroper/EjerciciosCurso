package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioSet
{
    public static void main(String[] args)
    {
        String frase= "El texto descriptivo, en este caso es un retrato de una persona, " +
                "que provoca en el receptor una imagen tal que la realidad descripta cobra forma, " +
                "se materializa en su mente. En este caso el texto habla de un personaje real: " +
                "Doña Uzeada de Ribera Maldonado de Bracamonte y Anaya. " +
                "Como se trata de una descripcion literaria, la actitud del emisor es subjetiva, " +
                "dado que pretende transmitir su propia vision personal al describir y la funcion del lenguaje es " +
                "predominantemente poetica, ya que persigue una estetica en particular.";
        char[] signosPuntuacion= {',','.','¿','?','!','¡',':',';'};
        boolean boolSignoPuntuacion=false;
        Set<String> set=new HashSet<>();
        String palabra="";
        int contadorIndexSet=0;
        List<String> palabras=new ArrayList<>();

        for (char elemento:frase.toCharArray())
        {
            //Comprobar si es un signo de puntuacion
            for (int b=0;b< signosPuntuacion.length;b++)
            {
                if (elemento==signosPuntuacion[b]){boolSignoPuntuacion=true;}
            }
            if (boolSignoPuntuacion){boolSignoPuntuacion=false;}

            //Comprobando espacio vacio
            else if (elemento==' ')
            {

                set.add(palabra);
                palabra="";
                contadorIndexSet++;

            }
            else
            {
                palabra+=elemento;
            }

        }
        for (String elemento:set)
        {
            System.out.println(elemento);
            palabras.add(elemento);

        }

    }

    public void RepitePalabra()
    {

    }
}
//Obtener las diferentes palabras de una frase
//Fase 1 guardar en un set las palabras unicas
//Fase 2 guardar en un Map todas las palabras y las veces que se repiten

