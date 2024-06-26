//        EJERCICIO 7
//    Realizar la clase Dado su objetivo será lanzar un dado, mostrando el resultado por
//    pantalla. Se aconseja estructurar el programa de la siguiente forma. En el main se
//    invoca a los métodos de la clase dado. Una clase dado, que dispondrá de: Un
//    constructor que usa el método random de Math multiplicado por (6-1)+1.
//    La llamada a Math.random() devuelve un número aleatorio entre 0.0 y 1.0, excluido
//    este último valor, es decir, puede devolver 0.346442, 0.2344234, 0.98345,....
//    En muchas de nuestras aplicaciones no nos servirá este rango de valores. Por ejemplo,
//    si queremos simular una tirada de dado, queremos números entre 1 y 6 sin decimales.
//    Debemos echar unas cuentas para obtener lo deseado.
//    En primer lugar, miramos cuántos valores queremos. En nuestro caso del dado son 6
//    valores, del 1 al 6 ambos incluido. Debemos entonces multiplicar Math.random() por 6
//        (que es (maximo-minimimo)+1, es decir, (6-1)+1)Los métodos serán: Seis para
//    dibujar por pantalla la imagen de los números. Otro para lanzar(), que generará un
//    número aleatorio entre 1 y 6, invocará al método dibujar que le corresponda.

package herencia.ejercicios;

import java.util.Random;

public class Dado
{
    private int numeroDado;
    private String[] dibujoDado;

    public Dado() {
        dibujoDado=new String[3];
    }

    public int lanzarDado()
    {
        Random random=new Random();
        numeroDado=random.nextInt(1,7);
        return numeroDado;
    }
    public void dibujarDado()
    {
        switch (numeroDado)
        {
            case 1 ->{ dibujoDado[0]="   ";dibujoDado[1]=" * ";dibujoDado[2]="   "; }
            case 2 ->{ dibujoDado[0]="  *";dibujoDado[1]="   ";dibujoDado[2]="*  "; }
            case 3 ->{ dibujoDado[0]="  *";dibujoDado[1]=" * ";dibujoDado[2]="*  "; }
            case 4 ->{ dibujoDado[0]="* *";dibujoDado[1]="   ";dibujoDado[2]="* *"; }
            case 5 ->{ dibujoDado[0]="* *";dibujoDado[1]=" * ";dibujoDado[2]="* *"; }
            case 6 ->{ dibujoDado[0]="***";dibujoDado[1]="***";dibujoDado[2]="***"; }
        }

        for (int a=0;a<dibujoDado.length;a++)
        {

            System.out.println(dibujoDado[a]);
        }

    }

}
