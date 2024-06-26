package Poliformismo;

public class Bateria extends InstrumentoMusical
{
    private int numPlatillos;

    @Override
    public String emitirSonido() {
        return super.emitirSonido()+"Bateria";
    }

    public Bateria() {}

    public Bateria(int numPlatillos) {
        this.numPlatillos = numPlatillos;
    }

    public int getNumPlatillos() {
        return numPlatillos;
    }

    public void setNumPlatillos(int numPlatillos) {
        this.numPlatillos = numPlatillos;
    }
}
