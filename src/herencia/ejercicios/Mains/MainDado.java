package herencia.ejercicios.Mains;

import herencia.ejercicios.Dado;

public class MainDado
{
    public static void main(String[] args) {
        Dado dado=new Dado();
        System.out.println("Numero de dado es el "+dado.lanzarDado());
        dado.dibujarDado();

    }
}
