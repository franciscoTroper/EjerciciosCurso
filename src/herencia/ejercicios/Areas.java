//        EJERCICIO 3
//    Crear la clase Areas con métodos para calcular el área de un circulo y el área de un
//    rectángulo. Desde una clase principal realizar ambos cálculos y mostrarlos por pantalla.


package herencia.ejercicios;

public class Areas
{

    public String areaCirculo(double radio)
    {
        //A=πr2
        return String.valueOf((Math.PI*Math.pow(radio,2)));
    }
    public String areaRectangulo(double lado, double altura)
    {
        //A=l⋅a
        return String.valueOf(lado*altura);
    }

}
