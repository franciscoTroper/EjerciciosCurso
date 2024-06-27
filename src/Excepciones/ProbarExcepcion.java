package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProbarExcepcion {
    static Scanner scanner;
    public static void main(String[] args) {

        System.out.print("Introduce un numero: ");
        introducirNumero();
        errorIndidceArray();

    }
    public static void introducirNumero()
    {
        scanner=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero=0;
        try {
            numero=scanner.nextInt();
            System.out.println("Gracias");
        }catch (InputMismatchException e){
            System.out.println("Mete bien el numero huevon");
            introducirNumero();
        }
    }
    public static void errorIndidceArray()
    {
        int [] numeros={1,2,5,2};
        try {System.out.println(numeros[5]);}
        catch (IndexOutOfBoundsException e){e.printStackTrace();}


    }
}
