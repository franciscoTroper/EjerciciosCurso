package ejercicios;

import java.awt.*;

class MainGlobo
{
    public static void main(String[] args)
    {
     Globo globo=new Globo(Color.BLACK);

        System.out.println(globo.inflarGlobos());
        System.out.println(  globo.explotarGlobo());
    }
}

public class Globo
{
    private String ColorGlobo;
    private int idGlobo;

    public Globo() {}

    public Globo(Color colorP)
    {
       final Color color1=colorP;
       ColorGlobo=color1.toString();
        idGlobo++;
    }

    public String inflarGlobos()
    {
        return "Estoy inflando el globo";
    }
    public String explotarGlobo()
    {
        return "Voy a explotar el globo";
    }

    public int getIdGlobo() {
        return idGlobo;
    }

    public void setIdGlobo(int idGlobo) {
        this.idGlobo = idGlobo;
    }

    public String getColorGlobo() {
        return ColorGlobo;
    }
}
