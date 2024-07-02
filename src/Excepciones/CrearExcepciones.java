package Excepciones;

public class CrearExcepciones
{
    static int num=3;

    public static void main(String[] args) {
        try {
            System.out.println(prueba());
        }catch (Exception e){e.printStackTrace();}

    }

    public static int prueba() throws Exception
    {
        if (num==2){return num;}
        else { throw new Exception("Numero no correcto");}

    }
}
