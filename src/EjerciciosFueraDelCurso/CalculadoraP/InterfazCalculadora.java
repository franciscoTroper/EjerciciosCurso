package EjerciciosFueraDelCurso.CalculadoraP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfazCalculadora
{
    private JFrame ventana;
    private JButton[] botones;
    private JTextField pantallaOperaciones;
    private Calculadora calculadora;
    private final JButton[] botonEscuchante = new JButton[1];

    public InterfazCalculadora()
    {
        ventana =new JFrame("Super Calculadora");
        botones=new JButton[20];
        pantallaOperaciones =new JTextField("0");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVentana();
        {setBotones(".",225,445,75,75,0);
        setBotones("0",300,445,75,75,1);
        setBotones("=",375,445,75,75,2);
        setBotones("+",450,445,75,75,3);

        setBotones("1",225,370,75,75,4);
        setBotones("2",300,370,75,75,5);
        setBotones("3",375,370,75,75,6);
        setBotones("-",450,370,75,75,7);

        setBotones("4",225,295,75,75,8);
        setBotones("5",300,295,75,75,9);
        setBotones("6",375,295,75,75,10);
        setBotones("/",450,295,75,75,11);

        setBotones("7",225,220,75,75,12);
        setBotones("8",300,220,75,75,13);
        setBotones("9",375,220,75,75,14);
        setBotones("x",450,220,75,75,15);
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
        pantallaOperaciones.setBounds(225,160,300,50);
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
                botones[a].addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        calculadora.Escuchando(e,pantallaOperaciones);
                    }
                });
            }catch (Exception e){}

        }
    }

}
