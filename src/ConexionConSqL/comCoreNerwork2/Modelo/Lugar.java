package ConexionConSqL.comCoreNerwork2.Modelo;

public class Lugar
{
    private int id_lugar;

    public Lugar(){}

    public Lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    public int getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "id_lugar=" + id_lugar +
                '}';
    }
}
