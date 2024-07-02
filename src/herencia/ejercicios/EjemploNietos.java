package herencia.ejercicios;

public class EjemploNietos
{
    //Si creo una variable en la clase padre que se llama igual a variable del abuelo,
    // esta se sobreescribe o solo accede a la del padre.
    public static void main(String[] args) {
        System.out.println(padre.num);
        String ejemploCadena="Hola";


    }
}
class abuelo
{
    protected static int num=5;
}
class padre extends abuelo
{
    protected static int num=4;
    
}
class nieto extends padre
{

}
