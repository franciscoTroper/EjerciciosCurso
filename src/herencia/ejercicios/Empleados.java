package herencia.ejercicios;

public abstract class Empleados
{
    protected int idEmpleado;
    protected String nombre;
    protected String DNI;
    protected double sueldo;

    public Empleados() {}

    public Empleados(int idEmpleado, String DNI, String nombre, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.DNI = DNI;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public abstract void calcularNomina2();







    public double calcularNomina()
    {
        return sueldo*0.85;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }
}
