//    EJERCICIO 5
//    Construir una aplicación que imprima por pantalla las tablas de multiplicar. Debe
//    contar con un constructor que indica la tabla que se va a mostrar. Debe contar con un
//    método que dé como resultado un string para mostrar diez línea de la tabla del
//    número dado en el constructor.

package herencia.ejercicios;

public class TablasDeMultiplicar
{
    private int tablaDeMultiplicar;
    private int contador;
    private String resultado="";

    public TablasDeMultiplicar(int tablaDeMultiplicar) {
        this.tablaDeMultiplicar = tablaDeMultiplicar;
        contador=11;
    }

    public String ImprimirTabla()
    {

        for (int a=0;a<=10;a++)
        {
            resultado+=String.valueOf(tablaDeMultiplicar*a)+";";
            contador++;
        }

        return resultado;
    }

    public int getContador()
    {
        return contador;
    }

    public String getResultado() {
        return resultado;
    }

    public int getTablaDeMultiplicar() {
        return tablaDeMultiplicar;
    }
}
