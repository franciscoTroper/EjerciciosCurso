package Socket.teoria.Modelo;

import Socket.teoria.presentacion.clienteServidor.ClienteTienda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaLibreria
{
    private String horario;
    private List<String> diasFestivos=new ArrayList<>();
    private boolean tenerLibro;
    private float precioLibro;
    private Scanner scanner=new Scanner(System.in);
    private int respuestaPregunta=0;
    private List<String>librosQueTengo=new ArrayList<>();
    private List<Float>precioLibros=new ArrayList<>();

    @Override
    public String toString() {
        return "TiendaLibreria{" +
                "horario='" + horario + '\'' +
                ", diasFestivos=" + diasFestivos +
                ", tenerLibro=" + tenerLibro +
                ", precioLibro='" + precioLibro + '\'' +
                '}';
    }
    public TiendaLibreria() {
        horario="de 9 a 21 horas";
        librosQueTengo();
        diasFestivos.add("22");diasFestivos.add("15");

    }
    private void librosQueTengo()
    {
        librosQueTengo.add("Cabal"); precioLibros.add(2.25f);
        librosQueTengo.add("Centro de la tierra"); precioLibros.add(5.05f);
        librosQueTengo.add("Tiburon 4"); precioLibros.add(6.5f);
        librosQueTengo.add("Freddy krugues"); precioLibros.add(7.6f);
    }
    public TiendaLibreria(String horario, List<String> diasFestivos, boolean tenerLibro, int precioLibro) {
        this();
        this.horario = horario;
        this.diasFestivos = diasFestivos;
        this.tenerLibro = tenerLibro;
        this.precioLibro = precioLibro;
    }

    public String getHorario() {
        return horario;
    }
    public List<String> getDiasFestivos() {
        return diasFestivos;
    }
    public boolean isTenerLibro() {
        return tenerLibro;
    }
    public float getPrecioLibro() {
        return precioLibro;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void setDiasFestivos(List<String> diasFestivos) {
        this.diasFestivos = diasFestivos;
    }
    public void setTenerLibro(boolean tenerLibro) {
        this.tenerLibro = tenerLibro;
    }
    public void setPrecioLibro(float precioLibro) {
        this.precioLibro = precioLibro;
    }

    public void programa() throws IOException {
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Consultar horario tienda");
        System.out.println("2. consultar dias festivos");
        System.out.println("3. consultar si tienen libro");
        System.out.println("4. Consultar precio del libro");
        System.out.print("Escribe aqui tu respuesta: ");
        respuestaPregunta=scanner.nextInt();
        if (respuestaPregunta==1){
            Socket peticion = new Socket("localhost", 3000);
            PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
            sSalida.println(getHorario());
            BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
        }
        else if (respuestaPregunta==2) {
            Socket peticion = new Socket("localhost", 3000);
            PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
            sSalida.println(getDiasFestivos());
            BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
        }
        else if (respuestaPregunta==3) {
            System.out.println("Escribe el titulo del libro: ");
            String respuesta=scanner.next();
            for (String elemento: librosQueTengo)
            {
                if (respuesta.equals(elemento)){setTenerLibro(true);}
            }
            Socket peticion = new Socket("localhost", 3000);
            PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
            sSalida.println(isTenerLibro());
            BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));

        }
        else if (respuestaPregunta==4) {
            System.out.println("Escribe libro a consultar precio");
            for (String elemento : librosQueTengo)
            {
                System.out.println("1. "+ elemento);
            }
            respuestaPregunta=scanner.nextInt();
            precioLibro=precioLibros.get(respuestaPregunta-1);
            Socket peticion = new Socket("localhost", 3000);
            PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
            sSalida.println(getPrecioLibro());
            BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
        }
    }



}
