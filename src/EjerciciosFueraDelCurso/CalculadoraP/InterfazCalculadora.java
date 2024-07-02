package EjerciciosFueraDelCurso.CalculadoraP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfazCalculadora
{
    JFrame ventana;
    JButton[] botones;
    JTextField pantallaOperaciones;
    Calculadora calculadora;
    final JButton[] botonEscuchante = new JButton[1];
    String[]numeros;

    public InterfazCalculadora()
    {
        ventana =new JFrame("Super Calculadora");
        botones=new JButton[20];
        pantallaOperaciones =new JTextField("0");
        numeros=new String[1];
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVentana();
        {setBotones("@",140,400,50,50,0);
        setBotones("0",200,400,50,50,1);
        setBotones("=",260,400,50,50,2);
        setBotones("+",320,400,50,50,3);

        setBotones("1",140,340,50,50,4);
        setBotones("2",200,340,50,50,5);
        setBotones("3",260,340,50,50,6);
        setBotones("-",320,340,50,50,7);

        setBotones("4",140,280,50,50,8);
        setBotones("5",200,280,50,50,9);
        setBotones("6",260,280,50,50,10);
        setBotones("/",320,280,50,50,11);

        setBotones("7",140,220,50,50,12);
        setBotones("8",200,220,50,50,13);
        setBotones("9",260,220,50,50,14);
        setBotones("x",320,220,50,50,15);
        AddBotones();}//Agregando botones
        EscucharBotones();//Escuchando botones
        setPanallaOperaciones();
        calculadora=new Calculadora();
        ventana.setVisible(true);

    }
    private void setVentana()
    {
        ventana.setLayout(null);
        ventana.setSize(700,700);
        ventana.setLocationRelativeTo(null);

    }
    private void setBotones(String texto,int x,int y,int width,int height,int index)
    {
        Font font = new Font("Arial", Font.PLAIN, 26);
        botones[index]=new JButton(texto);
        botones[index].setFont(font);
        botones[index].setBounds(x,y,width,height);
        ventana.add(botones[index]);
    }
    private void AddBotones()
    {
        for (int a=0;a<botones.length;a++)
        {
            try
            {
                ventana.add(botones[a]);
            }
            catch (Exception e){}

        }
    }
    private void setPanallaOperaciones()
    {
        Font font = new Font("Arial", Font.PLAIN, 26);
        pantallaOperaciones.setBackground(Color.BLACK);
        pantallaOperaciones.setForeground(Color.YELLOW);
        pantallaOperaciones.setBounds(160,160,200,50);
        pantallaOperaciones.setFont(font);
        pantallaOperaciones.setBorder(BorderFactory.createCompoundBorder(pantallaOperaciones.getBorder(),BorderFactory.createEmptyBorder(1,10,1,10)));
        pantallaOperaciones.setEditable(false);
        pantallaOperaciones.setHorizontalAlignment(JTextField.RIGHT);
        ventana.add(pantallaOperaciones);
    }
    private void EscucharBotones()
    {

        for (int a=0;a< botones.length;a++)
        {
            try {
                botones[a].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                     botonEscuchante[0] =(JButton) e.getSource();

                     try
                     {

                         byte numIntroducido=Byte.parseByte(botonEscuchante[0].getText());
                         if ( numIntroducido>=0&&numIntroducido<=9) {calculadora.GuardarNumeros(numIntroducido);}
                     }
                     catch (Exception v)
                     {
                         String funcion=botonEscuchante[0].getText();
                        if (funcion.equals("+")){calculadora.Sumar();}
                        else if (funcion.equals("-")) {calculadora.Restar();}
                        else if (funcion.equals("x")) {calculadora.Multiplicar();}
                        else if (funcion.equals("/")) {calculadora.Dividir();}
                        else if (funcion.equals("@")) {System.exit(1);}
                        else if (funcion.equals("=")) {calculadora.Igual();}
                     }




                    }
                });
            }catch (Exception e){}

        }
    }

}
