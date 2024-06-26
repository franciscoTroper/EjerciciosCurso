package herencia.ejercicios;

public class Gerente extends Empleados
{
    private String departamento;
    private int personasACargo;
    private double bono;

    public Gerente() {}

    @Override
    public void calcularNomina2() {

    }

    public Gerente(int idEmpleado, String DNI, String nombre, double sueldo, String departamento, int personasACargo, double bono)
    {
        super(idEmpleado, DNI, nombre, sueldo);
        this.departamento = departamento;
        this.personasACargo = personasACargo;
        this.bono = bono;

    }

    @Override
    public double calcularNomina() {
        return super.calcularNomina()+bono;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public double getBono() {
        return bono;
    }

}
