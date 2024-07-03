package Colecciones;

import java.util.*;

public class EjerciciosColecciones
{
    public static void main(String[] args)
    {

        System.out.println("============= EJERCICIO 1 =================");
        Colecciones1 colecciones1=new Colecciones1();
        colecciones1.AddHashSetData("Mi nombre es Fran");
        colecciones1.AddHashSetData("Su nombre es Juan");
        System.out.println(colecciones1.toString());

        System.out.println("============= EJERCICIO 2 ================");
        ColeccionArrayList coleccionArrayList=new ColeccionArrayList();
        String[] frases={"Hola","Leon","Tigre","Jurel"};
        int contador=0;
        for(String elemento:frases)
        {
            coleccionArrayList.AddNew(frases[contador]);
            contador++;
        }
        System.out.println(coleccionArrayList.toString());

        System.out.println("============== EJERCICIO 3 =================");
        System.out.println(new ProgramaAlmacenaje().toString());

        System.out.println("============== EJERCICIO 4 =================");
        ProgramaalmacenajeNotas programaalmacenajeNotas=new ProgramaalmacenajeNotas();


        System.out.println("============== EJERCICIO 5 ==================");
        Diccionario diccionario=new Diccionario();



    }
}
//Ejercicio 1
//Cree una clase que tenga un objeto de la clase HashSet, que añada varias cadenas al objeto e imprima todas las cadenas. Utilizar el tipo genérico String.

class Colecciones1
{
    private Set objeto1;

    public Colecciones1()
    {
        objeto1=new HashSet<>();
    }

    public void AddHashSetData(String cadena)
    {
        objeto1.add(cadena);
    }

    @Override
    public String toString() {
        return "Colecciones1{" +
                "objeto1=" + objeto1 +
                '}';
    }
}

//Ejercicio 2
//Cree un objeto de la clase ArrayList, añada una lista de cadenas y utilice un bucle for each.

class ColeccionArrayList
{
    ArrayList<String>cadenas;
    public ColeccionArrayList() {cadenas=new ArrayList<>();}
    public void AddNew(String elemento) {cadenas.add(elemento);}

    @Override
    public String toString() {
        return "ColeccionArrayList{" +
                "cadenas=" + cadenas +
                '}';
    }
}

//        Ejercicio 3
//Cree un programa almacene números del 0 al 9 en un array y en una lista, e imprima sus valores.

class ProgramaAlmacenaje
{
    private int[] numeros;
    private ArrayList<Integer> numArrayList;
    private int contador;
    public ProgramaAlmacenaje()
    {
        numeros= new int[10];
        numArrayList=new ArrayList<>();
        for (int a=0;a<10;a++)
        {
            numeros[a]=a;
            numArrayList.add(a);
        }
    }
    @Override
    public String toString() {
        return "ProgramaAlmacenaje{" +
                "numeros=" + Arrays.toString(numeros) +
                ", numArrayList=" + numArrayList +
                '}';
    }
}
//Ejercicio 4
//Cree un programa que almacene la nota de una asignatura de varios alumnos en una colección de tipo Map. El alumno se identificará por su nombre.
//Cada elemento del mapa estará formado por nombre de tipo String y nota de tipo Integer. Utilizar tipos genéricos.

class ProgramaalmacenajeNotas
{
    private Map<String,Float>notasAlumnos;
    private Scanner scanner;
    public ProgramaalmacenajeNotas()
    {
        notasAlumnos=new HashMap<>();
        scanner=new Scanner(System.in);
        RellenarDatos();
    }

    public void RellenarDatos()
    {
        System.out.print("Introduce tu nombre: ");
        String respuestanombre=scanner.nextLine();

        System.out.println("");

        System.out.println("Introduce tu nota: ");
        float respuestaNota= scanner.nextFloat();

        notasAlumnos.put(respuestanombre,respuestaNota);

        scanner.nextLine();

        System.out.println("¿Quieres seguir rellenando: ");
        String respuesta=scanner.nextLine();

        if (respuesta.equals("S")){RellenarDatos();}
        else {System.out.println("Adios");}
    }

    @Override
    public String toString() {
        return "ProgramaalmacenajeNotas{" +
                "notasAlumnos=" + notasAlumnos +
                '}';
    }
}


//        Ejercicio 5
//Cree un programa que implemente un diccionario. El diccionario debe contener palabras en castellano y una lista de posibles significados de cada palabra.
//Crear la clase Palabra que permita almacenar la información de una palabra, junto con sus definiciones.
//Utilizar un objeto HashMap para almacenar palabras en la clase Diccionario.

class Diccionario
{
    private Map<String,String>diccionario;
    private Scanner scanner;
    public Diccionario()
    {
        diccionario=new HashMap<>();
        scanner=new Scanner(System.in);
        AlmacenarPalabra();
    }


    public void AlmacenarPalabra()
    {
        System.out.println("Introduce la nueva palabra: ");
        String palabra=scanner.nextLine();
        System.out.println("Introduce el diccionario: ");
        String significado=scanner.nextLine();
        diccionario.put(palabra,significado);
        System.out.println("¿Quieres introducir mas palabras?");
        String respuesta=scanner.nextLine();
        if (respuesta.equals("S")){AlmacenarPalabra();}
        else {System.out.println("Adios");}
    }

}