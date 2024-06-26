package Poliformismo;

public class MainPoliformismo
{



    public static void main(String[] args)
    {
//        Guitarra guido=(Guitarra) new InstrumentoMusical();
//        Bateria bataca=(Bateria) new InstrumentoMusical();
//        Flauta ham=(Flauta) new InstrumentoMusical();
        InstrumentoMusical guido= new Guitarra("nylon");
        InstrumentoMusical bataca=new Bateria(5);
        InstrumentoMusical ham=new Flauta("madera");

        InstrumentoMusical[] instrumentos=new InstrumentoMusical[3];
        instrumentos[0]=guido;
        instrumentos[1]=bataca;
        instrumentos[2]=ham;
        for (InstrumentoMusical elemento:instrumentos)
        {
            System.out.println(elemento.getClass());
            System.out.println(elemento.emitirSonido());
        }

    }
}
