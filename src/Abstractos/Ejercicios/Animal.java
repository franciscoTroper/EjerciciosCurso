package Abstractos.Ejercicios;

class Main2
{
    public static void main(String[] args) {
        Animal animal=new perro(){
            @Override
            public String moverser() {
                return super.moverser()+" Fran";
            }

            @Override
            public String comer() {
                return super.comer()+" Fran";
            }
        };


    }
}

public abstract class Animal
{
    public abstract String comer();
    public abstract String moverser();

}
class perro extends Animal
{
    @Override
    public String comer() {
        return "Hola";
    }

    @Override
    public String moverser() {

        return "Adios";
    }
}
