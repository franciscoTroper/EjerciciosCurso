package ConexionConSqL.comCoreNerwork2.Modelo;

import java.sql.Date;

public class visita
{
    private int id_visita;
    private Date fvisita;
    private String matricula;
    private int id_lugar;
    private String dni;



    public visita(int id_visita, String dni) {
        this.id_visita = id_visita;
        this.dni = dni;
    }

    public int getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFvisita() {
        return fvisita;
    }

    public void setFvisita(Date fvisita) {
        this.fvisita = fvisita;
    }

    @Override
    public String toString() {
        return "visita{" +
                "id_visita=" + id_visita +
                ", fvisita=" + fvisita +
                ", matricula='" + matricula + '\'' +
                ", id_lugar=" + id_lugar +
                ", dni='" + dni + '\'' +
                '}';
    }
}
