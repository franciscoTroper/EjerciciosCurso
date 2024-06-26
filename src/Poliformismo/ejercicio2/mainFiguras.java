package Poliformismo.ejercicio2;

public class mainFiguras
{
    public static void main(String[] args)
    {
        //Crear una instancia de cuadrado con el nombre de objeto cPeque asignando los valores por setters
        Cuadrado cPeque =new Cuadrado();
        cPeque.setLado(5);cPeque.setX(3);cPeque.setY(2);

        //Crear una instancia de cuadrado en una referencia de figura con el nombre de objeto CMediano usando constructor
        Figura cMediano=new Cuadrado(7,8,6);

        //Crear una instancia de triangulo con el nombre de objeto tPeque asignando los valores por setters
        Triangulo tPeque =new Triangulo();
        tPeque.setX(2);tPeque.setY(4); tPeque.setBase(5);tPeque.setAltura(6);

        //Creas una instancia de triangulo en una referencia de figura con el nombre de objeto tMediano usando el onstructor
        Figura tMediano =new Triangulo(3,5,6,7);

        //Crear una matriz de figuras y asignarle los objetos creados
        Figura[] figuras=new Figura[4];
        figuras[0]=cPeque;
        figuras[1]=cMediano;
        figuras[2]=tPeque;
        figuras[3]=tMediano;


        //En un bucle for each calcular el area de cada uno
        for (Figura elemento:figuras)
        {
            System.out.println(elemento.calcularArea());

        }
    }
}
