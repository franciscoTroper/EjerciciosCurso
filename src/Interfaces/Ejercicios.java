package Interfaces;

public class Ejercicios
{


    public static void main(String[] args)
    {
        // Instanciar un avion con el nombre de objeto a1
        Avion a1=new Avion();
        //Instanciar un avion con el nombre de objeto a2 en una referencia de ObjetoVolador
        ObjetoVolador a2=new Avion();
    //Instanciar un avion con el nombre de objeto a3 en una referncia de ObjetoVolador
        ObjetoVolador a3= new Avion();
    //Instanciar un ave con el nombre de a4
        Ave a4=new Ave();
    //Instanciar un ave con el nombre de a5 en una referencia de ObjetoVolador
        ObjetoVolador a5=new Ave();
    //Instanciar un avión con el nombre de objeto a6 usando el constructor completo en una referencia de ObjetoVolador
        ObjetoVolador a6= new Avion();
    //Instanciar un Superman con el nombre de a7 en una referencia de ObjetoVolador
        ObjetoVolador a7 =new Superman();
        Nautico a8 =new barcaza();
        ObjetoVolador a9 =new Hidroavion();

        ObjetoVolador[] objetos = {a1,a2,a3,a4,a5,a6,a7,a9};
        {//        for (ObjetoVolador elemento:objetos)
//        {
//            System.out.println(elemento.volar());
//            System.out.println(elemento.despegar());
//            System.out.println(elemento.aterrizar());
//            if(elemento instanceof Hidroavion)
//            {
//                System.out.println(((Hidroavion) elemento).atracar());
//            }
//
//        }
        }

        IVehiculo coche1=new coche();
        conductor conductor1=new conductor(coche1);
        System.out.println(conductor1.conducir());

    }

}



class Avion implements ObjetoVolador
{

    @Override
    public String volar() {
        return "El avion esta volando";
    }

    @Override
    public String despegar() {
        return "El avion esta despegando";
    }

    @Override
    public String aterrizar() {
        return "El avion esta aterrizando";
    }
}
class Superman implements ObjetoVolador
{

    @Override
    public String volar() {
        return "Superman está volando";
    }

    @Override
    public String despegar() {
        return "Superman esta despegando";
    }

    @Override
    public String aterrizar() {
        return "Superman esta aterrizando";
    }
}
class Ave implements ObjetoVolador
{


    @Override
    public String volar() {
        return "El ave esta volando";
    }

    @Override
    public String despegar() {
        return "El ave esta despegando";
    }

    @Override
    public String aterrizar() {
        return "El ave esta aterrizando";
    }
}
class barcaza implements Nautico
{

    @Override
    public String atracar() {
        return "La barcaza está atracando";
    }

    @Override
    public String navegar() {
        return "La barcaza está navegando";
    }
}
class Hidroavion implements ObjetoVolador,Nautico
{

    @Override
    public String atracar() {
        return "El hidroavion está atracando";
    }

    @Override
    public String navegar() {
        return "El hidroavion está navegando";
    }

    @Override
    public String volar() {
        return "El hidroavion esta volando";
    }

    @Override
    public String despegar() {
        return "El hidroAvion esta despegando";
    }

    @Override
    public String aterrizar() {
        return "El hidroAvion esta aterrizando";
    }
}
class coche implements IVehiculo
{
    int deposito=1;
    @Override
    public String moverse()
    {
        if (deposito>0) {return "coche y se está moviendose";}
        else {return "coche sin gasolina";}
    }
}
class conductor
{
    IVehiculo iVehiculo;
    public conductor(IVehiculo iVehiculoP)
    {
        iVehiculo=iVehiculoP;
    }
    public String conducir()
    {
        return "El conductor tiene un " +iVehiculo.moverse();
    }

}
