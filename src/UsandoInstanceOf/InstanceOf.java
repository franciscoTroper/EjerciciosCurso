package UsandoInstanceOf;
public class InstanceOf
{
    public InstanceOf() {
    }
}

class Main
{
    public static void main(String[] args)
    {
        InstanceOf padre=new hijoInstanceOF();
        if (padre instanceof hijo2InstandeOf)
        {
            System.out.println("Si");
        }
        else {
            System.out.println("No");
        }
    }
}

class hijoInstanceOF extends InstanceOf
{

}
class hijo2InstandeOf extends InstanceOf
{

}
