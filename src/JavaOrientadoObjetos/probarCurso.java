package JavaOrientadoObjetos;

public class probarCurso
{
    public static void main(String[] args)
    {
       Clase clase= new Clase(1,"ProgramacionEnJava",1_500.00f,60f);
        clase.setRequisitos("ESO");
       for (String elemento:Clase.mostrarDatos)
       {
           System.out.println(elemento);
       }
       Usuario usuario=new Usuario("Frak","1234","Fransisco","Calle alava n10 6f");
        System.out.println(usuario.getUsuario());
        System.out.println(usuario.getContraseña());
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getDireccion());



    }
}
