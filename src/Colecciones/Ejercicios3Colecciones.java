package Colecciones;

import java.util.*;

public class Ejercicios3Colecciones
{
    public static void main(String[] args)
    {
        Pedido p1=new Pedido();

    }
}

class Pedidos
{
    protected int idPedido=0;
    protected int idCliente=0;
    protected Map<Integer,String[]> pedidos=new HashMap<>();
    protected String[] datosPedidos=new String[4];
    protected float IVA=0.21f;
}
class Pedido extends Pedidos
{
    private Map<Integer,String[]> pedido=new HashMap<>();
    private int respuesta;
    private int respuesta3;
    public Pedido()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Que pedido quieres hacer?: ");
        System.out.println("1=Platanos");
        System.out.println("2=Fresas");
        System.out.println("3=Manzanas");
        respuesta=scanner.nextInt();
        AltaPedido();
        System.out.println("¿Quieres hacer ahora?");
        System.out.println("1.Baja");
        System.out.println("2.Consultar pedido");
        System.out.println("3.Consultar pedidos");
        System.out.println("4.Modificar pedido");
        respuesta=scanner.nextInt();

        System.out.println("Introduce el id pedido");
        respuesta3=scanner.nextInt();

        if(respuesta==1){BajaPedido(respuesta3);}
        if(respuesta==2){ConsultarPedido(respuesta3);}
        if(respuesta==3){ConsultarTodosLosPedidos();}
        if(respuesta==4)
        {
            String respuesta2="";
            System.out.println("¿Que producto quieres modificar?");
            System.out.println("1=Platanos");
            System.out.println("2=Fresas");
            System.out.println("3=Manzanas");
            respuesta2=scanner.nextLine();

            ModificarPedido(respuesta,respuesta2);}


    }
    public void AltaPedido()
    {


        if(respuesta==1)
        {
            datosPedidos[0]=String.valueOf(idCliente);
            datosPedidos[1]=("platano");
            datosPedidos[2]=("4.99");
            datosPedidos[3]=String.valueOf(IVA*4.99f/100);
            pedidos.put(idPedido,datosPedidos);
        }
        else if (respuesta==2)
        {
            datosPedidos[0]=String.valueOf(idCliente);
            datosPedidos[1]=("fresas");
            datosPedidos[2]=("5.34");
            datosPedidos[3]=String.valueOf(IVA*4.99f/100);
            pedidos.put(idPedido,datosPedidos);
        }
        else if (respuesta==3)
        {
            datosPedidos[0]=String.valueOf(idCliente);
            datosPedidos[1]=("manzanas");
            datosPedidos[2]=("3.44");
            datosPedidos[3]=String.valueOf(IVA*4.99f/100);
            pedidos.put(idPedido,datosPedidos);
        }
        idPedido++; idCliente++;

    }
    public void BajaPedido(int idPedido)
    {
        pedidos.remove(idPedido);
    }
    public void ConsultarPedido(int idPedidoP)
    {
      String[] localString=  pedidos.get(idPedidoP);
      for (String elemento:localString){System.out.println(elemento);}
    }
    public void ConsultarTodosLosPedidos()
    {
        Collection<String[]>datos=pedidos.values();
        for(String [] elemento:datos)
        {
            for (String elemento2:elemento)
            {
                System.out.println(elemento2);
            }
        }
    }
    public void ModificarPedido(int idPedidoP, String datosModificados)
    {
        datosPedidos[1]=datosModificados;
        pedidos.put(idPedidoP,datosPedidos);
    }
}
class Productos
{
    private static Map<String,Float> productos=new HashMap<>();
    public static void   Productos()
    {
        productos.put("platanos", 4.99f);
        productos.put("Fresas", 5.34f);
        productos.put("manzanas",3.44f);
    }
    public static Map<String,Float> getProductos()
    {
        return productos;
    }
}
