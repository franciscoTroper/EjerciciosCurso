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
        {setBotones("@",140,400,100,100,0);
        setBotones("0",200,400,100,100,1);
        setBotones("=",260,400,100,100,2);
        setBotones("+",320,400,100,100,3);

        setBotones("1",140,340,100,100,4);
        setBotones("2",200,340,100,100,5);
        setBotones("3",260,340,100,100,6);
        setBotones("-",320,340,100,100,7);

        setBotones("4",140,280,100,100,8);
        setBotones("5",200,280,100,100,9);
        setBotones("6",260,280,100,100,10);
        setBotones("/",320,280,100,100,11);

        setBotones("7",140,220,100,100,12);
        setBotones("8",200,220,100,100,13);
        setBotones("9",260,220,100,100,14);
        setBotones("x",320,220,100,100,15);
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
        pantallaOperaciones.setBounds(160,160,400,50);
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
