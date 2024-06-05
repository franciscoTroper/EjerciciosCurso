public class CadenasString
{
    /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
        . Devolver la ultima posicion de la letra m
         */
    public static void main(String[] args)
    {

        String tigre = "Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println(tigre.toUpperCase());
        System.out.println(tigre.toLowerCase());
        System.out.println(tigre.substring(tigre.indexOf("Nunca"),"nunca".length()));
        System.out.println(tigre.substring(tigre.indexOf("mosca"),tigre.indexOf("mosca")+"mosca".length()));
        System.out.println(tigre.substring(tigre.indexOf("cabeza"),tigre.indexOf("cabeza")+"cabeza".length()));
        System.out.println(tigre.indexOf("m"));
        System.out.println(tigre.length());
        System.out.println(tigre.lastIndexOf("m"));

    }
}
