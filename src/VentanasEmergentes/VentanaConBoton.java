package VentanasEmergentes;

import javax.swing.*;

public class VentanaConBoton
{
    JFrame ventana;
    JButton boton;
    public VentanaConBoton()
    {
        ventana=new JFrame();
        ventana.setSize(500,500);
        ventana.setVisible(true);
       // ventana.setLayout();
        boton=new JButton("Pulsar");
        boton.setBounds(100,100,100,100);
        ventana.add(boton);


    }

    public static void main(String[] args) {
        new VentanaConBoton();
    }
}
