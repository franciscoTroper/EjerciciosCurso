package herencia.ejercicios;
import java.time.LocalDateTime;

//Ejercicio Repaso Clases
/*Crear una clase llamada Cuenta, que defina operaciones
	sobre una cuenta bancaria.
	La clase tendrá un atributo saldo y los siguientes métodos:
	-ingresar(double cantidad)
	-extraer(double cantidad)
	-obtenerSaldo() */

/*clase CuentaLimite
	Clase que hereda Cuenta. Incorporará un atributo "limite",
	para limitar la extracción a dicho valor.
	Además, añadiremos un método ajustarLimite(), que fijará el límite
	en la mitad del saldo */

/*ADMIN dice:Clase CuentaMovimientos
	Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
	que devolverá un Array con los movimientos realizados en la cuenta
	Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción) */

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class HerenciaCuenta
{
    public static void main(String[] args)
    {
        cuenta c1=new cuenta(5000); //Creando una cuenta depositando dinero
        System.out.println(c1.getSaldo()); //Imprimiendo el saldo

                try {c1.extraer(4000);}  //Intentando Extraer saldo
        catch (Exception e) {e.printStackTrace();}//Haciendo visible el error de la escepcion

        c1.ingresar(2000);

        for (int i=0;i<c1.movimientos.getMovimientos().length;i++)
        {
            System.out.println("");
            for (int a=0;a<3;a++)
            {

                if (c1.movimientos.getMovimientos()[i][a].isBlank()){}
                else
                {
                    System.out.print(c1.movimientos.getMovimientos()[i][a]);
                    System.out.print(" // ");
                }

            }


        }


    }
}
class cuenta
{
    protected double saldo;
    cuentaLimite limite;
    CuentaMovimiento movimientos;

    public cuenta()
    {
        saldo=0;
    }
    public cuenta(double saldo)
    {

       this.saldo = saldo;
       limite=new cuentaLimite();
       movimientos=new CuentaMovimiento();

    }

    public double getSaldo() {return saldo;}
    public void ingresar(double ingreso)
    {
        saldo+=ingreso;
        movimientos.setMovimiento(ingreso, "ingreso");
    }
    public void extraer(double extraccion) throws Exception
    {
        if (extraccion>saldo) {throw new Exception("Saldo inferior");}
        else {saldo-=extraccion;  movimientos.setMovimiento(extraccion, "extraccion");}
    }
}
class cuentaLimite extends cuenta
{
    protected double limiteExtraccion;

    public cuentaLimite() {}
    public cuentaLimite(double limiteExtraccion) {this.limiteExtraccion = limiteExtraccion;}

    public void ajustarLimite() {limiteExtraccion=saldo/2;}
}
class CuentaMovimiento extends cuentaLimite
{
    String [][] movimientostodos;
    int contador=0;

    public CuentaMovimiento ()
    {
        movimientostodos=new String[1][3];
    }

    public String[][] getMovimientos()
    {

        return movimientostodos;
    }

    public void setMovimiento(Double dineroMovimiento,String tipoDeMovimiento)
    {
        String[][] copiaLocal=movimientostodos;
        movimientostodos=new String[contador][3];
        for (int a=0;a<copiaLocal.length;a++)
        {
            for (int b=0;b<3;b++)
            {
                movimientostodos[a][b]=copiaLocal[a][b];
            }
        }
        movimientostodos[contador][0]=dineroMovimiento.toString();
        movimientostodos[contador][1]=String.valueOf(LocalDateTime.now());
        movimientostodos[contador][2]=tipoDeMovimiento;
        contador++;
    }
}
