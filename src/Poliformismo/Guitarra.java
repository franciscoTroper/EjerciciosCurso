package Poliformismo;

public class Guitarra extends InstrumentoMusical
{
    private String tipoCuerdas;

    @Override
    public String emitirSonido() {
        return super.emitirSonido()+"gli gli";
    }

    public Guitarra() {}

    public Guitarra(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;

    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
