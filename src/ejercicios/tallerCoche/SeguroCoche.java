package ejercicios.tallerCoche;


public class SeguroCoche
{
     private  String aseguradora;
     private  ITaller iTaller;


    public SeguroCoche() {
    }

    public SeguroCoche(String aseguradora, ITaller iTaller) {
        this.aseguradora = aseguradora;
        this.iTaller = iTaller;
    }

    public String reparar(Coche coche)
    {
        return  coche.getModelo() +". Su matricula es "+ coche.getMatricula() + ". Su seguro es " + aseguradora +
                ". Necesita ir al " +iTaller.toString();
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        aseguradora = aseguradora;
    }

    public ITaller getiTaller() {
        return iTaller;
    }

    public void setiTaller(ITaller iTaller) {
        this.iTaller = iTaller;
    }
}
