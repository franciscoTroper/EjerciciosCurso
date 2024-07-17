package EjerciciosFueraDelCurso.CalculadoraP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora
{
    private List<String>numeros=new ArrayList<>();
    private List<String>numeros2=new ArrayList<>();
    private byte numIntroducido;
    private int contador=0,contador2=0;
    private JTextField pantalla=new JTextField();
    private boolean inicio=true;
    private byte operacion;

    public Calculadora() {
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
            contador++;
            pantalla.setText("0"); inicio=true;
            String funcion=botonEscuchante.getText();
            if (funcion.equals("+")){operacion=1;Sumar();}
            else if (funcion.equals("-")) {operacion=2;Restar();}
            else if (funcion.equals("x")) {operacion=3;Multiplicar();}
            else if (funcion.equals("/")) {operacion=4;Dividir();}
            else if (funcion.equals(".")) {;}
            else if (funcion.equals("=")) {Igual();}
        }
    }
    public void GuardarNumeros(byte num)
    {
        if (inicio) {pantalla.setText("");inicio=false;}
        else if (numeros.get(0).equals("0"))
        {
            pantalla.setText("");
            numeros.add(String.valueOf(numIntroducido));
        }

        numeros.add(String.valueOf(numIntroducido));//Guardando el numero introducido
        pantalla.setText(pantalla.getText()+numeros.get(0));//Mostrando el numero en pantalla
        contador2++;
    }
    public void Igual()
    {

    }
    public void Sumar()
    {

    }
    public void Restar()
    {

    }
    public void Multiplicar()
    {

    }
    public void Dividir()
    {

    }

}
