package herencia.ejercicios.Mains;

import herencia.ejercicios.Animal;

public class Main_Animal
{
    public static void main(String[] args)
    {
        Animal perro=new Animal(4,false,"mediano");
        Animal pez =new Animal(0,false,"pequeño");
        Animal cocodrilo = new Animal(4,false,"grande");

        perro.setNumExtremidades(5);
        perro.setVuela(true);
        perro.setTamaño("grande");
        System.out.println(perro.getNumExtremidades());
        System.out.println(perro.getTamaño());
        System.out.println(perro.getVuela());
        pez.setNumExtremidades(2);
        pez.setVuela(true);
        pez.setTamaño("grande");
        System.out.println(pez.getNumExtremidades());
        System.out.println(pez.getTamaño());
        System.out.println(pez.getVuela());
        cocodrilo.setNumExtremidades(5);
        cocodrilo.setVuela(true);
        cocodrilo.setTamaño("grande");
        System.out.println(cocodrilo.getNumExtremidades());
        System.out.println(cocodrilo.getTamaño());
        System.out.println(cocodrilo.getVuela());


    }
}
