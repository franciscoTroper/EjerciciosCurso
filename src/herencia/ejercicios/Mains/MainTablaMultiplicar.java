package herencia.ejercicios.Mains;

import herencia.ejercicios.TablasDeMultiplicar;

public class MainTablaMultiplicar
{
    public static void main(String[] args)
    {
        TablasDeMultiplicar tablasDeMultiplicar=new TablasDeMultiplicar(9);
        int contador=0;
        String valor="";
        for (char elemento:tablasDeMultiplicar.ImprimirTabla().toCharArray())
        {
            if (elemento==';')
            {
                System.out.println(tablasDeMultiplicar.getTablaDeMultiplicar()+" * "+ contador+" = " + valor);
                contador++;
                valor="";
            }
            else
            {
                valor+=elemento;
            }

        }



    }
}
