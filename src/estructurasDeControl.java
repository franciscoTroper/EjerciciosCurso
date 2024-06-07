import java.time.LocalDate;
import java.util.Scanner;

public class estructurasDeControl
{
    public static void main(String[] args)
    {
        /*  //Decir por la edad si se puede votar
        byte edad=15;
        if(edad>=18){System.out.println("Puede votar");}
        else {System.out.println("No puede votar");}

        //Decir si la contraseña es correcta debe ser igual a 1234A
        String contraseña="75SC";
        if(contraseña.equals("1234A")){System.out.println("Contraseña correcta");}
        else {System.out.println("Contraseña incorrecta");}

        //Verifica si un número está dentro del rango 10-20 o es igual a 30.
        byte numeroRango=5;
        if(numeroRango>10&&numeroRango<20||numeroRango==30)
        {
            System.out.println("condicion se cumple");
        }
        else {System.out.println("No se cumple");}

        //Si la cantidad es mayor a 3 y el producto es "Manzana" dar un 5% de descuento
        float precio=2.34f;
        int cantidad=7;
        float total= precio *cantidad;
        String producto ="Manzana";
        float descuento=5;
        if(cantidad>3&&producto.equals("Manzana"))
        {
            System.out.println("Precio con descuento" + (total - (descuento*total/100)));
        }
        else {System.out.println("Precio sin descuento");}

        //Pedir dos números y decir cual es el mayor o si son iguales.

        int num1=20,num2=25;
        if(num1>num2){System.out.println(num1 + " es mayor");}
        else if (num2>num1) {System.out.println(num2 + "es mayor");}
        else {System.out.println("Son iguales");}

        //Pedir dos números y mostrarlos ordenados de mayor a menor.
        int num3=20,num4=25;
        if(num3>num4){System.out.println(num3 + " " + num4);}
        else if (num4>num3) {System.out.println(num4 + " " + num3);}
        else {System.out.println("Son iguales");}

        //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
        int num5=786;
        System.out.println("Tiene " + Integer.toString(num5).length() + "cifras");

        //Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
        int num6=786,num7=Integer.reverse(num6);
        System.out.println(Integer.toString(num7));

        //Declarar una variable para el estado civil; casado, solterio. divorciado, viudo
        byte estadoCivil=1;
        switch (estadoCivil)
        {
            case 0:
                System.out.println("casado");
                break;
            case 1:
                System.out.println("soltero");
                break;
            case 2:
                System.out.println("divorciado");
                break;
            case 3:
                System.out.println("viudo");
                break;
            default:
                System.out.println("Estado no conocido");



        }

        //Segun el numero de mes, dime los dias que tiene


        String mes="Junio";

        switch (mes)
        {
            case "Enero","Marzo","Mayo","Julio","Agosto","Octubre","Diciembre":
                System.out.println(mes + " tiene 31 dias");
                break;
            case "Febrero":
                System.out.println(mes + " tiene 28 dias");
                break;
            case "Abril","Junio","Septiembre","Noviembre":
                System.out.println(mes + " tiene 30 dias");
                break;
            default:
                System.out.println("No puesiste bien el mes");
        }*/

        //SCANNER Y FOR

        //1. Pedir un número N, y mostrar todos los números del 1 al N.
        //2. Escribir todos los números del 100 al 0 de 7 en 7.
        //3. Diseñar un programa que muestre el producto de los 10 primeros números impares.
        //4. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
        //la cantidad de ceros.
        //5. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
        //6. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo

        Scanner scanner=new Scanner(System.in);
        /*1
        int datosEntrada,c,d,e;
        System.out.print("Escribe un numero: ");
        datosEntrada= scanner.nextInt();
        for(c=0;c<=datosEntrada;c++)
        {
            System.out.println(c);
        }

        /*2for(c=100;c>=0;c-=7) {System.out.println(c);}

        /*3for(c=1,d=0,e=1;d<10;d++,c+=2)
        {System.out.println(e*=c);}

        /*4int sumaTotalPositivos=0,cP=0,sumaTotalnegativos=0,cn=0,cCeros=0;
        System.out.println("Escribe 10 numeros: ");
        for (c=0;c<10;c++)
        {
            System.out.print("Numero " + c++ + ": ");
            datosEntrada=scanner.nextInt();
            if (datosEntrada>0){sumaTotalPositivos+=datosEntrada;cP+=1;}
            else if (datosEntrada<0) {sumaTotalnegativos+=datosEntrada;cn+=1;}
            else {cCeros+=1;}
        }
        System.out.println("Media de numeros positivos: " +sumaTotalPositivos/cP);
        System.out.println("Media de numeros negativos: " +sumaTotalnegativos/cn);
        System.out.println("Media de numeros ceros: " +cCeros);

        /*5int sueldos=0,cantidadMayoresDe1000=0;
        for(c=0;c<10;c++)
        {
            datosEntrada=scanner.nextInt();
            sueldos+=datosEntrada;
            if (datosEntrada>1000){cantidadMayoresDe1000+=1;}
        }
        System.out.println("Total de sueldos: " + sueldos);
        System.out.println("sueldos mayores a 1000: " +  cantidadMayoresDe1000);

        /*6int sueldoMaximo=0;
        System.out.println("Introduce un numero: ");
        datosEntrada=scanner.nextInt();
        int limiteContador=datosEntrada;
        for(c=0;c<limiteContador;c++)
        {
            System.out.println("Introduce un sueldo");
            datosEntrada=scanner.nextInt();
            if (sueldoMaximo<datosEntrada){sueldoMaximo=datosEntrada;}
        }
        System.out.println("El sueldo maximo es: " + sueldoMaximo);*/


        //BUCLES WHILE

        // 1.Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
        // negativo.

        int num=0;
       while (num>=0)
        {
            System.out.print("Ejercicio1: Introduce un numero: ");
            num=scanner.nextInt();
            if(num>=0){System.out.println("Cuadrado del numero introducido: "+ num*num);}
            else {System.out.println("Saliendo del bucle.......................");}
        }
        num=0;
        //2. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
        int contadorWhiles=0;
        while (num>=0)
        {
            System.out.print("Ejercicio2: Introduce un numero: ");
            num=scanner.nextInt();
            if(num>=0) {contadorWhiles++; System.out.println(" El numero es positivo.");}
            else {System.out.println("Saliendo del bucle......................");}
        }
        System.out.println("Se han introducido "+contadorWhiles+" numeros");
        num=0;

        //3. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
        //números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
        //cuando el usuario acierta.

        boolean acierto= false;
        int numeroParaAcertar=45;
        while (acierto==false)
        {
            System.out.print("Ejercicio 3: Introduce un número: ");
            num=scanner.nextInt();
            if (num==numeroParaAcertar)
            {
                System.out.println(" Numero acertado");
                acierto=true;
            }
            else
            {
                if (num>numeroParaAcertar)
                {
                    System.out.println(" es mayor");
                }
                else if (num<numeroParaAcertar)
                {
                    System.out.println(" es menor");
                }
            }

        }
        num=1;


        //4. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

        int numerosEjercicio4While=0;
        while (num!=0)
        {
            System.out.print("Ejercicio 4: Introduce un numero: ");
            num=scanner.nextInt();
            numerosEjercicio4While+=num;
        }
        System.out.println("La suma de todos los numeros introducidos es: " + numerosEjercicio4While);
























    }
}
