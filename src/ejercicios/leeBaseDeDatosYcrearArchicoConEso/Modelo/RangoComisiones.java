package ejercicios.leeBaseDeDatosYcrearArchicoConEso.Modelo;

public class RangoComisiones
{
    private double limiteInferior;
    private double limiteSuperior;
    private double porcentae;

    public RangoComisiones() {
    }
    public RangoComisiones(double limiteInferior, double limiteSuperior, double porcentae) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.porcentae = porcentae;
    }

    public double getLimiteInferior() {
        return limiteInferior;
    }
    public double getLimiteSuperior() {
        return limiteSuperior;
    }
    public double getPorcentae() {
        return porcentae;
    }

    public void setLimiteInferior(double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }
    public void setLimiteSuperior(double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }
    public void setPorcentae(double porcentae) {
        this.porcentae = porcentae;
    }

    @Override
    public String toString() {
        return "RangoComisiones{" +
                "limiteInferior=" + limiteInferior +
                ", limiteSuperior=" + limiteSuperior +
                ", porcentae=" + porcentae +
                '}';
    }
}
