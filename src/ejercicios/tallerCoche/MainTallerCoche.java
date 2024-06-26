package ejercicios.tallerCoche;

public class MainTallerCoche
{
    public static void main(String[] args)
    {
        TallerMecanico tallerMecanico=new TallerMecanico();
        TallerPintura tallerPintura=new TallerPintura();

        Coche peugeot307=new Coche(" 3930 FRG","Peugeot 307");
        Coche FiatPunto=new Coche("9393 KLR","Fiat Punto");

        SeguroCoche seguroCoche = new SeguroCoche("IberCoche ", tallerMecanico);
        SeguroCoche seguroCoche1=new SeguroCoche("Cocheseguros ",tallerPintura);


        System.out.println(seguroCoche.reparar(peugeot307));
        System.out.println(seguroCoche1.reparar(FiatPunto));

    }
}
