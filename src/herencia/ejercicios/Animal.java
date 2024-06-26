//EJERCICIO 2
//    Crear la clase Animal con los atributos (propiedades) y operaciones (métodos) que se
//    estimen oportunos.
//    Crear la clase TestAnimal desde donde se crearán 3 objetos: Perro, pez y cocodrilo.
//    Modificar las propiedades de cada objeto y llamar a cada uno de los métodos
//    mostrando el resultado por pantalla.


package herencia.ejercicios;

public class Animal
{
    protected int numExtremidades;
    protected boolean vuela;
    protected String tamaño;

    public Animal() {}

    public Animal(int numExtremidades, boolean vuela, String tamaño)
    {
        this.numExtremidades = numExtremidades;
        this.vuela = vuela;
        this.tamaño = tamaño;
    }

    //moverse, comer, sonidoEmitido
    public String moverse(String rapidez)
    {

        return rapidez;
    }
    public String comer(String cantidad)
    {
        return cantidad;
    }
    public String sonidoEmitido(String tipoDesonido)
    {
        return tipoDesonido;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
