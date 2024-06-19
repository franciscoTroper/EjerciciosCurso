package JavaOrientadoObjetos;

public class Clase
{
    static public String [] mostrarDatos=new String[9];
    private String nombre;
    private String contenido;
    private String requisitos;
    private float duracion;
    private float precio;
    private int idcurso;
    private String modalidad;
    private String tipoCurso;

    public Clase()
    {

    }
    public Clase(int idcursoP,String nombreP,float precioP, float duracionP)
    {
        idcurso=idcursoP; mostrarDatos[5]="Id Curso: "+String.valueOf(idcursoP);
        nombre=nombreP; mostrarDatos[0]="Nombre: "+nombreP;
        precio=precioP; mostrarDatos[4]="Precio: "+String.valueOf(precioP);
        duracion=duracionP; mostrarDatos[3]="Duracion: "+String.valueOf(duracionP);
    }

    public  Clase[] Mostrarcurso(String tipoCurso, String modalidad)
    {

        return new Clase[6];
    }



    public void SolicitarCriterioDeBusqueda()
    {
        System.out.println("Mandamos llamar a la capa presentacion");
    }
    public String MostrarInformacion()
    {
        return "Id curso: " + idcurso +
                " nombre: "+ nombre +
                " requisitos: " + requisitos +
                " modalidad: "+ modalidad +
                " tipo de curso: " + tipoCurso;
    }

        //SETTERS

        public void setIdcurso (int idcursop)
        {
            idcurso = idcursop;
            mostrarDatos[5] = "Id Curso: " + String.valueOf(idcursop);
        }
        public void setNombre (String nombreP)
        {
            nombre = nombreP;
            mostrarDatos[0] = "Nombre: " + nombreP;
        }
        public void setRequisitos (String requisitosP)
        {
            requisitos = requisitosP;
            mostrarDatos[2]="Requisitos: "+requisitos;
        }
        public void setContenido (String contenidop)
        {
            contenido = contenidop;
            mostrarDatos[1]="Contenido: "+contenido;
        }
        public void setDuracion ( float duracionp)
        {
            duracion = duracionp;
            mostrarDatos[3] = "Duracion: " + String.valueOf(duracionp);
        }
        public void setPrecio ( float preciop)
        {
            precio = preciop;
            mostrarDatos[4] = "Precio: " + String.valueOf(preciop);
        }
        public void setModalidad (String modalidadp)
        {
            modalidad = modalidadp;
            mostrarDatos[6]="Modalidad: "+modalidad;
        }
        public void setTipoCurso (String tipoCursop)
        {
            tipoCurso = tipoCursop;
            mostrarDatos[7]="Tipo de curso: "+tipoCurso;
        }

        //GETTERS

            public String getNombre ()
            {
                return nombre;
            }
            public String getContenido ()
            {
                return contenido;
            }
            public String getRequisitos ()
            {
                return requisitos;
            }
            public String getModalidad ()
            {
                return modalidad;
            }
            public String getTipoCurso ()
            {
                return tipoCurso;
            }
            public float getDuracion ()
            {
                return duracion;
            }
            public float getPrecio ()
            {
                return precio;
            }
            public int getIdcurso ()
            {
                return idcurso;
            }


}
