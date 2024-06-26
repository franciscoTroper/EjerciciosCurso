package Poliformismo;

public class Flauta extends InstrumentoMusical
{
    private String material;

    @Override
    public String emitirSonido() {
        return super.emitirSonido()+"flauta";
    }

    public Flauta(String material) {
        this.material = material;
    }

    public Flauta() {}

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
