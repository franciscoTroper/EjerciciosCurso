package Poliformismo;

public class InstrumentoMusical
{
    protected String marca;

    public InstrumentoMusical() {}

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String emitirSonido()
    {
     return "Su sonido es ";
    }
}
