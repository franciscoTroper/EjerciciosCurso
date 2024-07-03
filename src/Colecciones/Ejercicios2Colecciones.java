package Colecciones;


public class Ejercicios2Colecciones
{
    public void main(String[] args)
    {
        Componentecoche componentecoche=new PuertaCoche(true);


    }

    //Enunciado 1
//        Defina una clase Linea con dos atributos: puntoA y_puntoB. Son dos puntos por los que pasa
//        la línea en un espacio de dos dimensiones. La clase dispondrá de los siguientes métodos:
//    - Linea(): Constructor predeterminado que crea una línea con sus dos puntos como (0,0) y
//            (0,0).
//            - Linea(Punto, Punto): Constructor que recibe como parámetros dos objetos de la clase
//        Punto, que son utilizados para inicializar los atributos.
//        - mueveDerecha(double): Desplaza la línea a la derecha la distancia que se indique.
//            - mueveIzquierda(double): Desplaza la línea a la izquierda la distancia que se indique.
//            - mueveArriba(double): Desplaza la línea hacia arriba la distancia que se indique.
//        - mueveAbajo(double): Desplaza la línea hacia abajo la distancia que se indique.
//        - Getters y setters.
//        - Método que nos permita mostrar la información de la línea de la forma [puntoA,puntoB].
//        Por ejemplo: [(0.0,0.0),(1.0,1.0)].

    class Linea
    {
        private double puntoA,puntoB;

        public Linea() {}
        public Linea(double puntoA) {this.puntoA = puntoA;}
        public void DesplazarLinea(String direccionp, double desplazamientoX,double desplazamientoY)
        {
            String direccion=direccionp.toUpperCase();
           if(direccion.equals("DERECHA")) {puntoA+=desplazamientoX;puntoB+=desplazamientoX;}
           else if (direccion.equals("IZQUIERDA")) {puntoA-=desplazamientoX;puntoB-=desplazamientoX;}
           else if (direccion.equals("ARRIBA")) {puntoA+=desplazamientoY;puntoB+=desplazamientoY;}
           else if (direccion.equals("ABAJO")) {puntoA-=desplazamientoY;puntoB-=desplazamientoY;}
           else {System.out.println("Pusiste mal la direccion");}

        }

        public double getPuntoA() {
            return puntoA;
        }

        public void setPuntoA(double puntoA) {
            this.puntoA = puntoA;
        }

        public double getPuntoB() {
            return puntoB;
        }

        public void setPuntoB(double puntoB) {
            this.puntoB = puntoB;
        }

        @Override
        public String toString() {
            return "Linea{" +
                    "puntoA=" + puntoA +
                    ", puntoB=" + puntoB +
                    '}';
        }
    }

//    Enunciado 2
//        Desarrolle una clase Cafetera con atributos_capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
//        y _cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
//        - Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual en cero (cafetera vacía).
//        - Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima.
//        - Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad
//        máxima de la cafetera, la ajustará al máximo.
//        - Getters y setter.
//        - llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
//        - servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
//          Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
//        - vaciarCafetera(): pone la cantidad de café actual en cero.
//        - agregarCafe(int): añade a la cafetera la cantidad de café indicada.

    class Cafetera
    {
        private double cantidadMax;
        private double contidadActual;

        public Cafetera()
        {
            cantidadMax=1000;
            contidadActual=0;
        }

        public Cafetera(double contidadmaxima) {
            this.contidadActual = contidadmaxima;
        }

        public Cafetera(double cantidadMax, double contidadActual) {
            this.cantidadMax = cantidadMax;
            this.contidadActual = contidadActual;
            if (this.contidadActual>contidadActual){contidadActual=cantidadMax;}
        }
        public void llenarCafetera()
        {
            contidadActual=cantidadMax;
        }
        public void servirTaza(double capacidadTazaP)
        {
            if (contidadActual<capacidadTazaP){contidadActual=0;}
        }
        public void vaciarCafetera(){contidadActual=0;}
        public void agregarCafe(double cantidadAgregada)
        {
            if (cantidadAgregada>cantidadMax){contidadActual=cantidadMax;}
            else {contidadActual+=cantidadAgregada;}
        }

        public double getCantidadMax() {
            return cantidadMax;
        }

        public void setCantidadMax(double cantidadMax) {
            this.cantidadMax = cantidadMax;
        }

        public double getContidadActual() {
            return contidadActual;
        }

        public void setContidadActual(double contidadActual) {
            this.contidadActual = contidadActual;
        }
    }

    //            Enunciado 3
//        Defina los siguientes elementos:
//        - interface Puerta: con los métodos abrir y cerrar.
//        - interface PuertaBloqueable: extiende de Puerta, con los métodos bloquea y desbloquea.
//            - interface Alarma: con los métodos isAlarmaActivada, activarAlarma y desactivarAlarma.
//        - clase ComponentedeCoche: con los atributos descripción, peso y coste, y un método que muestre dichos atributos.
//        - clase PuertaCoche, con el atributo boolean estaBloqueada, y que extienda la clase ComponentedeCoche e implemente las interfaces Alarma y Puertabloqueable.
//        Escriba un programa que pruebe la clase PuertaCoche y todas las operaciones que admite.


    interface Puerta
    {
        public String Abrir();
        public String Cerrar();
    }
    interface PuertaBloqueada extends Puerta
    {
        public String bloquearPuerta();
        public String DesbloquearPuerta();
    }
    interface Alarma
    {
        public boolean isalarmaActiva();
        public String activarAlarma();
        public String desactivarAlarma();
    }
    class Componentecoche
    {
        private String Descripcion;
        private double peso;
        private float coste;

        public Componentecoche(String descripcion, double peso, float coste) {
            Descripcion = descripcion;
            this.peso = peso;
            this.coste = coste;
        }

        public Componentecoche() {

        }

        @Override
        public String toString() {
            return "Componentecoche{" +
                    "Descripcion='" + Descripcion + '\'' +
                    ", peso=" + peso +
                    ", coste=" + coste +
                    '}';
        }
    }
    class PuertaCoche extends Componentecoche implements Alarma,PuertaBloqueada
    {
        private boolean puertaBloqueda;

        public PuertaCoche(boolean puertaBloqueda) {

            this.puertaBloqueda = puertaBloqueda;
        }

        @Override
        public boolean isalarmaActiva() {
        return false;
        }

        @Override
        public String activarAlarma() {
        return "Alarma activada";
        }

        @Override
        public String desactivarAlarma() {
        return "Alarma desactivada";
        }

        @Override
        public String bloquearPuerta() {
        return "Puerta bloqueada";
        }

        @Override
        public String DesbloquearPuerta() {
        return "Puerta desbloqueada";
        }

        @Override
        public String Abrir() {
        return "Puerta abierta";
        }

        @Override
        public String Cerrar() {
        return "Puerta cerrada";
        }
    }
}
