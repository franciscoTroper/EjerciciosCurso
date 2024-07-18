package Socket.teoria.presentacion;

import Socket.teoria.Modelo.TiendaLibreria;

import java.io.IOException;

public class MainTiendaLibreria
{
    public static void main(String[] args) {
        TiendaLibreria tiendaLibreria=new TiendaLibreria();
        try {
            tiendaLibreria.programa();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
