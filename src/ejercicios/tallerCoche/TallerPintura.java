package ejercicios.tallerCoche;

public class TallerPintura implements ITaller
{

    @Override
    public String Reparar(Coche coche) {
        return "Hay que pintar el ";
    }
}
