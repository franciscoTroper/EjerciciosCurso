package JavaOrientadoObjetos;

public class Usuario
{

    private String usuario,contraseña,nombre,direccion;


    public Usuario()
    {

    }
    public Usuario(String usuarioP,String contraseñaP,String nombreP,String direccionP)
    {
        usuario=usuarioP;
        contraseña=contraseñaP;
        nombre=nombreP;
        direccion=direccionP;
    }
    public void setUsuario(String usuarioP)
    {
        usuario=usuarioP;
    }
    public void setContraseña(String contraseñaP)
    {
        contraseña=contraseñaP;
    }
    public void setNombre(String nombreP)
    {
        nombre=nombreP;
    }
    public void setDireccion(String direccionP)
    {
        direccion=direccionP;
    }
    public String getUsuario()
    {
        return usuario;
    }
    public String getContraseña()
    {
        return contraseña;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getDireccion()
    {
        return direccion;
    }

}
