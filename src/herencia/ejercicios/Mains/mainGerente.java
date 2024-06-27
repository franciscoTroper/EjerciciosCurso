package herencia.ejercicios.Mains;

import herencia.ejercicios.Empleados;
import herencia.ejercicios.Gerente;
import herencia.ejercicios.TrabajadorNormal;

public class mainGerente
{
    public static void main(String[] args)
    {
        Empleados poliformismo=new Gerente(222,"","Juan",72727,"",8,2828);
        Gerente g1=new Gerente(1,"Ana Flores",
                                "93849493089",3_000,
                                "Ventas",1_000,
                                6);
        Empleados[] empleados=new Empleados[3];
        empleados[0]=poliformismo;
        empleados[1]=new Gerente(8383,"838383h","Juan",
                                8383,"Comunicaciones",200,200);
        empleados[2]=new TrabajadorNormal("Fran");

        Gerente gerente=(Gerente) poliformismo;

    }




}
