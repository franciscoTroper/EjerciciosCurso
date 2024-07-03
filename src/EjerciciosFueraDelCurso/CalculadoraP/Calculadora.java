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
    private boolean inicio;

    public Calculadora()
    {
       numeros=new String[2][99];
       contador=0;
       contador2=0;
       pantalla=new JTextField();
       inicio=true;
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
            else if (funcion.equals(".")) {;}
            else if (funcion.equals("=")) {Igual();}
        }
    }
    public void GuardarNumeros(byte num)
    {
        if (inicio) {pantalla.setText("");inicio=false;}
        else if (numeros[contador][0].equals("0"))
        {
            pantalla.setText("");
            numeros[contador][0]=String.valueOf(numIntroducido);
        }

        numeros[contador][contador2]=String.valueOf(numIntroducido);//Guardando el numero introducido
        pantalla.setText(pantalla.getText()+numeros[contador][contador2]);//Mostrando el numero en pantalla
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
