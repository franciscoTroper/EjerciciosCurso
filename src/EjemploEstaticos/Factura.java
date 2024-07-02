package EjemploEstaticos;

class Main
{
    public static void main(String[] args)
    {
        System.out.println(Factura.getConsecutivoFactura());
        Factura factura=new Factura();
        System.out.println(factura.getIdFactura());

        System.out.println(calculadora.suma(2.0,5.0));

    }
}

public class Factura
{
    private static int consecutivoFactura;
    private int idFactura;


    public Factura()
    {
        idFactura=++consecutivoFactura;

    }

    public static int getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public static void setConsecutivoFactura(int consecutivoFactura) {
        Factura.consecutivoFactura = consecutivoFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }
}
class calculadora
{
    public static double suma(double num1, double num2)
    {
        return num1+num2;
    }
    public static double resta(double num1, double num2)
    {
        return num1-num2;
    }
    public static double multiplicar(double num1, double num2)
    {
        return num1*num2;
    }
    public static double dividir(double num1, double num2)
    {
        return num1/num2;
    }
}

