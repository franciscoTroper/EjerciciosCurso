package herencia.ejercicios.Mains;

import herencia.ejercicios.Campos;

public class mainCampos
{


    public static void main(String[] args)
    {
        Campos campos=new Campos(65.4);
        campos.IncrementX();
        System.out.println(campos.getX());
    }
}
