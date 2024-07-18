package EjerciciosFueraDelCurso.CalculadoraP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Calculadora
{
    private String numeros="";
    private String numeros2="";
    private String resultado="";
    private byte numIntroducido;
    private JTextField pantalla=new JTextField();
    private boolean inicio=true;
    private byte operacion;
    private boolean queNumero=false;

    public Calculadora() {
    }


    public void Escuchando(ActionEvent e,JTextField pantallaCalculadora)
    {
        pantalla=pantallaCalculadora;
        JButton botonEscuchante =(JButton) e.getSource();
        try {numIntroducido=Byte.parseByte(botonEscuchante.getText()); introduciendo();}
        catch (Exception v) {
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
    public void introduciendo()
    {
        borrarCeroDeInicio();
        guardarNumeros();
        numeroGuardadoAPantalla();
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
    private void borrarCeroDeInicio() {
        if (inicio) {pantalla.setText("");inicio=false;}
    }
    private void guardarNumeros() {
        if (fqueNumero()){numeros=String.valueOf(numIntroducido)+numeros;}
        else {numeros2=String.valueOf(numIntroducido)+numeros2;}
    }
    private void numeroGuardadoAPantalla() {
        pantalla.setText(pantalla.getText()+numeros);
    }
    private boolean fqueNumero() {
        if (queNumero){return false;}
        else {return true;}
    }


}
