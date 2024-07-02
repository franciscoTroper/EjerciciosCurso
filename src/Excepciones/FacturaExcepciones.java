package Excepciones;


public class FacturaExcepciones
{
    public static void main(String[] args)
    {
        Factura factura1=new Factura(0,16);
        try {factura1.comprobarFactura();}
        catch (Exception e){e.printStackTrace();}
    }
}
class Factura
{
   static private int idFactura;
   static private int idClient;

    public Factura() {
    }

    public Factura(int idFactura, int idClient) {
        this.idFactura = idFactura;
        this.idClient = idClient;
    }


    public void comprobarFactura() throws Exception
    {
        if (idFactura==0) {throw new Exception("idFactura no puede ser 0");}
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", idClient=" + idClient +
                '}';
    }

    public int getIdFactura() {return idFactura;}

    public void setIdFactura(int idFactura) {this.idFactura = idFactura;}

    public int getIdClient() {return idClient;}

    public void setIdClient(int idClient) {this.idClient = idClient;}
}
