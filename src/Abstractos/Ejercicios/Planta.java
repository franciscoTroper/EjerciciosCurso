package Abstractos.Ejercicios;

class Main
{
    public static void main(String[] args)
    {
        Planta Brachychitonrupestris=new PlantaTropical(){

        };
        Planta ArecaOriental=new PlantaTropical(){

        };
        Planta BananeroRepublicano=new PlantaTropical(){

        };
    }
}

public abstract class Planta
{
    public String nombre;
    public abstract void regar(int cantidad,int tiempo);
    public abstract void cortar(boolean siOno);
}
class PlantaTropical extends Planta
{

    @Override
    public void cortar(boolean siOno) {

    }

    @Override
    public void regar(int cantidad, int tiempo) {

    }
}
