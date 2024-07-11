package ConexionConSqL.comCoreNetwork.Modelo;

import java.sql.Date;

public class Autobus
{
    private String matricula;
    private int a_fabricacion;

    public Autobus() {}

    public Autobus(String matricula, int a_fabricacion) {
        this.matricula = matricula;
        this.a_fabricacion = a_fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getA_fabricacion() {
        return a_fabricacion;
    }

    public void setA_fabricacion(int a_fabricacion) {
        this.a_fabricacion = a_fabricacion;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "matricula='" + matricula + '\'' +
                ", a_fabricacion=" + a_fabricacion +
                '}';
    }
}
