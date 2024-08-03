package ExpresionesLamda;

public class ejemplos
{
    public static void main(String[] args)
    {
        OperacionMatematica operacionMatematica=(a, b) -> a+b;
        System.out.println(operacionMatematica.calcular(18,7));
        operacionMatematica=(a, b) -> a*b;
        System.out.println(operacionMatematica.calcular(18,7));

    }
}
interface OperacionMatematica {
    int calcular(int a, int b);
}
