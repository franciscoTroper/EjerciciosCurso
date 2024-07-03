package EjerciciosFueraDelCurso.CalculadoraP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class Calculadora
{
    private String[][]numeros;
    private byte numIntroducido;
    private int contador,contador2;
    private JTextField pantalla;

    public Calculadora()
    {
       numeros=new String[2][99];
       contador=0;
       contador2=0;
       pantalla=new JTextField();
    }


    public void Escuchando(ActionEvent e,JTextField pantallaCalculadora)
    {
        pantalla=pantallaCalculadora;
        JButton botonEscuchante =(JButton) e.getSource();

        try
        {
            numIntroducido=Byte.parseByte(botonEscuchante.getText());
            if (numIntroducido>=0&&numIntroducido<=9) {GuardarNumeros(numIntroducido);}
        }
        catch (Exception v)
        {
            String funcion=botonEscuchante.getText();
            if (funcion.equals("+")){Sumar();}
            else if (funcion.equals("-")) {Restar();}
            else if (funcion.equals("x")) {Multiplicar();}
            else if (funcion.equals("/")) {Dividir();}
            else if (funcion.equals("@")) {System.exit(1);}
            else if (funcion.equals("=")) {Igual();}
        }
    }
    public void GuardarNumeros(byte num)
    {
        numeros[contador][contador2]=String.valueOf(numIntroducido);
        pantalla.setText(pantalla.getText()+numeros[contador][contador2]);
        contador2++;
    }
    public void Igual()
    {

    }
    public void Sumar()
    {
        contador++;
    }
    public void Restar()
    {
        contador++;
    }
    public void Multiplicar()
    {
        contador++;
    }
    public void Dividir()
    {
        contador++;
    }

}
