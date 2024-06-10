package Conceptos;

import java.util.Random;

public class NumerosAlAzar
{
    public static void main(String[] args)
    {
        Random numaleatorio=new Random();
        int num=numaleatorio.nextInt(101);
        System.out.println(num);
    }
}
